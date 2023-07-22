package learnOOP;

public class TestCitizen {
    public static void main(String[] args) {

        Country rus = new Country();
        rus.countryName = "Russia";
        rus.countryPresident = "Putin";

        var c1 = new CitizenPerson("Sandra",rus);
        System.out.println(c1.country.countryName + " president: " + c1.country.countryPresident);

        // create inner class Citizen that exists inside the Country class
        //Country.Citizen citizen = rus.new Citizen();
        //citizen.name = "Mike";

        // create Citizen object using the Dot notation , Citizen is like any other
        // static method in a class
        Country.Citizen c = new Country.Citizen();
        c.name = "Jhon";
        c.country = rus;

        System.out.println(c.country.countryName);


    }
}
