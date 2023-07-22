package learning;

import com.google.errorprone.annotations.Var;

import java.util.Scanner;

public class CoreJavaBrushUp1 {

    public static void main(String[] args) {

        int myNum = 5;
        String webSite = "web site name";
        char letter = 'r';
        float dec = (float) 5.99;
        double dec2 = 6.88;
        boolean IsExpire = true;


        // example using var keyword
        var x = 4.5;
        var exist = true;

        System.out.println(String.format("exist: %b my float number: %f",exist,x));

        // print 2 decimals after the period
        System.out.println(String.format("my number %.2f",dec));


        // accept user input using the Scanner class
        var input =  new Scanner(System.in);
        System.out.println("Enter your name => ");
        var myName = input.nextLine();
        System.out.println("Hello "+ myName);



        // using Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2]= 4;
        arr[3]= 5;
        arr[4]= 6;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // assign and initialize an array with values
        int[] arr2 = {1,2,3,4,5,6};

        // array of strings
        String[] names = {"eli","sami","moki"};

        // another way of looping
        for(String name : names)
        {
            System.out.println(name);
        }

    }

}
