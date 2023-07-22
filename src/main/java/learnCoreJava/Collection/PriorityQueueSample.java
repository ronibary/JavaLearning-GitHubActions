package learnCoreJava.Collection;

import java.util.PriorityQueue;

public class PriorityQueueSample {

    public static void main(String[] args) {

        // priority queue give priority to the smallest element
        // when calling poll it will retrieve the smallest element in the queue
        // and each time will retrieve the next smallest element in the Queue
        var priorityQ = new PriorityQueue<Integer>();

        priorityQ.add(12);
        priorityQ.add(35);
        priorityQ.add(80);
        priorityQ.add(55);
        priorityQ.add(75);
        priorityQ.add(0);

        var firstElement = priorityQ.poll();

        System.out.println("previous first element: "+ firstElement);

        System.out.println(priorityQ.poll());

        System.out.println(priorityQ);






    }

}
