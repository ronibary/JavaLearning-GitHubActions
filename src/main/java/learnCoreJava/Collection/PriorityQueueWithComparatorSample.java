package learnCoreJava.Collection;


import java.util.Comparator;
import java.util.PriorityQueue;

import static java.util.Comparator.comparingInt;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


/*
exmaple for PriorityQueue that hold Person objects so we need a comparator to tell
how to sort and get the smallest Person in the Queue
 */
public class PriorityQueueWithComparatorSample {

    public static void main(String[] args) {

        // passing predefined Comparator lambda expression to compare the person's age
        // (other way for solution would be to implement Comparator between two Persons)
        var priorityQ = new PriorityQueue<Person>(Comparator.comparingInt(p -> p.age));

        priorityQ.add(new Person("Jhon",29));
        priorityQ.add(new Person("Mike",55));
        priorityQ.add(new Person("Shone",25));
        priorityQ.add(new Person("Tommy",19));

        var firstPerson = priorityQ.peek();

        System.out.println(firstPerson);

    }

}
