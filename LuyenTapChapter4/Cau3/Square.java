package Cau3;

public class Square extends Rectangle {
    private double side = 1.0;
    public Square() {
    }
    public Square(double width, double length, String color, boolean filled, double side) {
        super(width, length, color, filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public String toString() {
        return "Square{" + "side=" + side +  " Area = " + getArea() + " Perimeter = " + getPerimeter() +'}';
    }
    
}
