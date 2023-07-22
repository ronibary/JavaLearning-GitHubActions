package learnCoreJava.Streams;

import java.util.Arrays;

public class StreamFromListSample {

    public static void main(String[] args) {

        var listI = Arrays.asList(3,1,10,45,7);

        var listS = Arrays.asList("Jack","John","Bill","Daniel");

        var streamI = listI.stream();

        //  streamI.forEach(i -> System.out.println(i));

        // use method reference as
        //streamI.forEach(System.out::println);

        // working directly on the listI
        listI.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        listS.stream()
                .filter(s -> s.length() > 4)
                .forEach(System.out::println);


    }



}
