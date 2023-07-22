package learnCoreJava.Collection;

import java.util.HashSet;

public class HashSetSample {

    public static void main(String[] args) {

        //HashSet has unique elements

        // hashSet has capacity , and load factor when capacity for example 0.7f 75% of the capacity
        // the HashSet will increase the capacity to allocate more memory

        var hashSet = new HashSet<Integer>(5,0.7f);

        hashSet.add(34);
        hashSet.add(11);
        hashSet.add(7);
        hashSet.add(11); // will not add again , HashSet has unique elements

        System.out.println(hashSet);

        for(Integer i : hashSet){
            System.out.println(i);
        }


    }

}
