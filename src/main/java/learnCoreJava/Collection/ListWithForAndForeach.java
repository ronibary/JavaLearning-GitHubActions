package learnCoreJava.Collection;

import java.util.ArrayList;

public class ListWithForAndForeach {

    public static void main(String[] args) {

        var scores = new ArrayList<Integer>();
        scores.add(34);
        scores.add(90);
        scores.add(80);
        scores.add(50);
        scores.add(40);

//        for (int i = 0; i < scores.size(); i++) {
//            System.out.println(scores.get(i));
//        }

        // using foreach
        for (int x : scores){
            System.out.println(x);
        }


    }


}
