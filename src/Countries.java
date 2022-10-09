public class Countries {
    public static void main(String[] args) {
        Country country1 = new Country();
        Country country2 = new Country("United Kingdom", 68692129, 44);
        Country country3 = new Country();
        country3.setName("United States");
        country3.setPopulation(335390450);
        country3.setCodePhoneNumber(1);

        System.out.println(
                "\n\n###Information about first country###\n\n" +
                        "Name = " + country1.getName() +
                        "\nPopulation = " + country1.getPopulation() +
                        "\nCode Phone Number = +" + country1.getCodePhoneNumber()
        );

        System.out.println(
                "\n\n###Information about second country###\n\n" +
                        "Name = " + country2.getName() +
                        "\nPopulation = " + country2.getPopulation() +
                        "\nCode Phone Number = +" + country2.getCodePhoneNumber()
        );

        System.out.println(
                "\n\n###Information about third country###\n\n" +
                        "Name = " + country3.getName() +
                        "\nPopulation = " + country3.getPopulation() +
                        "\nCode Phone Number = +" + country3.getCodePhoneNumber()
        );
    }
}
class Country{
    private String name;
    private long population;
    private int codePhoneNumber;

    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public void setPopulation(long population){this.population = population;}

    public long getPopulation(){return population;}

    public void setCodePhoneNumber(int codePhoneNumber){this.codePhoneNumber = codePhoneNumber;}

    public int getCodePhoneNumber(){return codePhoneNumber;}

    public Country(){
        this.name = "Ukraine";
        this.population = 41167335;
        this.codePhoneNumber = 380;
    }

    public Country(String name,long population,int codePhoneNumber){
        this.name = name;
        this.population = population;
        this.codePhoneNumber = codePhoneNumber;
    }

}