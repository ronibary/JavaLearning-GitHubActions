package learnOOP.interfaceSamples;

public class TestCar {

    public static void main(String[] args) {

        IAutomobile car = new Car();
        car.startEngine();
        car.stopEngine();
        car.fuelCheck();

    }

}
