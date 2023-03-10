import java.util.Date;
import java.util.Scanner;
import java.util.Date ;

public class Main {
    public static void main(String[] args) {
        Hoaqua hoaqua = new Hoaqua();
        Quacam quacam = new Quacam("Viet Nam", 10000, 100, new Date(1/1/2023));
        CamSanh camsanh = new CamSanh("Viet Nam", 20000, 100, new Date(1/1/2023));
        CamCaoPhong camcaophong = new CamCaoPhong("Viet Nam", 25000, 100, new Date(1/1/2023));
        QuaTao quatao = new QuaTao("Viet Nam", 30000, 100, new Date(1/1/2023));
        System.out.println(hoaqua.toString());
        System.out.println(quacam.toString());
        System.out.println(camsanh.toString());
        System.out.println(camcaophong.toString());
        System.out.println(quatao.toString());
    }
}