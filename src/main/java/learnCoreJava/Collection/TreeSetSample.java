package learnCoreJava.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSample {

    public static void main(String[] args) {


        var comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1 > o2) {
                    return 1;
                }else if (o1 == o2) {
                    return 0;
                }else {
                    return -1;
                }
            }
        };


        // TreeSet Arrange the elements in ascending order
        // passing comparator to define how to compare between elements
        var treeSet = new TreeSet<Integer>(comparator);


        treeSet.add(34);
        treeSet.add(11);
        treeSet.add(100);
        treeSet.add(7);
        treeSet.add(90);

        // TreeSet Arrange the elements in ascending order using the natural orders on Integer
        System.out.println(treeSet);

    }

}
