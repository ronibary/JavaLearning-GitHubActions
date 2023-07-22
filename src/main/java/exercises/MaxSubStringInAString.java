package exercises;

import java.util.HashSet;
import java.util.Set;

public class MaxSubStringInAString {

    public static void main(String[] args) {
        String input = "javaconceptoftheday";

        String maxSubStr = maxSubStringWithoutDuplicates(input);
        System.out.println(String.format("input string: %s max sub string: %s ",input,maxSubStr));
    }

    /// <summary>
    /// sliding algorithm window to find the longest
    /// substring without repeating characters
    /// </summary>
    /// <param name="s"></param>
    /// <returns></returns>
    public static String maxSubStringWithoutDuplicates(String s)
    {
        String maxStr = "";
        if (s.isEmpty() || s.length() == 0)
            return maxStr;

        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<Character>();

        while (i < s.length())
        {
            char c = s.charAt(i);

            // when found char in the set it's time to reset the set
            // and delete all chars from set ,
            // start building again the next string from pointer i
            while (set.contains(c))
            {
                set.remove(s.charAt(j));
                ++j;
            }

            set.add(c);

            if ((i - j + 1) > max)
            {
                maxStr = s.substring(j, i +1);
                max = i - j + 1;
            }
            ++i;
        }
        return maxStr;
    }
}
