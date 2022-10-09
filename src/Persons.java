public class Persons
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person("Bob", "Johnson", "England", 19, 173);
        Person person3 = new Person();
        person3.setFirst_name("Wyatt");
        person3.setSecond_name("Wilson");
        person3.setCountry("England");
        person3.setAge(33);
        person3.setHeight(184);

        System.out.println(
                "\n\n<<Information about first person>>\n\n" +
                        "First Name = " + person1.getFirst_name() +
                        "\nSecond name = " + person1.getSecond_name() +
                        "\nCounty = " + person1.getCountry() +
                        "\nAge = " + person1.getAge() +
                        "\nHeight = " + person1.getHeight() +
                        "\nPerfect weight = " + person1.perfectWeight(person1.getAge(),person1.getHeight())
        );
        System.out.println(
                "\n\n<<Information about second person>>\n\n" +
                        "First Name = " + person2.getFirst_name() +
                        "\nSecond name = " + person2.getSecond_name() +
                        "\nCounty = " + person2.getCountry() +
                        "\nAge = " + person2.getAge() +
                        "\nHeight = " + person2.getHeight() +
                        "\nPerfect weight = " + person2.perfectWeight(person2.getAge(),person2.getHeight())
        );
        System.out.println(
                "\n\n<<Information about third person>>\n\n" +
                        "First Name = " + person3.getFirst_name() +
                        "\nSecond name = " + person3.getSecond_name() +
                        "\nCounty = " + person3.getCountry() +
                        "\nAge = " + person3.getAge() +
                        "\nHeight = " + person3.getHeight() +
                        "\nPerfect weight = " + person3.perfectWeight(person3.getAge(),person3.getHeight())
        );
    }
}


class Person
{
    private String first_name;
    private String second_name;
    private String country;
    private int age;
    private int height;

    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

    public String getFirst_name()
    {
        return first_name;
    }

    public void setSecond_name(String second_name)
    {
        this.second_name = second_name;
    }

    public String getSecond_name()
    {
        return second_name;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountry()
    {
        return country;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    public Person()
    {
        this.first_name = "Vadim";
        this.second_name = "Teslitskiy";
        this.country = "Ukraine";
        this.age = 18;
        this.height = 178;
        System.out.println("\n<<You create new human with constructor>>");
    }

    public Person(String first_name,String second_name,String country,int age,int height)
    {
        this.first_name = first_name;
        this.second_name = second_name;
        this.country = country;
        this.age = age;
        this.height =  height;
    }

    public double perfectWeight(int age,int height)
    {
        return 50+0.75*(height-150)+(age-20)/4;
    }

}