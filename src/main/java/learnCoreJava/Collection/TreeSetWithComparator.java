package learnCoreJava.Collection;


import java.util.Comparator;
import java.util.TreeSet;

class Car {
    String name;
    double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


public class TreeSetWithComparator {

    public static void main(String[] args) {

        // create comparator for the Car object to compare between two Cars using the price
        var comparator = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {

                if (c1.price > c2.price) {
                    return 1;
                }else if (c1.price == c2.price) {
                    return 0;
                }else {
                    return -1;
                }
            }
        };

        var carTreeSet = new TreeSet<Car>(comparator);

        carTreeSet.add(new Car("Lamborgini",200400.00));
        carTreeSet.add(new Car("Ferrari",400400.00));
        carTreeSet.add(new Car("Bugati",300300.00));
        carTreeSet.add(new Car("Mercedez",100500.00));

        // the order of the cars will be in ascending order according to the Comparator
        // based on the Car price
        System.out.println(carTreeSet);




    }

}
