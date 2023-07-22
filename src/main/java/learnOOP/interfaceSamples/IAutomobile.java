package learnOOP.interfaceSamples;

public interface IAutomobile {

    default void startEngine(){
        setUp();
        System.out.println("Engine Starting ...");
    }


    default void stopEngine(){
        setUp();
        System.out.println("Engine Stopping...");
    }

    static void setUp(){
        System.out.println("Toggle Breaks...");
        System.out.println("Toggle engine pump...");
        System.out.println("Toggle Hydraulics...");
    }

    // define default implementation in the interface so other classes that implements it
    // will not have to implement this method (java 8 and above new feature)
    default void horn(){
        System.out.println("Horn ...");
    }

    default void fuelCheck(){
        System.out.println("Check fuel ...");
    }
}
