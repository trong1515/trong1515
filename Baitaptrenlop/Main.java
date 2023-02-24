package Lab_03.Baitaptrenlop;

public class Main {
    public static void main(String args[]){
        Circle c = new Circle();
        System.out.println(c.toString());
        Square s = new Square();
        System.out.println(s.toString());
        Vector v = new Vector();
        System.out.println(v.toString());
        Luong l = new Luong("Trong", 1000000, 1.5);
        System.out.println(l.tangLuong(5));

    }
    
}
