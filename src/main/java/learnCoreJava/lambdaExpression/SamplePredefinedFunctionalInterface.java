package learnCoreJava.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


/*
example for using predefined factional interfaces like ( Supplier /  Consumer  / Predicate)
this way we don't have to create our own functional interface if there is already the same from JAVA.
 */
public class SamplePredefinedFunctionalInterface {

    public static void main(String[] args) {

        //info(() -> "Hello world");

        //info(i -> System.out.println(i*10),7);

        boolean result = info(i -> i % 2 == 0,20);
        System.out.println(result);

    }

    static boolean info(Predicate<Integer> op,Integer i){
        return op.test(i);
    }


//    static void info(Consumer<Integer> op,Integer v){
//        op.accept(v);
//    }


//    static void info(Supplier<String> op){
//        System.out.println(op.get());
//    }





    // no need to create , but use existing predefined interface Supplier<T> of Java

//
//    interface Operation {
//        String get();
//    }


}
