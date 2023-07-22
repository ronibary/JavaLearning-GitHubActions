package learnOOP;

/*
    test Tiger object extend an abstract class AbstractAnimal
 */
public class TestTigerAbstractExample {

    public static void main(String[] args) {

        //AbstractAnimal animal = new Tiger();
        Tiger tigerAnimal = new Tiger();

        tigerAnimal.info();
        tigerAnimal.makingSound();
        tigerAnimal.move();
        tigerAnimal.waggleTail();
        //((Tiger) animal).waggleTail();

        // creating anonymous object from abstract class
        AbstractAnimal animal = new AbstractAnimal() {
            @Override
            public void info() {
                System.out.println("A tiger cat");
            }

            @Override
            public void makingSound() {
                System.out.println("Wooooooow ...");
            }
        };

        animal.makingSound();
        animal.info();

    }


}
