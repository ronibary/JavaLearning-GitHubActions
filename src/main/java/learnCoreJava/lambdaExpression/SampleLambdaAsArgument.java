package learnCoreJava.lambdaExpression;

public class SampleLambdaAsArgument {

    public static void main(String[] args) {

        // create anonymous class to implement the interface
        Operation operation = (num) ->{
            System.out.println(num + 10);
        };

        operateNum(operation,5);


        // we can call the lambda directly as parameter in the call to the method
        operateNum((n)-> System.out.println(n+10),20);

        // also we can have the block of lambda expression as a value to the method

        operateNum((n) -> {
            if (n%2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
                }, 9);


    }


    static void operateNum(Operation op,int value){
        op.execute(value);
    }


    interface Operation {
        void execute(int num);
    }


}
