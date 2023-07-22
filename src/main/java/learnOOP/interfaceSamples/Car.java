package learnOOP.interfaceSamples;

public class Car implements IAutomobile {
//    @Override
//    public void startEngine() {
//        System.out.println("Starting engine ...");
//    }
//
//    @Override
//    public void stopEngine() {
//        System.out.println("Stop engine ...");
//    }

    @Override
    public void horn() {
        System.out.println("Car Horn is strong ...");
    }
}
