package learnCoreJava.lambdaExpression;


class Store {

    void oddOrEven(int num){
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}



public class SampleInstanceMethod {

    public static void main(String[] args) {

        // create instance of the Store class to send Instance reference Method to the -> operateNum
        // this instance method reference is same signature as "Operation functional interface"
        Store store = new Store();

        operateNum(store::oddOrEven,17);

    }

    static void operateNum(Operation op,int value){
        op.execute(value);
    }


    // functional interface
    interface Operation {
        void execute(int num);
    }

}
