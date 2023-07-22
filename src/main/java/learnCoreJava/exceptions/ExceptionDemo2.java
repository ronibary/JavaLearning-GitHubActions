package learnCoreJava.exceptions;

public class ExceptionDemo2 {

    // example throw exception
    public static void main(String[] args) {

        // 1. 1 way to throw the Exception with a message
        //  var x = new ArithmeticException("wrong not valid number !!!...");
        //  throw x;

        // second way with the try catch block catch and throw the exception

        try
        {
            var n1 = 8;
            var n2 = 0;
            var n3 = n1/n2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception occurred "+ e);
            throw e;
        }

    }

}
