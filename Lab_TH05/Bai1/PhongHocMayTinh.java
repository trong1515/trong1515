package Bai1;

import java.util.Scanner;

public class PhongHocMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongHocMayTinh() {
    }
    public PhongHocMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh){
        super();
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return this.soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap so may tinh: ");
        this.soMayTinh = sc.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("\nSo may tinh: " + this.soMayTinh);
    }

    @Override
    public String toString() {
        return super.toString() + "[" +
            " So May Tinh ='" + getSoMayTinh() + "'" +
            "]";
    }
    @Override
    public boolean ktDatChuan(){
        if(((getDienTich()/getSoBongDen()) <= 10 && (getDienTich()/getSoMayTinh() <= 1.5))){
            return true;
        }
        return false;
    }

}
