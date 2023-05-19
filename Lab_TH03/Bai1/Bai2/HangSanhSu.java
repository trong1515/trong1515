package Bai2;
import java.time.LocalDate;
import java.util.Scanner;
public class HangSanhSu extends HangHoa {
    private LocalDate ngayNhapKho;
    private String nhaSanXuat;
    public HangSanhSu(){

    }
    public HangSanhSu( String maHang, String tenHang, int soLuongTonKho, double donGia,double thueVAT, LocalDate ngayNhapKho, String nhaSanXuat){
        super();
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSanXuat = nhaSanXuat;
    }
    public LocalDate getNgayNhapKho() {
        return this.ngayNhapKho;
    }
    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSanXuat() {
        return this.nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ngay nhap kho: ");
        this.ngayNhapKho = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap nha san xuat: ");
        this.nhaSanXuat = sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%-15s %-15s", this.ngayNhapKho, this.nhaSanXuat);
    }
    public void ktKhaNang(){
        if ( this.soLuongTonKho > 50 && this.getNgayNhapKho().compareTo(LocalDate.now()) > 10 ){
            System.out.println("Hang ban kha cham");
        }
        else {
            System.out.println("Hang co kha nang ban duoc");
        }
        
    }

}
