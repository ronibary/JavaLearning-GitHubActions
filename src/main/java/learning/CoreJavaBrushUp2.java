package learning;

import java.util.ArrayList;
import java.util.List;

public class CoreJavaBrushUp2 {

    public static void main(String[] args) {

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
        // print only multiple of 2

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0)
            {
                System.out.println(arr2[i]);
            }
            else
            {
                System.out.println(arr2[i] + " is not multiple of 2");
            }
        }

        List<String> myArray = new ArrayList();
        myArray.add("roni");
        myArray.add("sami");
        myArray.add("moki");
        myArray.add("rami");

        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }

    }


}
