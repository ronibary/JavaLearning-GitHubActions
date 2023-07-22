package exercises;

import java.util.Arrays;

public class AnagramStrings {

    public static void main(String[] args) {

        System.out.println("the strings silent and listen are anagram : " +
                areAgramStrings("silent","listen"));
    }

    private static Boolean areAgramStrings(String s1, String s2) {

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i])
                return false;
        }

        return true;
    }


}
