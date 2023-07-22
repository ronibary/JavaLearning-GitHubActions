package learnCoreJava.Streams;

import java.util.List;
import java.util.stream.IntStream;

public class StreamMapToObject {

    public static void main(String[] args) {

        /*

        mapToObj - method to convert primitives to objects

        Convert stream of primitive types to stream of Objects

         */


        var list = new int[]{22,10,51,73,37,47};

        IntStream.of(list)
            .mapToObj(i -> "$"+i)
            .forEach(i -> System.out.println(i));

    }
}
