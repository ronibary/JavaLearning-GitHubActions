package learnCoreJava.exceptions;

/*
     example how to create custom Exception of my own
 */

public class MyCustomException extends Exception {

    public static void main(String[] args) {

        try {
            throw new MyCustomException("Wrong operation ...");
        }
        catch(MyCustomException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e);  // this will print the message from the toString of the MyCustomException
        }

    }

    public MyCustomException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return "A custom Exception just occurred ... :(";
    }
}
