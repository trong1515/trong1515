package Bai2;

import java.time.LocalDate;
import java.util.Scanner;
public class KhachHangVietNam extends KhachHang {
    private String loaiKhachHang;
    private double donGia, dinhMuc ;
    private int soLuong;

    public KhachHangVietNam(){

    }
    public KhachHangVietNam(String maKH, String hoTen, LocalDate ngayRaHoaDon, String loaiKhachHang, int soLuong, double donGia, double dinhMuc) {
        super();
        this.loaiKhachHang = loaiKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    public String getLoaiKhachHang() {
        return this.loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDinhMuc() {
        return this.dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    @Override
    public double thanhTien(){
        if ( soLuong <= dinhMuc ){
            return soLuong * donGia ;
        }else {
            double soLuongVuot = soLuong - dinhMuc ;
            return soLuong * donGia * dinhMuc + soLuongVuot * donGia * 2.5 ;
        }
    }
    @Override
    public String toString(){
        return super.toString() + 
        "\nLoai khach hang: " + loaiKhachHang +
        "\nSo luong: " + soLuong +
        "\nDon gia: " + donGia +
        "\nDinh muc: " + dinhMuc ;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap loai khach hang (sinh hoat/kinh doanh/san xuat): ");
        loaiKhachHang = sc.nextLine();
        System.out.printf("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.printf("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.printf("Nhap dinh muc: ");
        dinhMuc = sc.nextDouble();
    }
}
