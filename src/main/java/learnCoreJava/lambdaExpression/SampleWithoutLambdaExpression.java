package learnCoreJava.lambdaExpression;

public class SampleWithoutLambdaExpression {

    public static void main(String[] args) {

        // create anonymous class that implements Store "Functional interface"
        Store store = new Store() {

            @Override
            public int get() {
                return 7;
            }
        };

        var x = store.get();
        System.out.println(x);

    }

    // this is "Functional interface"
    // has only 1 abstract method so we can call it Functional interface
    interface Store{
        int get();
    }

}
