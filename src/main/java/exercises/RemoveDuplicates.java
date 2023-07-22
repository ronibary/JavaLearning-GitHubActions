package exercises;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println("the string abcbbdbcc after removeDuplicatesinString -> "+
                removeDuplicatesinString("abcbbdbcc"));

        System.out.println("the string abcbbdbcc after removeDuplicatesinString -> "+
                removeDuplicateUsingHashSet("abcbbdbcc"));

        System.out.println("the string abcbbdbcc after removeDuplicatesinString -> "+
                removeDuplicatesCharArray("abcbbdbcc".toCharArray()));



    }

    public static String removeDuplicatesinString(String s){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);

            // if char not found append it
            if (sb.toString().indexOf(c) == -1)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicateUsingHashSet(String s){

        StringBuilder sb = new StringBuilder();
        Set<Character> unique = new HashSet<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            unique.add(c);
        }

        // iterate the set and copy values into the String builder
//        Iterator<Character> it = unique.iterator();
//        while(it.hasNext())
//        {
//            sb.append(it.next().charValue());
//        }

        for (Character c : unique )
        {
            sb.append(c);
        }

        return sb.toString();
    }

    public static String removeDuplicatesCharArray(char[] arr){
        String outString = "";
        Boolean found = false;

        for (int i = 0; i < arr.length ; i++) {
            found = false;
            for (int j = 0; j < i ; j++) {

                if (arr[j] == arr[i])
                {
                    found = true;
                    break;
                }

            }
            if (!found)
                outString += arr[i];
        }

        return outString;
    }


}
