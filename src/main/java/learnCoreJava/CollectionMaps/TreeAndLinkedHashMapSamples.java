package learnCoreJava.CollectionMaps;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeAndLinkedHashMapSamples {
    public static void main(String[] args) {

        /*
        TreeMap arrange the elements in ascending order
         according to the key's value
         (in map there is no order)
         */

        var hashMap = new TreeMap<Integer,Integer>();

        hashMap.put(35,100);
        hashMap.put(3,45);
        hashMap.put(42,55);
        hashMap.put(41,95);
        hashMap.put(25,85);

        System.out.println(hashMap);

                /*
        LinkedHashMap - preserve the order of the elements inserted to the map
        when order is important use LinkedHashMap
         */

        var hashMap2 = new LinkedHashMap<Integer,Integer>();

        hashMap2.put(12,100);
        hashMap2.put(55,45);
        hashMap2.put(25,55);
        hashMap2.put(85,95);
        hashMap2.put(95,85);

        System.out.println(hashMap2);
    }
}
