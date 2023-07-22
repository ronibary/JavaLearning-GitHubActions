package learnCoreJava.Streams;

import java.util.List;

public class StreamMatchOperations {


    /*
     Match on a stream - all , any match

     check if condition match on all the stream or any element of the stream match the condition

     */

    public static void main(String[] args) {

        var people = List.of(
                new Person("Jack", 34, 12.1),
                new Person("Donald", 47, 89.3),
                new Person("Chuck", 56, 11.1),
                new Person("Lee", 38, 78.3)
        );

        var res = people.stream().allMatch(p -> p.age >20);
        System.out.println("all people above age 20: " + res);

        res = people.stream().anyMatch(p -> p.score > 80);
        System.out.println("there is score above 80 : " + res);

        res = people.stream().noneMatch(p -> p.score > 100);
        System.out.println("there is no match for score above 100 : " + res);


        // we can filter + match operation together

        var result = people.stream()
                .filter(person -> person.age > 40)
                .anyMatch(p -> p.score > 70);

        System.out.println("Fine the match --> all people above 40, and score above 70 : " + result);




    }
}
