package learnCoreJava.Streams;

import java.util.List;

public class StreamCountSample {

    /*
        count - this is terminal operation on a stream and you can't call another operation after
        count, usually count work with filter to count how many elements in the stream matching the filter
     */
    public static void main(String[] args) {

        var list = List.of(2,10,5,7,42,35,28,8,52,74);

        var value = list.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i > 40)
                .count();

        System.out.println("number of even numbers above 40 : " + value);






    }

}
