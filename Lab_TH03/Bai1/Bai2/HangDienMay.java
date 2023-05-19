package Bai2;
import java.time.LocalDate;
import java.util.*;

public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int congSuat;
    public HangDienMay(){

    }
    public HangDienMay(String maHang, String tenHang,int soLuongTonKho, double donGia, double thueVAT , int thoiGianBaoHanh, int congSuat ){
        super();
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
        this.thueVAT = 10/100;
    }
    public int getThoiGianBaoHanh() {
        if (this.thoiGianBaoHanh < 0){
            return 0;
        }
        return this.thoiGianBaoHanh;
    }
    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public int getCongSuat() {
        if (this.congSuat < 0){
            return 0;
        }
        return this.congSuat;
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap thoi gian bao hanh: ");
        this.thoiGianBaoHanh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap cong suat: ");
        this.congSuat = Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%-15s %-15s", this.thoiGianBaoHanh, this.congSuat);
    }
    public void ktKhaNang(){
        if (this.soLuongTonKho > 3 ){
            System.out.println("Hang co kha nang ban duoc");
        }
        else {
            System.out.println("Hang khong co kha nang ban duoc");
        }
    }

}
