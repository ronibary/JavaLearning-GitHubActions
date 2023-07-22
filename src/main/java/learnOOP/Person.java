package learnOOP;

public class Person {
    String name;
    int age;

    public static int score = 0 ;

    {
        System.out.println("initialization  block called ...");
    }


    // we can use the static block to initialize the first time the object created it's static elements
    static
    {
        // init static member variable of the class
        score = 1000;
        System.out.println("static block called ...");
    }

    public Person() {
        System.out.println("constructor called , person created");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("constructor called , person created");
    }

    void talk(){

        // class inside a method
        class Office{
            int salary;
            String company;
        }

        var office = new Office();
        office.salary = 10000;
        office.company = "Company";

        System.out.println("Hello");
    }


    public static void clac(Person p)
    {
        if (p.age > 18)
        {
            System.out.println(p.name + " is qualified");
        }
        else
        {
            System.out.println(p.name + " is not qualified");
        }
    }
}


