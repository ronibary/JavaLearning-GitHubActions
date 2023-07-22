package learnCoreJava.Streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFlatMapSample {

    public static void main(String[] args) {


        var list = List.of(2,10,15,1,9);

        /*

            flatmap - map each element to multiple elements , 1 to many relationship
            e.g: 2 -> 12 ,20 , 10 -> 20,30 ...

         */
//
//        list.stream()
//                .flatMap(i -> Stream.of(i + 10,i + 20))
//                .forEach(System.out::println);


        var arr1 = new int[]{2,12,90};
        var arr2 = new int[]{13,7,1};
        var arr3 = new int[]{42,8,91};

        //using flat map -> to process 3 arrays of (int) into one Int Stream
        // we get 3 arrays we flat map them into Int Stream

        Stream.of(arr1, arr2,arr3)
                .flatMapToInt(i -> IntStream.of(i))
                .forEach(i -> System.out.println(i));


        // flat map example:
        // find and print the max int from the 3 arrays on Int

        System.out.println("The max int from the 3 arrays : ");
        Stream.of(arr1, arr2,arr3)  // Stream<int[]>
                .flatMapToInt(IntStream::of) // intStream
                .max() //OptionalInt
                .ifPresent(System.out::println);



    }

}
