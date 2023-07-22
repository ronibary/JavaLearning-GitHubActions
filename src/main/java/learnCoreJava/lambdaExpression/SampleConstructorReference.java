package learnCoreJava.lambdaExpression;


class Box{

    int size;

    public Box(int size) {
        this.size = size;
    }

    void getSize(){
        System.out.println(size);
    }
}


public class SampleConstructorReference {

    public static void main(String[] args) {

//        Operation op = value -> new Box(value);

        // using the constructor reference
        Operation op = Box::new;
        Box box = op.operate(7);

        box.getSize();

    }

    interface Operation {
        Box operate(int value);
    }



}
