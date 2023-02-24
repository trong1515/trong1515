package Lab_03.Baitaptrenlop;

public class Luong {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double Luong_MAX;
    public Luong(String tenNhanVien, double luongCoBan, double heSoLuong){
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getTenNhanVien() {
        return this.tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return this.luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return this.heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public double tinhLuong(){
        return this.luongCoBan * this.heSoLuong;
    }
    public double Luong_MAX(){
        return Double.MAX_VALUE; 
    }
    public void inTTin(){
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
    }
    public boolean tangLuong(double k){
        if (tinhLuong() > Luong_MAX()){
            return false;
        }
        else{
            return true;
        }
    } 
}


    

    
