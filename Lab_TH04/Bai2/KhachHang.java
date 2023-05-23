// Trầm Xuân Trọng CNTT2
package Bai2;
import java.time.LocalDate;
import java.util.Scanner;

public class KhachHang {
    private String maKH, hoTen ;
    LocalDate ngayRaHoaDon ;

    public KhachHang(){

    }
    public KhachHang(String maKH, String hoTen, LocalDate ngayRaHoaDon){
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public String getMaKH() {
        return this.maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgayRaHoaDon() {
        return this.ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(LocalDate ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }
    public double thanhTien(){
        return 0 ;
    }
    @Override
    public String toString(){
        return "{" +
            " maKH='" + getMaKH() + "'" +
            ", hoTen='" + getHoTen() + "'" +
            ", ngayRaHoaDon='" + getNgayRaHoaDon() + "'" +
            "}";
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ma khach hang: ");
        maKH = sc.nextLine();
        System.out.printf("Nhap ho ten khach hang: ");
        hoTen = sc.nextLine();
        System.out.printf("Nhap ngay ra hoa don: ");
        int ngay = sc.nextInt();
        System.out.printf("Nhap thang ra hoa don: ");
        int thang = sc.nextInt();
        System.out.printf("Nhap nam ra hoa don: ");
        int nam = sc.nextInt();
        ngayRaHoaDon = LocalDate.of(nam, thang, ngay);
    }
}
