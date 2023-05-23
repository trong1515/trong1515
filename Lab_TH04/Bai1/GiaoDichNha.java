package Bai1;

import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha, diaChi ;

    public GiaoDichNha(){

    }

    public GiaoDichNha(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiNha, String diaChi){
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return this.loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public double thanhTien(){
        if (loaiNha.equals("cao cap")) {
            return getDienTich() * getDonGia() ;
        } else {
            return getDienTich() * getDonGia() * 0.9 ;
        }
    }
    @Override 
    public String toString(){
        return super.toString()+
        "\nLoai nha: " + loaiNha +
        "\nDia chi: " + diaChi ;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap loai nha (cao cap/thuong): ");
        loaiNha = sc.nextLine();
        System.err.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }    
}