package learnCoreJava.Collection;

import java.util.Arrays;

public class ListIteratorSample {

    public static void main(String[] args)
    {
        var list = Arrays.asList(3,4,77,10,55,67,35);

//        var iterate = list.iterator();
        var iterate = list.listIterator(); // has more options than iterator

        while(iterate.hasNext())
        {
            System.out.printf("has next ... "+ iterate.next());
        }

        // using spliterator
        var list2 = Arrays.asList(4,7,8,9,12,15,35,45);
        var iterateS = list.spliterator(); //advantage for parallel programming

        //iterateS.forEachRemaining(i -> System.out.println(i));

        while (iterateS.tryAdvance(i -> System.out.println(i)));

    }



}
