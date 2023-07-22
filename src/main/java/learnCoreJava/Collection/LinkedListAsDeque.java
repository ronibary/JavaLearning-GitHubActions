package learnCoreJava.Collection;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDeque {

    public static void main(String[] args) {


        /*
         WithDeque we can work on both sides of the Queue at the beginning
         and at the End of the Queue

         " It's like a double Head queue "
         */

        Deque<Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(11);
        linkedList.add(35);
        linkedList.add(55);

        linkedList.addFirst(65);
        linkedList.addLast(75);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);


    }


}
