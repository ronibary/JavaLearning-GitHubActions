package learnOOP;

public class Dog extends Animal {
    String furColor;
    String  petName;

    public Dog() {

       super(7,11.4); // call the super (parent class constructor)
        this.furColor = "white";
        this.petName = "Max";
        System.out.println("Dog created ...");
    }

    public Dog(int age, double weight, String furColor, String petName) {
        super(age, weight); // call the Animal constructor with the age and weight
        this.furColor = furColor;
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "furColor='" + furColor + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }

    public void bark(){
        System.out.println("Barking ...");
    }

    @Override
    public void info(){
        super.info(); // this call the info on the parent (super class)
        System.out.println("A Dog .");
    }

    @Override
    void reproduce() {
        System.out.println("Dog reproducing ...");
    }

    @Override
    void eat(String food) {
        super.eat(food);
        System.out.println("Dog likes food :)");
    }
}
