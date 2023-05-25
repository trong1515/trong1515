package Bai1;

import java.util.*;

public class PhongHocThiNghiem extends PhongHoc {
    private String thongTinChuyenNganh ;
    private int sucChua;
    private boolean bonRuaDungCuThiNghiem;
    private boolean bonRuaTay;

    public PhongHocThiNghiem() {
    }
    public PhongHocThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String thongTinChuyenNganh, int sucChua, boolean bonRuaDungCuThiNghiem, boolean bonRuaTay){
        super();
        this.thongTinChuyenNganh = thongTinChuyenNganh ;
        this.sucChua = sucChua ;
        this.bonRuaDungCuThiNghiem = bonRuaDungCuThiNghiem ;
        this.bonRuaTay = bonRuaTay ;
    }

    public String getThongTinChuyenNganh() {
        return this.thongTinChuyenNganh;
    }

    public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
        this.thongTinChuyenNganh = thongTinChuyenNganh;
    }

    public int getSucChua() {
        return this.sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isBonRuaDungCuThiNghiem() {
        return this.bonRuaDungCuThiNghiem;
    }

    public boolean getBonRuaDungCuThiNghiem() {
        return this.bonRuaDungCuThiNghiem;
    }

    public void setBonRuaDungCuThiNghiem(boolean bonRuaDungCuThiNghiem) {
        this.bonRuaDungCuThiNghiem = bonRuaDungCuThiNghiem;
    }

    public boolean isBonRuaTay() {
        return this.bonRuaTay;
    }

    public boolean getBonRuaTay() {
        return this.bonRuaTay;
    }

    public void setBonRuaTay(boolean bonRuaTay) {
        this.bonRuaTay = bonRuaTay;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap thong tin chuyen nganh: ");
        this.thongTinChuyenNganh = sc.nextLine();
        System.out.print("\nNhap suc chua: ");
        this.sucChua = sc.nextInt();
        System.out.print("\nNhap co bon rua dung cu thi nghiem hay khong (true/false): ");
        this.bonRuaDungCuThiNghiem = sc.nextBoolean();
        System.out.print("\nNhap co bon rua tay hay khong (true/false): ");
        this.bonRuaTay = sc.nextBoolean();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("\nThong tin chuyen nganh: " + this.thongTinChuyenNganh);
        System.out.println("\nSuc chua phong hoc la: " + this.sucChua);
        if (this.bonRuaDungCuThiNghiem == true){
            System.out.println("\nPhong hoc co bon rua dung cu thi nghiem");
        }
        else{
            System.out.println("\nPhong hoc khong co bon rua dung cu thi nghiem");
        }
        if (this.bonRuaTay == true){
            System.out.println("\nPhong hoc co bon rua tay");
        }
        else{
            System.out.println("\nPhong hoc khong co bon rua tay");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[" +
            " Thong Tin Chuyen Nganh:'" + getThongTinChuyenNganh() + "'" +
            ", Suc Chua ='" + getSucChua() + "'" +
            ", Bon Rua Dung Cu Thi Nghiem: '" + isBonRuaDungCuThiNghiem() + "'" +
            ", Bon Rua Tay: '" + isBonRuaTay() + "'" +
            "]";
    }

    @Override
    public boolean ktDatChuan(){
        if(((getDienTich()/getSoBongDen() <= 10 )&& (isBonRuaDungCuThiNghiem() == true) && (isBonRuaTay() == true))){
            return true;
        }
        return false;
    }

}
