package Lab_03;

public class Main {
    public static void main(String[] args) {
       Point2D p1 = new Point2D();
       System.out.println();
       Triangle t1 = new Triangle();
       System.out.println(t1.toString());
       Fraction fr = new Fraction(5, 6);
       Fraction fr2 = new Fraction(fr);
       System.out.printf(String.valueOf(fr.add(fr2)));
       fr.reducer();
       System.out.printf("\nsau khi rut gon: " + fr.toString());
    }
}
