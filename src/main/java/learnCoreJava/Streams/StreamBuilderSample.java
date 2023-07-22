package learnCoreJava.Streams;

import java.util.Scanner;
import java.util.stream.Stream;

public class StreamBuilderSample {

    /*

        Stream Builder - let you build the stream ( of type Integer / Double ... Long)
        sometimes you don't have all the elements in the stream  and you want to build the stream

        in reality you may build the stream elements from a file or document

     */

    public static void main(String[] args)
    {
        /*
        example how to build the stream using Builder
         */

        var builder = Stream.<Integer>builder();
        var sc = new Scanner(System.in);
        var value = 0;

        do{
            System.out.println("Input a number: ");
            builder.accept(value);
            value = sc.nextInt();
        } while (value != -1);

        System.out.println("Sum: " );

        var sum = builder.build()
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println(sum);



//        builder.accept(34);
//        builder.accept(12);
//        builder.accept(10);
//        builder.accept(78);
//
//        // once you call build on the builder you cannot add more elements to the builder.
//
//        var sum = builder.build()
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        System.out.println(sum);

    }
}
