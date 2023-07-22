package learnCoreJava.exceptions;

// chain of Exceptions
public class ExceptionDemo5 {

    public static void main(String[] args) {

        try{
            code();
        }
        catch(Exception e)
        {
            System.out.println("Caught: "+e);
            System.out.println("Caught by: "+e.getCause());
        }


        // example of chain of Multi catch Exception to catch all possible Exceptions

        try {
            wrongCode();
        }
        catch(NullPointerException | ArithmeticException e){
            System.out.println("Bad code exception occurred : " + e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index is wrong ... " + e);
        }
    }


    // chain of Exceptions
    static void code(){
        var error = new ArithmeticException("div by zero");
        // before throw the Exception we can set the cause of that Exception
        error.initCause(new NullPointerException());
        throw error;
    }

    static void wrongCode(){
        //throw new NullPointerException();
        throw new ArithmeticException();
        //throw new IndexOutOfBoundsException();
    }



}
