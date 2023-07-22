package learnCoreJava;

public class MethodsDemo {

    public static void main(String[] args) {

        MethodsDemo methodDemoObj = new MethodsDemo();
        methodDemoObj.showMessage("hello world");

        System.out.println(methodDemoObj.getStringName());
        MethodsDemo2 methods2Obj = new MethodsDemo2();
        String userName = methods2Obj.getUserName();
        System.out.println(userName);

        // calling the static method
        System.out.println(getData());

    }

    public void showMessage(String msg){
        System.out.println(msg);
    }

    public String getStringName(){
        return "roni bary";
    }

    // declare static method not belong to an object but to the class
    public static String getData(){
        return "hello world of data";
    }



}
