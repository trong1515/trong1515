package Bai1;

import java.util.*;

public class PhongHocLyThuyet extends PhongHoc {
    private boolean mayChieu;

    public PhongHocLyThuyet() {
    }
    public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu){
        super();
        this.mayChieu = mayChieu;
    }

    public boolean isMayChieu() {
        return this.mayChieu;
    }

    public boolean getMayChieu() {
        return this.mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap co may chieu hay khong (true/false): ");
        this.mayChieu = sc.nextBoolean();
    }
    @Override
    public void xuat(){
        super.xuat();
        if (this.mayChieu == true){
            System.out.println("\nPhong hoc co may chieu");
        }
        else{
            System.out.println("\nPhong hoc khong co may chieu");
        }
    }

    @Override
    public String toString() {
        return super.toString() +""+"[" +
            " May Chieu : '" + isMayChieu() + "'" +
            "]";
    }
    @Override
    public boolean ktDatChuan(){
        if(((getDienTich()/getSoBongDen()) <= 10 && (isMayChieu() == true))){
            return true;
        }
        return false;
    }
}
