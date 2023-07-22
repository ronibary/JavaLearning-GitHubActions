package learnCoreJava.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

    public static void main(String[] args) {

        // using the linkedList
        var linkedList = new LinkedList<Integer>();

        linkedList.add(34);
        linkedList.add(11);
        linkedList.add(10);
        linkedList.add(7);


        // LinkedList has order method , it implements Queue , so have more
        // functionality than the regular ArrayList

        linkedList.addFirst(8);
        linkedList.addLast(85);

        // retrieve the head of the list
        var firstInLine = linkedList.peek();

        System.out.println("head element: " + firstInLine);
        System.out.println(linkedList);

        // LinkedList can behave like a List if we reference it using List variable reference

        List<Integer> list = new LinkedList<Integer>();

        list.add(55);
        list.add(33);
        list.add(77);
        list.add(85);

        list.add(1,100);

        var iterator = list.iterator();

        System.out.println("\nprint the LinkedList acting like a List \n");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}
