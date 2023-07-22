package exercises;

public class FizzBuzz {
    public static void main(String[] args) {
        runFizzBuzz();
    }
    public static void runFizzBuzz()
    {
        for (int i = 0; i < 100; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println("FizBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
