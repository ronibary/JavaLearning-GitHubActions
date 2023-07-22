package learnCoreJava.Streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFromIntArray {

    public static void main(String[] args) {

        var arr1 = new int[]{4,80,77,10,1};

        // using the Arrays's "stream" method to convert int[] Array into Stream primitive int values
        Arrays.stream(arr1)
                 .filter(i -> i % 2 == 0)
                 .forEach(System.out::println);


         // Stream from primitive values


        System.out.println("Int stream from array of int: \n");
        IntStream.of(arr1)
                .filter(i -> i > 10 )
                .forEach(System.out::println);


        System.out.println("Int stream from array of int: \n");
        IntStream.of(arr1)
                .filter(i -> i > 10 )
                .forEach(System.out::println);

        System.out.println("Int stream from direct int values: \n");
        IntStream.of(3,8,9,23,55)
                .filter(i -> i > 10 )
                .forEach(System.out::println);


        // Range - use to create range of numbers

        // generate range of int values from 1 to 50
        // filter the values to print only the Even numbers
        IntStream.range(1,50)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        var arr2 = new double[]{4,80,77,10,1};


        //DoubleStream - use to create
        DoubleStream.of(arr2)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);



    }

}
