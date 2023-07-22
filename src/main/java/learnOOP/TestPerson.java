package learnOOP;

public class TestPerson{

    public static void main(String[] args) {

        Person p1 = new Person();

        Person.score = 8;

        System.out.println(Person.score);

        Person p2 = new Person("miki",45);
        System.out.println(p2.name + " age: " + p2.age);

        // passing object to method by reference
        Person.clac(p2);

    }

}
