package learnOOP;

public class Country {
    String countryName;
    String countryPresident;

    // static class inside a class
    static public class Citizen {
        String name;
        Country country;
    }
}
