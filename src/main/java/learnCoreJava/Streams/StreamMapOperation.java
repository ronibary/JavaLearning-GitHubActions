package learnCoreJava.Streams;

import java.util.List;

public class StreamMapOperation {


    /*
        MAP - on a stream to change existing stream of elements
        using lambda expression

        Map - get an object and return a stream of objects

        e.g  if we want to add 10 for each element on the stream  and create new stream
     */

    public static void main(String[] args) {


        var list = List.of(22,10,51,73,37,47);

        // e.g  let's say we want to add 10 for each element on the stream  and create new stream
        var newStream = list.stream().map(i -> i + 10);
        newStream.forEach(i -> System.out.println(i));

        // common syntax use one line :
        // multiply by 2 each element of existing stream and print the result.
        list.stream().map(i -> i * 2)
                .forEach(i -> System.out.print(" " + i));

        // common syntax use one line :
        // e.g: add 10 to all elements and print only numbers above 50
        System.out.println("\ne.g: add 10 to all elements and print only numbers above 50 => ");
        list.stream()
                .map(i -> i+10)
                .filter(i -> i > 50)
                .forEach(i -> System.out.print(" " + i));



        // operations on primitive type of elements like Int stream , double Stream

        // first have to convert the stream of objects to Int stream
        // then work with the result primitive stream.

        var newStreamOfInt = list.stream().mapToInt(i -> i);
        // call max() on the stream of int
        // it return optional
        var result = newStreamOfInt.max();

        System.out.println("\n The max: ");
        System.out.println(result.orElse(0));

        var sumOfStream =  list.stream().mapToDouble(i -> i + 10).sum();
        System.out.println("The sum of the list: "+ sumOfStream);

        System.out.println("adding 10.5 for each element in the stream: ");
        list.stream().mapToDouble(i -> i+10.5)
                .forEach(System.out::println);


    }

}
