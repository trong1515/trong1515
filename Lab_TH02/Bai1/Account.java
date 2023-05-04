package Bai1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private long soTK;
    private String tenTK;
    private double soTien;
    private String trangThai;
    final double laiSuat = 0.035; 
    Locale local = new Locale("vi", "vn");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
    public Account() {
        long soTK = 999999;
        String tenTK = " Chua xac dinh ";
        double soTien = 50;
        String trangThai = "";
    }
    public Account(long soTK, String tenTK, double soTien, String trangThai) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
        this.trangThai = trangThai;
    }
    public long getSoTK() {
        return soTK;
    }
    public void setSoTK(long soTK) {
        if (soTK > 0 && soTK != 999999) {
            this.soTK = soTK;
        } else {
            this.soTK = 999999;
            System.out.println("So tai khoan khong hop le");
        }
    }
    public String getTenTK() {
        return tenTK;
    }
    public void setTenTK(String tenTK) {
        if (tenTK != null) {
            this.tenTK = tenTK;
        } else {
            this.tenTK = "Chua xac dinh";
            System.out.println("Ten tai khoan khong hop le");
        }
    }
    public double getSoTien() {
        return soTien;
    }
    public void setSoTien(double soTien) {
        if (soTien >= 50) {
            this.soTien = soTien;
        } else {
            this.soTien = 50;
            System.out.println("So tien khong hop le");
        }
    }
    public String getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public Account (long soTK, String tenTK){
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = 50;
    }
    public void napTien(double soTien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can nap: ");
        soTien = sc.nextDouble();
        if (soTien > 0) {
            this.soTien += soTien;
        } else {
            System.out.println("So tien khong hop le");
        }

    }
    public void rutTien(double soTien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can rut: ");
        soTien = sc.nextDouble();
        if (soTien > 0 && soTien <= this.soTien) {
            this.soTien -= soTien;
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    public void chuyenKhoan(Account account, double soTien){
        int n, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien can chuyen: ");
        soTien = sc.nextDouble();
        if (soTien > 0 && soTien <= this.soTien) {
            this.soTien -= soTien;
            account.soTien += soTien;
        } else {
            System.out.println("So tien khong hop le");
        }
    }
    public void daoHan(){
        this.soTien = this.soTien + this.soTien * laiSuat;
    }


    @Override
    public String toString() {
        return "[" +
            " soTK ='" + getSoTK() + "'" +
            ", tenTK ='" + getTenTK() + "'" +
            ", soTien ='" + getSoTien() + "'" +
            ", trangThai ='" + getTrangThai() + "'" +
            "]";
    }
    


    
}