package Bai1;

// Chaò thầy em là Xuân Trọng CNTT2 do lap em hỏng cam nên em để dòng ghi chú ở đây ạạ
import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDich {
    private String maGD;
    private LocalDate ngayGD;
    private double donGia;
    private double dienTich;

    public GiaoDich() {
    }
    public GiaoDich(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }


    public String getMaGD() {
        return this.maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public LocalDate getNgayGD() {
        return this.ngayGD;
    }

    public void setNgayGD(LocalDate ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return this.dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public double thanhTien(){
        return 0 ;
    }

    @Override
    public String toString() {
        return "{" +
            " maGD='" + getMaGD() + "'" +
            ", ngayGD='" + getNgayGD() + "'" +
            ", donGia='" + getDonGia() + "'" +
            ", dienTich='" + getDienTich() + "'" +
            "}";
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma giao dich: ");
        maGD = sc.nextLine();
        System.out.println("Nhap ngay giao dich: ");
        int ngay = sc.nextInt();
        System.out.println("Nhap thang giao dich: ");
        int thang = sc.nextInt();
        System.out.println("Nhap nam giao dich: ");
        int nam = sc.nextInt();
        ngayGD = LocalDate.of(ngay, thang, nam);
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("Nhap dien tich: ");
        dienTich = sc.nextDouble();

    }
}