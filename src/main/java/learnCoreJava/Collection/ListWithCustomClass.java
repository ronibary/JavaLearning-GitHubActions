package learnCoreJava.Collection;

import java.util.ArrayList;

public class ListWithCustomClass {

    public static void main(String[] args) {

        var users = new ArrayList<User>();

        users.add(new User("moki",35));
        users.add(new User("aliza",45));
        users.add(new User("sandra",39));
        users.add(new User("michael",48));

        var firstUser = users.get(0);
        System.out.println(firstUser);






    }

}
