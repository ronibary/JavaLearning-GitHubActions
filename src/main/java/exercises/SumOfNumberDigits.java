package exercises;

public class SumOfNumberDigits {
    public static void main(String[] args) {

        System.out.println("sum of digits of 543 : "+sumOfDigits(543));

    }

    public static int sumOfDigits(int n)
    {
        int rem = 0;
        int sum = 0;

        while (n > 0)
        {
            rem = n % 10;
            sum = sum + rem;

            n /= 10;
        }

        return sum;
    }
}
