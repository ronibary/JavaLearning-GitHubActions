package learnCoreJava.JavaOptionals;

import learnOOP.Person;

import java.util.List;
import java.util.Optional;



class PersonObj {

    String name;
    int age;

    public PersonObj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class OptionalOnObject {

    public static void main(String[] args) {

        // example using method that return Optional value of object Person (empty of value)

        var person = number(11);

        System.out.println();


        if (person.isPresent()) {
            System.out.println(person.get());
        }
        else{
            System.out.println("no value of person at position 11");
        }

        person = number(0);

        var result = person
                .filter(p -> p.age == 12)  // if position at 0 the age is equal to 12 , so return that person
                .orElse(new PersonObj("Sonia",29));

        System.out.println(result);






    }


    static Optional<PersonObj> number(int position)
    {
        Optional<PersonObj> person = Optional.empty();

        var personList = List.of(
                new PersonObj("Daniel",12),
                new PersonObj("David",11),
                new PersonObj("Jack",30)
        );

        if (position >= 0 && position < personList.size()){
            person = Optional.of(personList.get(position));
        }

        return person;
    }
}
