package learnCoreJava.Streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;




public class StreamCollectSample {

    /*
        Collect - use to return a collection from a stream of element

        e.g: you can filter a stream and return an ArrayList or HashSet with the matching elements
     */


    public static void main(String[] args) {


        var list = List.of(2,5,1,10,3,9,2,10,11,30,12);

        // e.g: using Collect to return ArrayList of <Integer>

        var result = list.stream()
                .filter(i -> i % 2 == 0)  // filter only even elements
                .collect(
                        () -> new ArrayList<Integer>(),
                        (listofInt, intValue) -> listofInt.add(intValue),
                        (l1,l2) -> l1.addAll(l2)
                );

        System.out.println(result);


        // same but using method reference
        var result3 = list.stream()
                .filter(i -> i % 2 == 0)  // filter only even elements
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );

        System.out.println(result3);




        // Collect into HashSet to eliminate duplicates elements

        var result2 = list.stream()
                .filter(i -> i % 2 == 0)  // filter only even elements
                .collect(
                        () -> new HashSet<Integer>(),
                        (hashSet, intValue) -> hashSet.add(intValue),
                        (hs1,hs2) -> hs1.addAll(hs2)
                );

        System.out.println("the list filter without duplicates: ");
        System.out.println(result2);

        System.out.println("the list filter without duplicates using method reference: ");
        var result4 = list.stream()
                .filter(i -> i % 2 == 0)  // filter only even elements
                .collect(
                        HashSet::new,
                        HashSet::add,
                        HashSet::addAll
                );

        System.out.println(result4);










    }
}
