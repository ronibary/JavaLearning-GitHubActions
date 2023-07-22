package learning;

public class CoreJavaBrushUp3 {

    public static void main(String[] args) {

        // using String object , string is immutable in java
        // using string literal java creating object from the string literal
        // that's why ==  work in comparing string literals
        String s = "Roni by";
        String s1 = "idan by";

        // create string using new object
        String s3 = new String("hello");
        String s4 = new String("hello world");

        String s5 = "my day is very nice i'm learning so much:)";
        String[] splittedStrings = s5.split(" ");
        for (int i = 0; i < splittedStrings.length; i++) {
            System.out.println(splittedStrings[i]);
        }

        String str = "Rahul Shetty Academy";

        String[] splittedString = str.split("Shetty");
        System.out.println(splittedString[0]);

        System.out.println(splittedString[1]);
        // trim the space
        System.out.println(splittedString[1].trim());

        for(int i =str.length()-1;i>=0;i--)
        {
            System.out.println(str.charAt(i));
        }


        ////////////////////////////////////////////
        // comparing strings

        var x = new String("Hello");
        var y = new String("Hello");

        // this is two different references that's why we get false
        var compare = (x == y);
        System.out.println(compare);

        // to compare value use equals method
        System.out.println(x.equals(y));

        // string is sequence of characters
        var name = "Roniby";
        // get substring
        var sub = name.substring(1,5);
        System.out.println(sub);

        // escape sequence use it with special string
        var nameStr = "i \"love\" java";
        System.out.println(nameStr);

        // recommended to use StringBuilder class to manipulate strings
        // it’s more efficient
        var sb = new StringBuilder(10);
        sb.append("hello ");
        sb.append("roni ");
        sb.append("have a nice day");
        sb.delete(0,5);
        System.out.println(sb.toString());



    }

}
