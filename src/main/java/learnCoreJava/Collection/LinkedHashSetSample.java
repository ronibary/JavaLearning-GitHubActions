package learnCoreJava.Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetSample {


    /*
    LinkedHashSet preserve the order on which the elements were inserted.
     */
    public static void main(String[] args) {

        var hashSet = new LinkedHashSet<Integer>();

        hashSet.add(34);
        hashSet.add(11);
        hashSet.add(7);
        hashSet.add(90);

        System.out.println(hashSet);

    }
}
