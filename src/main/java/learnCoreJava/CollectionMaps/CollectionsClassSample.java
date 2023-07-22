package learnCoreJava.CollectionMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassSample {

    public static void main(String[] args) {

        var list = new ArrayList<>(List.of(3,10,4,34,19,7));

/*
        Collections class have algorithms to operate on collection interface
 */

        // sort a list in ascending order
        Collections.sort(list);
        Collections.reverse(list); // reverse the list

        // swap between two elements positions in the list
        Collections.swap(list,0,5);


        System.out.println(list);




    }
}
