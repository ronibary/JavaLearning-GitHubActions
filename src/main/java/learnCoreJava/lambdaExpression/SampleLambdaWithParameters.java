package learnCoreJava.lambdaExpression;

public class SampleLambdaWithParameters {

    public static void main(String[] args) {
        Store store = (n1,n2) -> n1 * n2;
        var x = store.multiply(5,10);
        System.out.println(x);
    }

    interface Store {
        int multiply(int n1,int n2);
    }

}
