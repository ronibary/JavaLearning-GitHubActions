package learnCoreJava.Streams;

import java.util.List;
import java.util.stream.IntStream;

public class StreamMinMaxSortSamples {

    public static void main(String[] args) {

        var list = List.of(33,8,98,26,80);

        // sort - the stream elements

        // two types of sorted() , one without argument and one that accept a comparator

        list.stream()
                .sorted()
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println(i));

        System.out.println("compare 22 = 22 :");
        var value = Integer.compare(22,22); // return 0
        System.out.println(value);

        System.out.println("compare 20 = 22 :");
        value = Integer.compare(20,22);  // return -1
        System.out.println(value);

        System.out.println("compare 28 = 22 :");
        value = Integer.compare(28,22);  // return 1
        System.out.println(value);


        /////////////////////////////////////
        // min / max - method    - return an Optional value of the min or max from a stream

        // min - e.g: using the method reference "compare" of the Integer class to get the min of the stream
        // min - return Optional
        var minValue = list.stream().min(Integer::compare);

        System.out.println("the min value: ");
        minValue.ifPresent(System.out::println);

        // min using all in one line

        list.stream()
                .min(Integer::compare)
                .ifPresent(i -> System.out.println("min = "+i));

        // max - find the max value out of stream
        list.stream()
                .max(Integer::compare)
                .ifPresent(i -> System.out.println("max = "+i));


        /////////////////////////////////////////////////////////////
        // min / max on primitive type list of int

        IntStream.of(2,10,5,7,8)
                .min()                      // no need for comparator on primitive int
                .ifPresent(i -> System.out.println("min = "+i));

        IntStream.of(2,10,5,7,8)
                .max()                      // no need for comparator on primitive int
                .ifPresent(i -> System.out.println("max = "+i));




    }

}
