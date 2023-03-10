package Cau3;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        Rectangle rectangle = new Rectangle(2, 3, "red", true);
        System.out.println(rectangle.toString());
        Circle circle = new Circle(2, "red", true);
        System.out.println(circle.toString());
        Square square = new Square();
        System.out.println(square.toString());
    }  
}
 