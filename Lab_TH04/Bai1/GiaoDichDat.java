package Bai1;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public String getLoaiDat() {
        return this.loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(){

    }
    public GiaoDichDat(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiDat) {
        super();
        this.loaiDat = loaiDat;
    }
    @Override
    public double thanhTien(){
        if (loaiDat.equals("A")) {
            return getDienTich() * getDonGia() * 3/2;
        } else {
            return getDienTich() * getDonGia() ;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nLoat dat:" + loaiDat ;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap loai dat :");
        loaiDat = sc.nextLine();
    }
}