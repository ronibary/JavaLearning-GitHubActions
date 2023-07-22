package learnCoreJava.lambdaExpression;

public class SampleMethodReference {

    public static void main(String[] args) {

        // send the Method reference to the same signature method as the Operation interface
        // multiplyNumbers must be the same signature as the abstract method in -> interface Operation
        int result = operationNum(SampleMethodReference::multiplyNumbers,5);

        System.out.println(result);
    }

    static int multiplyNumbers(int x,int y){
        return x*y;
    }

    static int operationNum(Operation op,int value){
        int result = op.execute(value,value);

        return result;
    }

    // functional interface
    interface Operation {
        int execute(int num,int num2);
    }
}
