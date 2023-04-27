package Bai1b;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
    ArrayList<HangThucPham> HTpham ;
    public List(){
        HTpham = new ArrayList<HangThucPham>();
        
    }

    public void them (HangThucPham htp){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap so luong can them:");
       int n = sc.nextInt();
       for (int i = 1; i <= n; i++){
            System.out.println("Lan nhap thu " + i + ": ");
            htp = new HangThucPham();
            HTpham.add(htp);
       }
    }
    public void xuatDS(){
        System.out.format("%-30s %-30s %30s %30s %30s\n",
                "Ten hang",
                "Ngay san xuat",
                "Don Gia",
                "Ngay het han");
        System.out.println("===============================================================================================================================================================");

    for ( HangThucPham ds : HTpham){
        System.out.format("%-30s %-30s %30s %30.2f %30.2f\n",
                ds.getTenHang(),
                ds.getNgaySanXuat(),
                ds.getDonGia(),
                ds.getNgayHetHan()
        );
    }
    
}
    public void menu(){
        System.out.printf("-----QUAN LY HANG THUC PHAM-----\n" +
                "1. Nhap thong tin\n" +
                "2. Xuat ban ke khai\n" +
                "3. Thoat\n");
    }
}
