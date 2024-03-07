package _7.most;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing circle");
        color.fillColor();
    }
}
