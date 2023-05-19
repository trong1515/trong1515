package Bai2;
import java.util.*;
public class HangHoa {
    protected String maHang ;

    protected String tenHang ;

    protected int soLuongTonKho ;

    protected double donGia ;

    protected double thueVAT;

    public HangHoa(){

    }
    public HangHoa(String maHang, String tenHang, int soLuongTonKho, double donGia, double thueVAT){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
        this.thueVAT = thueVAT;
    }
    public String getMaHang() {
        return this.maHang;
    }
    public String getTenHang() {
        return this.tenHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public void setTenHang(String tenHang){
        this.tenHang = tenHang;
    }
    public int getSoLuongTonKho() {
        if ( this.getSoLuongTonKho() <= 10)
            return 0;
        return this.soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }
    public double getDonGia() {
        if (this.donGia < 0){
            return 0;
        }
        return this.donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getThueVAT() {
        return this.thueVAT;
    }
    public void setThueVAT(double thueVAT) {
        this.thueVAT = thueVAT;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        this.maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.println("Nhap so luong ton kho: ");
        this.soLuongTonKho = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don gia: ");
        this.donGia = Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.printf("%-10s %-20s %-20d %-20.2f", this.maHang, this.tenHang, this.soLuongTonKho, this.donGia);
    }
    

}


