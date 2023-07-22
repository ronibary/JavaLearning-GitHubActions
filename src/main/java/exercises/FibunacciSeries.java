package exercises;

import java.util.Scanner;

public class FibunacciSeries {

    public static void main(String[] args) {

        int fibResult = fib(8);
        System.out.println(String.format("fib of 8: %d",fibResult));

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number to print the first fibonacci sequence: \n");
        int numFibToCalc = scan.nextInt();

        printFib(numFibToCalc);
    }


    public static int fib(int n)
    {
        if(n == 0 || n == 1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }

    public static void printFib(int n)
    {
        int n1 = 0 , n2 = 1, n3 = 0;

        System.out.println(n1 + " " + n2);

        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;

            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }




}
