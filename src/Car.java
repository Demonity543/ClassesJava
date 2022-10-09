import java.sql.Date;

public class Car {
    private String _nameCar;
    private String _manufacturer;
    private Date _releaseDate;
    private float _engineCapacity;

    public String getNameCar() {
        return _nameCar;
    }

    public String getManufacturer() {
        return _manufacturer;
    }

    public String getReleaseDate() {
        return _releaseDate.toLocalDate().toString();
    }

    public String getEngineCapacity() {
        return Float.toString(_engineCapacity);
    }

    public void setNameCar(String newNameCar) {
        _nameCar = newNameCar;
    }

    public void setManufacture(String newManufacture) {
        _manufacturer = newManufacture;
    }

    public void setReleaseDate(Date newDate) {
        _releaseDate = newDate;
    }

    public Car(String name, String manufacture, Date releaseDate, float engineCapacity) {
        _nameCar = name;
        _manufacturer = manufacture;
        _releaseDate = releaseDate;
        _engineCapacity = engineCapacity;
    }

    public String getCar() {
        return "\nName: " + getNameCar() + "\nManufacture: " + getManufacturer() + "\nRelease date: " + getReleaseDate()
                + "\nEngine capacity: " + getEngineCapacity();
    }
}