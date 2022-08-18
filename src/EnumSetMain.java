import java.util.EnumSet;

public class EnumSetMain {
    public static void main(String[] args) {
        EnumSet<Country> asiaCountres = EnumSet.of(Country.ARMENIA, Country.INDIA, Country.KAZAKHSTAN);
        String nameCountry = "India";
        Country current = Country.valueOf(nameCountry.toUpperCase());
        if (asiaCountres.contains(current)){
            System.out.println("Asia Action");
        }
        asiaCountres.forEach(country -> country.grow(1));
        System.out.println( asiaCountres);
    }
}


enum Country{
    ARMENIA(3,28_470),
    BELARUS(9, 202_910),
    INDIA(1_370, 2_973_190),
    KAZAKHSTAN(18, 2_699_700),
    POLAND (38, 306_230),
    UKRAINE(43, 579_320);
    private int population; // per bln
    private int landAArea; // per km2

    Country(int population, int landAArea) {
        this.population = population;
        this.landAArea = landAArea;
    }
    public void grow (int additionalPopulation){
        population += additionalPopulation;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getLandAArea() {
        return landAArea;
    }

    public void setLandAArea(int landAArea) {
        this.landAArea = landAArea;
    }
}