package learnCoreJava.lambdaExpression;

public class SampleWithLambda {

    public static void main(String[] args) {

        // same example but now with lambda expression
        // lambda expression work only with functional interface.

        Store store = () -> 7;
        var x = store.get();
        System.out.println(x);
    }


    // this is "Functional interface" has only 1 abstract method
    @FunctionalInterface
    interface Store{
        int get();
    }

}
