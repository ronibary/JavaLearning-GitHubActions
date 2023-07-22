package exercises;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("is armstrong number 407 : " + isArmstrongNumber(407));
        System.out.println("is armstrong number 371 : " + isArmstrongNumber(371));
        System.out.println("is armstrong number 743 : " + isArmstrongNumber(743));
    }

    public static Boolean isArmstrongNumber(int n)
    {
        int temp = n;

        int rem = 0;
        int sum = 0;

        while (n > 0)
        {
            rem = n % 10;
            sum = sum + rem * rem * rem;

            n /= 10;
        }

        return (temp == sum);
    }
}
