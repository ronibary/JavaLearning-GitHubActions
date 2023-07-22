package learnCoreJava.Collection;

import java.util.ArrayDeque;

/*
    ArrayDeque implement a Deque
    it's like a double ended queue

    we can add elements to the Tail and the Head.

    so basically with Deque we can work on both sides of the Queue.

 */

public class ArrayDequeSample {

    public static void main(String[] args) {

        var arrayDeque = new ArrayDeque<Integer>();

        arrayDeque.add(23);
        arrayDeque.add(22);
        arrayDeque.add(10);
        arrayDeque.add(7);
        arrayDeque.add(13);


        arrayDeque.addFirst(1);
        arrayDeque.addLast(11);

        arrayDeque.offerFirst(0); // add elements to the queue

        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());

        // have also removeFirst
        //System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.pollFirst());

        // System.out.println(arrayDeque);

        // iterate the Queue using foreach
        for(Integer i : arrayDeque){
            System.out.println(i);
        }

        ////////////////////////////////////////////////////////////////////
        // iterate a Deque from Tail to the start of the Queue (opposite direction)

        var iter = arrayDeque.descendingIterator();

        System.out.println("iterating from End to start of the Queue ->");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
