package learnCoreJava.generics;

public class Store<T> {

    T value;

    public Store(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void valueClass(){
        System.out.println(value.getClass());
    }


    public static void main(String[] args) {

        var store = new Store<String>("hello");
        System.out.println(store.getValue());

    }

}
