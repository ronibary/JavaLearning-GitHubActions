package learnOOP;

public class Cat extends Animal {

    public void meow(){
        System.out.println("Meowing ...");
    }

    @Override
    public void info() {
        System.out.println("A Cat .");
    }
}
