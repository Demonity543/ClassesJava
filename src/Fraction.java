public class Fraction {

    private int _numerator;

    private int _denominator;

    public Fraction(int numerator, int denominator, boolean wantToReduce) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator is zero.");
        }
        if (_numerator == 0) {
            this._numerator = 0;
            this._denominator = 1;
        } else {
            this._numerator = numerator;
            this._denominator = denominator;
        }
        if (_denominator < 0) {
            this._numerator = -1 * this._numerator;
            this._denominator = -1 * this._denominator;
        }
        if (wantToReduce == true)
            this.reduce();
    }

    private int gcd(int a, int b) {
        if (a < 0)
            a = -1 * a;
        if (b < 0)
            b = -1 * b;
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public Fraction reduce() {
        int gcd = gcd(_numerator, _denominator);
        _numerator = _numerator / gcd;
        _denominator = _denominator / gcd;
        return this;
    }

    public static Fraction add(Fraction f1, Fraction f2, boolean w) {
        return new Fraction(f1._numerator * f2._denominator + f2._numerator * f1._denominator,
                f1._denominator * f2._denominator, w);
    }

    public static Fraction sub(Fraction f1, Fraction f2, boolean w) {
        return new Fraction(f1._numerator * f2._denominator - f2._numerator * f1._denominator,
                f1._denominator * f2._denominator, w);
    }

    public static Fraction mul(Fraction f1, Fraction f2, boolean w) {
        return new Fraction(f1._numerator * f2._numerator, f1._denominator * f2._denominator, w);
    }

    public static Fraction div(Fraction f1, Fraction f2, boolean w) {
        return new Fraction(f1._numerator * f2._denominator, f1._denominator * f2._numerator, w);
    }

}