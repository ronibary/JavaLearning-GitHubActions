package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesWords {
    public static void main(String[] args) {

        String dupString = " the day is going day is very good and very nice";

        System.out.println("print distinct words only");
        printDistinctWordsinString(dupString);

        System.out.println("print duplicates words only");
        printDuplicatesWordsinString(dupString);

    }

    public static void printDuplicatesWordsinString(String s) {

        String[] words = s.split("[ ,]+");
        // convert to list of String
        List<String> listOfWords = Arrays.asList(words);

        Map<String,Integer> wordsMap = new HashMap<String,Integer>();

        for (String word : listOfWords) {

            if (!wordsMap.containsKey(word))
            {
                wordsMap.put(word, 1);
            }
            else
            {
                int value = wordsMap.get(word);
                value += 1;
                wordsMap.put(word, value);
            }
        }

        // iterate the Map and only for entries above 1 print the word
//        wordsMap.forEach((k,v) -> {
//            if (v > 1)
//                System.out.print(k);
//        });

        // another way to iterate map
        for(Map.Entry<String,Integer> entry : wordsMap.entrySet())
        {
            if(entry.getValue()> 1)
                System.out.println("key: "+ entry.getKey() + ",     value: " + entry.getValue());
        }


    }

    /**
     * print distinct words in string
     * @param s
     */
    public static void printDistinctWordsinString(String s) {

        String[] words = s.split("[ ,]+");
        // convert to list of String
        List<String> listOfWords = Arrays.asList(words);

        List<String> uniqueWords = listOfWords.stream().distinct().collect(Collectors.toList());

        uniqueWords.forEach((w) -> {
            System.out.println(w);
        });
    }
}