package learnCoreJava.Streams;

import java.util.stream.Stream;

public class StreamsSample1 {

    public static void main(String[] args) {


        var stream = Stream.of(23,10,74,100);

        // foreach - terminal operation
        // common operation on stream - foreach
        // on each element of the stream print it.

        // stream.forEach(i -> System.out.println(i));


        // filter - work on the elements of the stream
        // filter - return stream of elements that match the given predicate lambda expression

        stream.filter(i -> i >30)
                .forEach(i -> System.out.println(i));


        var stream2 = Stream.of("Jack","John","Bill","Daniel");

        // print all the elements that starts with "J"
        stream2.filter(s -> s.startsWith("J"))
                .forEach(s -> System.out.println(s));


    }
}
