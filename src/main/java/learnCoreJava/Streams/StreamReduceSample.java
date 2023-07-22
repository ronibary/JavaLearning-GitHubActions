package learnCoreJava.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamReduceSample {

    public static void main(String[] args) {

        ///////////////////////////////////////////////////
        // reduce - reduction operation on stream , this is terminal operation
        // e.g: (2,10,5)  -> (a+b) ->  2 + 10  become (a) +  5(b) ==> 17


        var list = List.of(2,10,5);

        var value = list.stream()
                .reduce((a,b) -> a+b);

        System.out.println(value.orElse(0));


        /////////////////////////////////////
        // working on ArrayList<Integer>

        var list2 = new ArrayList<Integer>();

        value = list2.stream()
                .reduce((a,b) -> a + b);

        // avoid calling get on empty stream
        // if we call get on empty stream we get -> NoSuchElementException: No value present
        //System.out.println(value.get());

        // reduce with identity (this will be the first element (a) to start the calculation)
        // example

        var list3 = List.of(2,10,5);

        var value1 = list.stream()
                .reduce(1,(a,b) -> a * b);  // 1*2 , 2*10 , 20*5 ===> reduce result = 100

        System.out.println("reduce of (2,10,5) ==> 1,(a,b) -> a * b) = "+ value1);


        var value2 = list.stream()
                .reduce(0,(a,b) -> (a+10) + (b+10));  // 10+12 ->22 ,32+20->52 ,62+15 ->77

        System.out.println("reduce of (0,(a,b) -> (a+10) + (b+10)) => "+ value2);


    }


}
