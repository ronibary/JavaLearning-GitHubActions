package learnCoreJava.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;


class Person {

    String name;
    int age;
    double score;

    public Person(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "PersonObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}


public class StreamReduceOnListOfObjects {

    public static void main(String[] args) {

        var people = List.of(
                new Person("Jack", 34, 12.1),
                new Person("Donald", 47, 89.3),
                new Person("Chuck", 56, 11.1),
                new Person("Lee", 38, 78.3)
        );


        // find the person with biggest age
//        var person = people.stream()
//                .reduce((p1,p2) -> {
//                    if(p1.age > p2.age)
//                        return p1;
//                    else
//                        return p2;
//                });

//        System.out.println(person);


        // using binaryOperator to find the max between two Person object
        // the comparator use the comparingInt and the age to compare
        // e.g find the minimum age
        var  comparatorP = Comparator.<Person>comparingInt(p -> p.age);
        var binaryOperator = BinaryOperator.<Person>minBy(comparatorP);

        people.stream()
                .reduce(binaryOperator)
                .ifPresent(p -> System.out.println("person with smallest age: " + p));


        // advantage using comparator and binary operator
        // is when we want to tweak the filter and make another query
        // we can do it easy

        // e.g: find the max score
        comparatorP = Comparator.<Person>comparingDouble(p -> p.score);
        binaryOperator = BinaryOperator.<Person>maxBy(comparatorP);

        people.stream()
                .reduce(binaryOperator)
                .ifPresent(p -> System.out.println("person with biggest score: " + p));


    }

}
