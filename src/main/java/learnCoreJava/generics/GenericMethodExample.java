package learnCoreJava.generics;

/*

example of generic method inside a class that is not generic
also generic constructor
 */

public class GenericMethodExample {

    public <T extends Number>GenericMethodExample(T value ){
        System.out.println("Starting " + value);
    }

    public <T extends Number>void print(T num){
        System.out.println(num);
    }


    public static void main(String[] args) {

        GenericMethodExample obj = new GenericMethodExample(5);
        obj.print(10);

    }


}
