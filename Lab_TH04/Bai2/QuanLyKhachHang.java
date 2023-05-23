package Bai2;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
public class QuanLyKhachHang {
    private ArrayList<KhachHang> kh ;

    public QuanLyKhachHang(){
        kh = new ArrayList<KhachHang>();
    }
    public void themKHGD(KhachHang k){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong khach hang can them:");
        int n = sc.nextInt();
        for ( int i = 0; i < n ; i++){
            System.out.println ("Lan nhap thu "+ (i + 1));
            if (k instanceof KhachHangVietNam){
                k = new KhachHangVietNam();
                k.nhap();
            } else if ( k instanceof KhachHangNuocNgoai){
                k = new KhachHangNuocNgoai();
                k.nhap();
            }
            kh.add(k);
        }
    }
    public void xuatDSGD(){
        for ( KhachHang k : kh){
            System.out.println(k.toString());
            System.out.println("Thanh tien: " + k.thanhTien());
        }
    }
    public int demSoLuong(String loai){
        int count = 0;
        for (KhachHang k : kh){
            if (k instanceof KhachHangVietNam && loai.equalsIgnoreCase("VietNam")){
                count++;
            } else if (k instanceof KhachHangNuocNgoai && loai.equalsIgnoreCase("nuocngoai")){
                count++;
            }
        }
        return count;
    }
    public double tinhTBThanhTien(){
        double tongThanhTien = 0;
        int dem = 0;
        for (KhachHang k : kh){
            if ( k instanceof KhachHangVietNam){
                tongThanhTien += k.thanhTien();
                dem++;
            }
        }
        if (dem != 0){
            return (tongThanhTien/dem) ;
        } else {
            return 0;
        }
    }
    public void xuatGDHomNay(){
        for (KhachHang k : kh ){
            if (k.getNgayRaHoaDon().equals(LocalDate.now())){
                System.out.println(k.toString());
                System.out.println("Thanh tien: " + k.thanhTien());
            }
        }
    }
    
}
