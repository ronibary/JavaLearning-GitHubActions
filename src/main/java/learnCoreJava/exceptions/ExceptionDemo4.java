package learnCoreJava.exceptions;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        try {
            someCode();
        }
        catch (ArithmeticException e)
        {
            System.out.println("some Arithmetic error occurred ...");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Back to business ...");
        }

    }

    static void someCode(){
        System.out.println("Hello starting ...");
        throw new ArithmeticException("Wrong number ...");
    }
}
