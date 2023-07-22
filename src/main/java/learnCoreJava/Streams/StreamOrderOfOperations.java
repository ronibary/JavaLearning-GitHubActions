package learnCoreJava.Streams;

import java.util.List;

public class StreamOrderOfOperations {

    public static void main(String[] args) {


        var list = List.of(2, 10, 15, 1, 9);

        list.stream()
                .map(i -> {
                    System.out.println("Mapping: " + i);
                    return i > 10;
                })
                .filter(i -> {
                    System.out.println("Filtering " + i);
                    return true;
                })
               .forEach(System.out::println);


    }

}
