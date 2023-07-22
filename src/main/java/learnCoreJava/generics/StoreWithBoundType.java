package learnCoreJava.generics;

/*
    here the T is limit to only accept types that are subclass of Number
    this way we can limit and bound the T type
 */
public class StoreWithBoundType<T extends Number> {

    T value;

    public StoreWithBoundType(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        StoreWithBoundType s = new StoreWithBoundType(3.55);

        // this would give error , expect any type that is sub class of Number
        // StoreWithBoundType s2 = new StoreWithBoundType("hello");

        System.out.println(s.getValue());
    }

}
