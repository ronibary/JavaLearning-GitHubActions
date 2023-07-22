package exercises;

import java.util.HashSet;
import java.util.Set;

public class AnagramNumbers {

    public static void main(String[] args) {

        int[] arr1 = {3,7,5,2,8,9,10,6,55};
        int[] arr2 = {3,6,5,55,8,9,10,7,2};
        Boolean anagramNumbers =  checkAnagramNumbers(arr1,arr2);

        System.out.println("the arrays are anagram numbers: "+ anagramNumbers);
    }

    private static Boolean checkAnagramNumbers(int[] arr1, int[] arr2) {

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            uniqueNumbers.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (uniqueNumbers.contains(arr2[i]) == false)
                return false;
        }
        return true;
    }
}
