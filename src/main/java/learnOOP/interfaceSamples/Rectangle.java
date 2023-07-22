package learnOOP.interfaceSamples;

public class Rectangle implements IPlanShapes,ICommand {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void perimeter(){
        double perimeter = 2*(width+height);
        System.out.println(String.format("Rectangle perimeter: %.2f",perimeter));
    }

    public void area(){
        double area = width*height;
        System.out.println(String.format("Rectangle area: %.2f",area));
    }

    @Override
    public void name() {
        System.out.println("Rectangle");
    }

    @Override
    public void drawSelf() {
        System.out.println("draw 4 lines");
    }

    @Override
    public void colorSelf() {
        System.out.println("color rectangle with Yellow.");
    }
}
