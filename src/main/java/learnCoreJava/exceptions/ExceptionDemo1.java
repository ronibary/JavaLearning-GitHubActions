package learnCoreJava.exceptions;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        try {
            arithmeticError();
            numError();
            arrayError();
        }
        catch(ArithmeticException e)
        {
            System.out.println("wrong math :(");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Hmm check that index number ...");
        }
        catch(Exception e){
            System.out.println("Error occurred :(");
            System.out.println(e.getMessage());
        }

        System.out.println("Done with tasks ...");


    }

    static void arithmeticError(){

        var num1 = 7;
        var num2 = 0;
        var equation = num2/num2;  // e.g of java.lang.ArithmeticException: / by zero

        System.out.println(equation);
        System.out.println("Done ...");
    }

    static void numError(){
        int x = Integer.parseInt("123Hello");
    }

    static void arrayError(){
        var x = new int[5];
        x[10] = 4;
    }







}
