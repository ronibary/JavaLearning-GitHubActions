package learnOOP;

public class Tiger extends AbstractAnimal {

    @Override
    public void info() {
        System.out.println("A Tiger .");
    }

    @Override
    public void makingSound(){
        System.out.println("making sound Arrrrrrrrr ...");
    }


    void waggleTail() {
        System.out.println("Waggling ...");
    }
}
