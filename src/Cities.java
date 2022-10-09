public class Cities
{
    public static void main(String[] args)
    {
        City city1 = new City();
        City city2 = new City("Chernivtsi","Ukraine","153 км²","264.298");
        City city3 = new City();
        city3.setName("Lviv");
        city3.setCountry("Ukraine");
        city3.setArea("149 км²");
        city3.setNumber_inhabitants("717.273");

        System.out.println(
                "\n\n###Information about first city###\n\n" +
                        "Name = " + city1.getName() +
                        "\nCountry = " + city1.getCountry() +
                        "\nArea = " + city1.getArea() +
                        "\nNumber of inhabitants = " + city1.getNumber_inhabitants()
        );

        System.out.println(
                "\n\n###Information about second city###\n\n" +
                        "Name = " + city2.getName() +
                        "\nCountry = " + city2.getCountry() +
                        "\nArea = " + city2.getArea() +
                        "\nNumber of inhabitants = " + city2.getNumber_inhabitants()
        );

        System.out.println(
                "\n\n###Information about third city###\n\n" +
                        "Name = " + city3.getName() +
                        "\nCountry = " + city3.getCountry() +
                        "\nArea = " + city3.getArea() +
                        "\nNumber of inhabitants = " + city3.getNumber_inhabitants()
        );
    }
}


class City
{
   private String name;
   private String country;
   private String area;
   private String number_inhabitants;

   public void setName(String name)
   {
       this.name = name;
   }

   public String getName()
   {
       return name;
   }

   public void setCountry(String country)
   {
       this.country = country;
   }

   public String getCountry()
   {
       return country;
   }

   public void setArea(String area)
   {
       this.area = area;
   }

   public String getArea()
   {
       return area;
   }

   public void setNumber_inhabitants(String number_inhabitants)
   {
       this.number_inhabitants = number_inhabitants;
   }

   public String getNumber_inhabitants()
   {
       return number_inhabitants;
   }

   public City()
   {
       this.name = "Kiev";
       this.country = "Ukraine";
       this.area = "839 км²";
       this.number_inhabitants = "2.952.301";
       System.out.println("\n<<You create new city with constructor>>");
   }

   public City(String name,String country,String area,String number_inhabitants)
   {
       this.name =  name;
       this.country = country;
       this.area = area;
       this.number_inhabitants = number_inhabitants;
   }
}