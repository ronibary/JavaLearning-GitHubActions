package exercises;

public class ReversingANumber {
    public static void main(String[] args) {

        System.out.println("The reverse of 4321: "+reverseNumber(4321));

    }

    public static int reverseNumber(int n)
    {
        int reversedNumber = 0, reminder = 0;

        while (n != 0)
        {
            reminder = n % 10;

            reversedNumber = reversedNumber * 10 + reminder;

            n /= 10;
        }
        return reversedNumber;
    }



}
