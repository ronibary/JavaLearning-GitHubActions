package learnCoreJava.JavaOptionals;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class OptionalOnNullValue {




    public static void main(String[] args) {

        var person = number(11);

        if (person.isPresent())
        {
            System.out.println(person);
        }
        else
        {
            if (person.isEmpty())
            {
                System.out.println("person object is empty .");
            }
            System.out.println(new PersonObj("sami",45));
        }

        person = number(8);

        var result = person.orElse(new PersonObj("Joe",51));
        System.out.println(result);

        person = number(1);
        person.ifPresent(p -> System.out.println(" person in position 1: " + p));






    }


/*
    When person can be null value how we can return Optional with empty value
    in case the person is null , use -> ofNullable
 */
    static Optional<PersonObj> number(int position)
    {
        PersonObj person = null;

        var personList = List.of(
                new PersonObj("Daniel",12),
                new PersonObj("David",11),
                new PersonObj("Jack",30)
        );

        if (position >= 0 && position < personList.size()){
            person = personList.get(position);
        }

        return Optional.ofNullable(person);
    }


}
