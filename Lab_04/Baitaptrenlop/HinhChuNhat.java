package Lab_04.Baitaptrenlop;

import java.util.Scanner;
public class HinhChuNhat {
    public float dai;
    public float rong;
    public HinhChuNhat(){
        String ten = "Chu Nhat";
    }
    public void nhapChieuDai (){
        System.out.println("nhap chieu dai = ");
        Scanner scanner=new Scanner(System.in);
        dai=scanner.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.println("nhap chieu rong = ");
        Scanner scanner=new Scanner(System.in);
        rong=scanner.nextFloat();
    }
    public void tinhChuVi(){
        float chuVi = (dai+rong)*2;
    }
    public void tinhDienTich(){
        float dienTich = dai*rong;
    }
}
