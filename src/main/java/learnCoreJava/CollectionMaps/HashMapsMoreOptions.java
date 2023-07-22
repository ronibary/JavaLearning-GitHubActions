package learnCoreJava.CollectionMaps;

import java.util.HashMap;

public class HashMapsMoreOptions {

    public static void main(String[] args) {

        var hashMap = new HashMap<Integer , Integer>();

        hashMap.put(1,100);
        hashMap.put(2,45);
        hashMap.put(3,55);
        hashMap.put(8,95);
        hashMap.put(4,85);

        // operation on all Maps elements e.g : increasing each value by 10
        //hashMap.replaceAll((k,v) -> v + 10);

        // change the key per each entry
        // hashMap.replaceAll((k,v) -> k * 2);

        // compute for specific key new value based on the lambda expression

        //hashMap.compute(1,(k,v) -> v+100);

        // will create new key with the value 1100
        hashMap.computeIfAbsent(11,k -> k *100);

        // if key exists change the old value add 10 to it
        hashMap.computeIfPresent(2,(k,oldValue) -> oldValue + 10);


        // merge on existing key / or if it's new key
        // in this exmaple key 3 exists , then adding 55 (old value) + new value (5) ==> 60
        // if key not exist the new value will be set with the new key
        hashMap.merge(3 ,5,(ov,nv) -> ov + nv);

        // check if key exists or not
        var result = hashMap.containsKey(3);

        // check size of Map
        int size = hashMap.size();

       // hashMap.clear(); // empty the map
       // hashMap.isEmpty(); // check if map empty





        System.out.println(hashMap);

    }
}
