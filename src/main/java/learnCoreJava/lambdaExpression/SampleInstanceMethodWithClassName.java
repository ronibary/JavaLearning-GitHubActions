package learnCoreJava.lambdaExpression;


class MyStore {

    int size;

    public MyStore(int size) {
        this.size = size;
    }

    void size(){
        System.out.println(size);
    }
}



public class SampleInstanceMethodWithClassName {

    public static void main(String[] args) {

        var store = new MyStore(77);

        // passing method of the class name
        operateNum(MyStore::size,store);

    }

    static void operateNum(Operation op,MyStore store){
        op.execute(store);
    }


    interface Operation {
        void execute(MyStore store);
    }

}
