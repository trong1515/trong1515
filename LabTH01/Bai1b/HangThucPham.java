package Bai1b;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham {
    public String maHang ;
    public String tenHang ;
    public double donGia ;
    public LocalDate ngaySanXuat ;
    public LocalDate ngayHetHan ;
    public boolean hetHan ;
    public HangThucPham(){
        
    }
    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    public HangThucPham ( String maHang){
        this(maHang,null, 0.0f, LocalDate.now(), LocalDate.now());
    }
    public String getMaHang(){
        return maHang;
    }
    public String getTenHang(){
        return tenHang;
    }
    public double getDonGia(){
        return donGia;
    }
    public LocalDate getNgaySanXuat(){
        return ngaySanXuat;
    }
    public LocalDate getNgayHetHan(){
        return ngayHetHan;
    }
    public void setMaHang(String maHang) throws Exception{
        if (!maHang.trim().equals(""))
            this.maHang = maHang;
        else throw new Exception("Loi ! Ma hang rong");
    }
    public void setTenHang(String tenHang){
        this.tenHang = tenHang;
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }
    public void setNgaySanXuat(LocalDate ngaySanXuat){
        this.ngaySanXuat = ngaySanXuat;
    }
    public void setNgayHetHan(LocalDate ngayHetHan){
        this.ngayHetHan = ngayHetHan;
    }
    public boolean kiemTraHang(){
        if (ngayHetHan.isBefore(LocalDate.now())){
            hetHan = true;
        }
        return hetHan;
    }
@Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,##0.00");
        var dg = df.format(donGia);
        String sx = sdf.format(ngaySanXuat);
        String hh = sdf.format(ngayHetHan);
        return maHang + tenHang + dg + sx + hh;
    }



    
}
