package learning;

import learnOOP.Person;

public class CoreJavaBrushUp4 {

    /*
        using wraper classes and primitive values
     */
    public static void main(String[] args) {

        int x = 7;

        Integer xW = Integer.valueOf(x);
        System.out.println(xW);

        boolean bp =true;

        // boxing , wraper of the boolean primitive type
        Boolean bW = Boolean.valueOf(bp);
        System.out.println(bW);

        bW = null;

        // boxing and autoboxing
        Integer y = 5;
        int intVal = y; // unboxing into primitive value
        System.out.println(intVal);

        Boolean b = true;  // auto boxing


        // comparing Object reference variables

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = p1;

        var comparePersons = p1 == p2;
        System.out.println("two person's reference p1 and p2 -> equal : " + comparePersons);
        boolean compare = p1 == p3;
        System.out.println("two person's reference p1 and p3 -> equal : " + compare);







    }
}
