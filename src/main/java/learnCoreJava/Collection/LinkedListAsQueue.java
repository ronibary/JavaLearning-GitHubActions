package learnCoreJava.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

    public static void main(String[] args) {

        Queue<Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(11);
        linkedList.add(35);
        linkedList.add(55);
        linkedList.add(65);
        linkedList.add(75);

        // offer also add element to the list but only when succeed
        //without capacity issues otherwise will return Exception
        linkedList.offer(48);

        System.out.println(linkedList);

        // retrieve the first element from the Head of the Queue and remove it from the Queue !
        System.out.println(linkedList.poll());
        // only return the head but not removing the element from the Queue
        System.out.println(linkedList.peek());

        System.out.println("Queue after poll and peek calls ->");
        System.out.println(linkedList);


        // will remove element from the Queue , if the Queue empty will return Exception
        linkedList.remove(35);

        // if using remove without passing element it will remove the first element from the queue
        linkedList.remove();

        System.out.println("after calling remove 35 , and remove again with no parameters");

        System.out.println(linkedList);

        // go over a Queue it's like a List
        for (Integer i : linkedList){
            System.out.println(i);
        }


    }

}
