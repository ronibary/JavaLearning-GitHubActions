package learnOOP;

public class Animal {

    int age;
    double weight;

    public Animal() {
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void info(){
        System.out.println("An animal ...");
    }

    void eat(String food){
        System.out.println("Eating " + food + " ...");
    }

    void move(){
        System.out.println("moving ...");
    }

    void reproduce(){
        System.out.println("reproducing ...");
    }

}
