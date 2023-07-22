package exercises;

public class Palindrom {

    public static void main(String[] args) {

        System.out.println("abcdcba is palindrom: "+isPalindromString("abcdcba"));
        System.out.println("abdcba is palindrom: "+isPalindromString("abdcba"));
        System.out.println("12521 is palindrom: "+isPalindrom(12521));
        System.out.println("124521 is palindrom: "+isPalindrom(124521));


    }

    public static Boolean isPalindromString(String s)
    {
        // reverse the string and check if equal to original
        StringBuilder sb = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString().equals(s);
    }

    public static Boolean isPalindrom(int n){

        // reverse the number
        int tempNum = n;
        int reverseNum = 0;
        int rem = 0;

        while(n!=0)
        {
            rem = n % 10;
            reverseNum = reverseNum*10 + rem;

            n /= 10;
        }
        return (reverseNum == tempNum);
    }

}
