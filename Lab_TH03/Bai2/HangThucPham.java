package Bai2;
import java.time.LocalDate;
import java.util.*;

public class HangThucPham extends HangHoa {
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private String nhaSanXuat;
    public HangThucPham(){

    }
    public HangThucPham(String maHang, String tenHang,int soLuongTonKho, double donGia, double thueVAT, LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaSanXuat){
        super();
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaSanXuat = nhaSanXuat;
        this.thueVAT = 5/100;
    }
    public LocalDate getNgaySanXuat() {
        return this.ngaySanXuat;
    }   
    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    public LocalDate getNgayHetHan() {
        if (this.ngayHetHan.isBefore(this.ngaySanXuat)){
            return this.ngaySanXuat;
        }
        return this.ngayHetHan;
    }
    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    public String getNhaSanXuat() {
        return this.nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay san xuat: ");
        this.ngaySanXuat = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap ngay het han: ");
        this.ngayHetHan = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap nha san xuat: ");
        this.nhaSanXuat = sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%-15s %-15s %-15s", this.ngaySanXuat, this.ngayHetHan, this.nhaSanXuat);
    }
    public void ktKhaNang(){
        if ( this.soLuongTonKho > 0 && this.ngayHetHan.isAfter(LocalDate.now())) {
            System.out.println(" Hang kho ban vcl !! ");
        }
        System.out.println(" Hang ban duoc ban oi ");
    }


}
