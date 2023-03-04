package Lab_04.Baitaptrenlop;

import java.util.Scanner;

import javax.security.sasl.SaslClientFactory ;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        String ten = "Vuong";
    }
    public void nhapCanh(){
        System.out.println("nhap canh = ");
        Scanner scanner= new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
    public void xuatTen() {
    }
    public void inChuVi() {
    }
    public void inDienTich() {
    }
}