package learnCoreJava.Streams;


import learnCoreJava.CollectionMaps.CollectionsClassSample;

import java.util.List;
import java.util.stream.Collectors;

class PersonObj {

    int id;
    String name;
    int age;
    double score;

    public PersonObj(int id,String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "PersonObj{" +
                "Id=" + id +
                ",name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

public class StreamCollectorsSample {


    /*

    Creating a list or Set using the Collectors toList / toSet methods

     */

    public static void main(String[] args) {

        var people = List.of(
                new PersonObj(100,"Jack", 34, 12.1),
                new PersonObj(200,"Donald", 47, 89.3),
                new PersonObj(300,"Chuck", 56, 11.1),
                new PersonObj(400,"Lee", 34, 78.3),
                new PersonObj(500,"Jonas", 32, 65.9),
                new PersonObj(600,"Miki", 45, 82.3)
        );

        var people2 = people.stream()
            .filter(p -> p.age > 40)
            .collect(Collectors.toList());

        // the final result is List made up from the stream after doing the filter

        System.out.println(people2);



        // to create map of stream of people's age
        // without duplicate results -> we need to convert the stream to "Set"

        var people3 = people.stream()
                .map(p -> p.age)
                .collect(Collectors.toSet());

        System.out.println("the new list without duplication based on age: ");
        System.out.println(people3);



        /////////////////////////////////////////////////////////////
        // Collectors joining - use to join elements from a stream

        // e.g: join all the names from the list of people with comma separator

        var result5 = people.stream()
                .map(p -> p.name)
                .collect(Collectors.joining(", ","The names are: ","."));

        System.out.println(result5);


        ///////////////////////////////////////////////////////
        // Collectors to map

        // create map from the stream of people , map[id,score]
        var resultMap = people.stream()
                .collect(Collectors.toMap(p -> p.id, p -> p.score));

        System.out.println(resultMap);


        ////////////////////////////////////////////////////////////////
        // Collectors - PartitioningBy

        // supply a predicate (filter) and the results will be 2 Maps based on the stream
        // first entry of the Map entry with Key = "true" and the list of elements that match the the filter
        // second entry of the Map with key = "false" -> with the liust of values that not match the filter


        var resultPartitioningMap = people.stream()
                .collect(Collectors.partitioningBy(p -> p.score > 50));

        System.out.println("The list for the Map with key = true --->  ");
        System.out.println(resultPartitioningMap.get(true));

        // the first element in the "true" list
        //System.out.println(resultPartitioningMap.get(true).get(0));

        System.out.println("size of the map: " + resultPartitioningMap.size());


        ////////////////////////////////////////////////////////////////
        // Collectors - PartitioningBy with two arguments

        // can specify on second argument (toList , toSet , Counting() ,summarizingDouble  )



        var res1 = people.stream()
                .collect(Collectors.partitioningBy(
                        p -> p.score > 50,
                        Collectors.toSet()
                ));

        System.out.println("SET of  scores above 50 : " + res1.get(true));

        var res2 = people.stream()
                .collect(Collectors.partitioningBy(
                        p -> p.age > 45,
                        Collectors.toList()
                ));

        System.out.println("List of people's age above 45 : " + res2.get(true));


        var res3 = people.stream()
                .collect(Collectors.partitioningBy(
                   p -> p.score > 50,
                   Collectors.counting()
                ));

        System.out.println("number of scores above 50 : " + res3.get(true));

        var res4 = people.stream()
                .collect(Collectors.partitioningBy(
                        p -> p.score > 50,
                        Collectors.summarizingDouble(p -> p.score)
                ));

        System.out.println("Summarizing score:  : " + res4.get(true));
        System.out.println("Summarizing  Average score:  : " + res4.get(true).getAverage());
        System.out.println("Summarizing  Max score:  : " + res4.get(true).getMax());


        ////////////////////////////////////////////////////////////////
        // Collectors - groupingBy
        //
        // return a map that is the key grouped by

        // collect data grouped by a field

        //e.g: group by age -> all the person's with the age = 34
        // this return a map

        var res5 = people.stream()
                .collect(Collectors.groupingBy(p -> p.age));

        System.out.println("Persons grouped by age (where age= 32) : => " );
        // the key is the age e.g  age = 34
        System.out.println(res5.get(34));



    }





}
