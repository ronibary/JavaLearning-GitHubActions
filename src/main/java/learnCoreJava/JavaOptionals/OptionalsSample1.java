package learnCoreJava.JavaOptionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalsSample1 {
    public static void main(String[] args) {

        var integerValue = Optional.<Integer>empty();

        // assign Optional of 11 into optional variable
        integerValue = Optional.of(11);

        // if you think the value you pass to Optional might be null use this method
        //integerValue = Optional.ofNullable(null);


        // check if the optional variable has value before using the value
        if(integerValue.isPresent())
        {
            System.out.println(integerValue.get());
        }
        else
        {
            System.out.println("No value");
        }


        // if the optional is empty
        // you can get default value by using the --> orElse() method and provide the default value
        System.out.println(integerValue.orElse(100));

        // similar to orElse , but it gets a Supplier lambda expression interface , returning the value supplying
        //System.out.println(integerValue.orElseGet(() -> 100 ));

        // if optional is empty and you want to throw Exception , e.g using method reference here
        //System.out.println(integerValue.orElseThrow(IllegalStateException::new));

        // using map - use to transform the Optional value to another value by using
        // lambda expression.
        System.out.println(integerValue.map(i -> i + 10).get());

        // map also can transform to String
        // here also using orElse in case the Optional empty then provide default value "No Lines"
        System.out.println(integerValue.map(i -> i + " Lines").orElse("No Lines"));


        // filter - check if the value is the value we want using lambda expression and predicate (return bool)
        // here check if the value of the Optional 11 then 11 will be return otherwise 50 will be return
        System.out.println(integerValue.filter(i -> i == 11).orElse(50));

        // optional if present - if the value present then run the expression
        integerValue.ifPresent(i -> System.out.println(i+21));

        // ifPresentOrElse - if value present run the first statement otherwise run the second statement
        integerValue.ifPresentOrElse(i -> System.out.println(i+21),
                                    () -> System.out.println(10));













    }
}
