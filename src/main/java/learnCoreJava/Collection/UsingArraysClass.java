package learnCoreJava.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingArraysClass {

    public static void main(String[] args) {

        // when using asList method we get Immutable list we cannot change it !!!
        var list = Arrays.asList(3,4,77,10);
        System.out.println(list.get(2));

        // is we want to create list that can be changed use it with the constructor
        List list2 = new ArrayList<Integer>(Arrays.asList(3,4,77,10));

        list2.add(88);
        list2.add(99);

        System.out.println(list);
        System.out.println(list2);


    }


}
