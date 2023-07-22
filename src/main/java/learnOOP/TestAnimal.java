package learnOOP;

public class TestAnimal {

    public static void main(String[] args) {
//        var animalOne = new Animal(7,17.8);
//
//        animalOne.eat("meat");

        Dog dogOne = new Dog();
        dogOne.bark();
        dogOne.eat("Bone");
        dogOne.info();
        dogOne.reproduce();
        System.out.println(dogOne.weight);

        Cat catOne = new Cat();
        catOne.meow();
        catOne.reproduce();
        catOne.info();

        //  Cat cat = new Dog();  // not allowed to reference Cat type with Dog type

        // you can use the parent class reference variable to create both ( Cat / or Dog )
        Animal dogTwo = new Dog();
        dogTwo.info();

        // this will not work because reference variable is of type Animal
        // you can only access methods in both sub class and super class
        //dogTwo.bark(); // will not work

        // this is working because of the casting to the child class Dog
        ((Dog) dogTwo).bark();

    }

}
