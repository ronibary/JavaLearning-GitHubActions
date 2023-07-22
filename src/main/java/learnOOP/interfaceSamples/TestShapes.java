package learnOOP.interfaceSamples;

public class TestShapes implements IGreet{
    public static void main(String[] args) {

//        var tri1 = new Triangle(32,20,25,20,16);
//        var rec1 = new Rectangle(23,11);
//
//        tri1.area();
//        tri1.perimeter();
//        tri1.name();
//
//        rec1.area();
//        rec1.perimeter();
//        rec1.name();


        // reference shape with interface type variable limit the access to only
        // methods defined in the interface

        ICommand command = new Rectangle(22,11);
        command.colorSelf();
        command.drawSelf();

        // creating anonymous class that implement the methods in the interface ICommand
        ICommand cmd = new ICommand() {
            @Override
            public void drawSelf() {

            }

            @Override
            public void colorSelf() {

            }
        };

        cmd.drawSelf();
        cmd.colorSelf();

        System.out.println(IGreet.user_id);

        // can access directly the member variable "user_id" in the interface IGreet
        // because we implement IGreet
        System.out.println(user_id);





    }

    @Override
    public void hello() {
        System.out.println("hi from TestShapes...");
    }

    @Override
    public void drawSelf() {
        System.out.println("draw from TestShapes ...");
    }

    @Override
    public void colorSelf() {
        System.out.println("color from TestShapes ...");
    }

    // define nested interface
    interface greetHello {
        void hello();
    };



}
