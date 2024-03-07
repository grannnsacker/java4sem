package _7.most;

public class Main {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();
        Rectangle rectangle = new Rectangle(red);
        rectangle.draw();
        Circle circle = new Circle(blue);
        circle.draw();
    }
}
