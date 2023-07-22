package exercises;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("17 is prime: "+isPrimeNumber(17));
        System.out.println("15 is prime: "+isPrimeNumber(15));
    }

    public static Boolean isPrimeNumber(int n)
    {
        int m = n/2;

        for (int i = 2; i <= m; i++) {

            if(n % i == 0)
                return false;
        }
        return true;
    }
}

