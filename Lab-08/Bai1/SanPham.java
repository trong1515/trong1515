package Bai1;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    double giamGia;
    public SanPham() {
    }
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public String getTenSp() {
        return tenSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public void getThueNhapKhau() {
        System.out.println("Thue nhap khau: " + donGia * 0.1);
    }
    public void nhap(){
        System.out.println("Nhap ten san pham: ");
        tenSp = new Scanner(System.in).nextLine();
        System.out.println("Nhap don gia: ");
        donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhập giam gia: ");
        giamGia = new Scanner(System.in).nextDouble();
    }
    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
    }
}
