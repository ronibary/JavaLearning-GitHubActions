package learnCoreJava.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {


        var listS = new ArrayList<Integer>();
        listS.add(11);
        listS.add(55);
        listS.add(77);

        var list = new ArrayList<Integer>();

        list.add(30);
        list.add(55);
        list.add(90);
        list.add(7);
        list.add(100);
        list.add(90);
        list.add(707);


        // to add element to specific position
        list.add(1,808);

        // to remove element at specific Index
        list.remove(1);

        // remove by Object (Integer with value 90) will be removed
        // if there are couple of 90 , the first one will be remove from the list
        list.remove(Integer.valueOf(90));

        // set - change the value in specific index
        list.set(1,44);

        // add one list to another list
        list.addAll(listS);

        // remove all elements from existing list by giving list to remove
        list.removeAll(listS);

        // removeIf - accept predicate filter (go over the list elements)
        // if the predicate return true the element will be removed
        // e.g remove all the Odd numbers from the list
        list.removeIf(i -> i % 2 != 0);

        // clear the list
        //list.clear();

        // check if list contains a value ->
        if (list.contains(90))
        {
            System.out.println("list contains 90");
        }


        System.out.println("size of list: "+ list.size());
        System.out.println("element at location 1: "+ list.get(1));
        System.out.println(list);


        // using List.Of , will create immutable list you cannot change it
        var nums = List.of(22,1,10,23);

        // toArray return array of Object
        Object[] arr = nums.toArray();
        System.out.println(arr[2]);

        Integer[] numbers = {4,9,44,11};
        // if we want to convert the array of Integer to List
        var integerList = Arrays.asList(numbers);
        System.out.println(integerList.get(1));








    }
}
