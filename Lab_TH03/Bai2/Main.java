package Bai2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        QuanLyHangHoa a = new QuanLyHangHoa();
        HangHoa hh = new HangHoa();
        Scanner sc = new Scanner(System.in);
        System.out.printf("1.Them hang thuc pham\n" + "2.Xuat hang hoa\n" +
        "Nhap lua chon: ");
        int i = sc.nextInt();
        if (i == 1) {
            hh = new HangThucPham();
            a.themHangHoa(hh);
        }
        if ( i == 2 ){
            hh = new HangThucPham();
            a.xuatHangHoa();
        }


    }
}
