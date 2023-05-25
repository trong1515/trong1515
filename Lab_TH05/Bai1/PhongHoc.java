package Bai1;
import java.util.* ;

public class PhongHoc {
    private String maPhong;
    private String dayNha;
    private double dienTich;
    private int soBongDen;

    public PhongHoc() {
    }
    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen){
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return this.maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return this.dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return this.dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return this.soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma phong: ");
        this.maPhong = sc.nextLine();
        System.out.print("\nNhap day nha: ");
        this.dayNha = sc.nextLine();
        System.out.print("\nNhap dien tich: ");
        this.dienTich = sc.nextDouble();
        System.out.print("\nNhap so bong den: ");
        this.soBongDen = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ma phong: " + this.maPhong);
        System.out.println("Day nha: " + this.dayNha);
        System.out.println("Dien tich: " + this.dienTich);
        System.out.println("So bong den: " + this.soBongDen);
    }

    @Override
    public String toString() {
        return "[" +
            " Ma Phong : '" + getMaPhong() + "'" +
            ", Day Nha : '" + getDayNha() + "'" +
            ", Dien Tich ='" + getDienTich() + "'" +
            ", So Bong Den'" + getSoBongDen() + "'" +
            "]";
    }
    public boolean ktDatChuan(){
        if(dienTich/soBongDen <= 10){
            return true;
        }
        return false;
    }
}