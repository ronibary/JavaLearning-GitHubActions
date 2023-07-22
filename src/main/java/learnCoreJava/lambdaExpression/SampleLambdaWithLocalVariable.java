package learnCoreJava.lambdaExpression;

public class SampleLambdaWithLocalVariable {

    static int value = 20;
    int num = 9;


    public static void main(String[] args) {

        test();


    }

    static void test() {
        int localNum = 7; // should not be changes and act as final when having lambda expression in the method

        Operation op = num -> {
            System.out.println(localNum);
        };

        op.execute(5);

    }


    interface Operation {
        void execute(int num);
    }


}
