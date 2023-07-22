package learnCoreJava.CollectionMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
    Map - hold [key , value] pair in each element in the Map
 */
public class HashMapsBasics {

    public static void main(String[] args) {

        var hashMap = new HashMap<Integer , Integer>();

        hashMap.put(1,100);
        hashMap.put(2,45);
        hashMap.put(3,55);
        hashMap.put(8,95);
        hashMap.put(2,110);
        hashMap.put(2,130);
        hashMap.put(4,85);

        System.out.println(hashMap);

        System.out.println(" value with key 3: " + hashMap.get(3));


        // when try to get value with key does not exist
        // Map will return NULL

        // best practice to use with "default value" in case key not exist
        var value = hashMap.getOrDefault(10,1000);

        // get all the keys
        var entries = hashMap.entrySet();

        // iterate all the Map values using foreach
        for(var entry : entries){
            System.out.println(entry);

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // can get all the values
        var values = hashMap.values();
        System.out.println(value);

        // get all the keys from the map
        var keys = hashMap.keySet();
        System.out.println(keys);

        // to remove element , passing the key for the element to remove
        // var removedValue = hashMap.remove(4);
        // System.out.println("Removed value = "+ removedValue);

        // only if key and value exist then will remove
        var result = hashMap.remove(8,95);
        System.out.println("element was removed : "+result);

        // replace existing element - give old value and new value
        hashMap.replace(8,95,105);
        hashMap.replace(4,95); // replace the value in slot with key = 4

        System.out.println(hashMap);


    }

}
