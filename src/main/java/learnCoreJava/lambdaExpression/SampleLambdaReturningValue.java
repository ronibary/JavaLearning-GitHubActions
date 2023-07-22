package learnCoreJava.lambdaExpression;

public class SampleLambdaReturningValue {

    public static void main(String[] args) {

        Operation op = (num) -> {
             return calc(num);
        };

        var result = op.execute(10);
        System.out.println(result);
    }

    static String calc(int x){
        System.out.println(x*30);

        return "90";
    }


    interface Operation{
        String execute(int num);
    }

}
