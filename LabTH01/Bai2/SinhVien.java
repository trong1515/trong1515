package Bai2;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    public SinhVien(){

    }
    public SinhVien(String maSV, String hoTen){
        this.maSV = maSV;
        this.hoTen = hoTen;
    }
    public String getMaSV(){
        return maSV;
    }
    public void setMaSV(String maSV){
        this.maSV = maSV;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
    }
    @Override
    public String toString(){
        return maSV + " - " + hoTen;

    }
}
