package exercises;

public class Factorial {

    public static void main(String[] args) {

        int fact = calcFactorial(5);

        System.out.println("factorial of 5: "+calcFactorial(5));
    }

    private static int calcFactorial(int i) {
        if (i == 0)
            return 1;
        else
            return i * calcFactorial(i-1);
    }


}
