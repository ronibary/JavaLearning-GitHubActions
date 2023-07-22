package learnOOP.interfaceSamples;

public class Triangle implements IPlanShapes, ICommand, TestShapes.greetHello {

    double a;
    double b;
    double c;
    double base;
    double height;

    public Triangle(double a, double b, double c, double base, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }

    public void perimeter(){
        double perimeter = a + b +c;
        System.out.println(String.format("Triangle perimeter: %.2f",perimeter));
    }

    public void area(){
        double area = 0.5*base*height;
        System.out.println(String.format("Triangle area: %.2f",area));
    }

    @Override
    public void name() {
        System.out.println("Triangle");
    }

    @Override
    public void drawSelf() {
        System.out.println("draw 3 lines");
    }

    @Override
    public void colorSelf() {
        System.out.println("color Triangle with Purple.");
    }

    @Override
    public void hello() {
        System.out.println("Traingle say hello ...");
    }
}
