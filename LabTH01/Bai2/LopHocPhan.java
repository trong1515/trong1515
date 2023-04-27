package Bai2;
import java.util.ArrayList;
import java.util.Scanner;


public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongTinLopHoc;
    public ArrayList<SinhVien> dsSV = new ArrayList<>();
    public LopHocPhan(){

    }
    public LopHocPhan( String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, ArrayList<SinhVien> dsSV){
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongTinLopHoc = thongTinLopHoc;
        this.dsSV = dsSV;
    }
    public String getMaLHP(){
        return maLHP;
    }
    public void setMaLHP(String maLHP){
        this.maLHP = maLHP;
    }
    public String getTenLHP(){
        return tenLHP;
    }
    public void setTenLHP(String tenLHP){
        this.tenLHP = tenLHP;
    }
    public String getTenGV(){
        return tenGV;
    }
    public void setTenGV(String tenGV){
        this.tenGV = tenGV;
    }
    public String getThongTinLopHoc(){
        return thongTinLopHoc;
    }
    public void setThongTinLopHoc(String thongTinLopHoc){
        this.thongTinLopHoc = thongTinLopHoc;
    }
    public LopHocPhan(ArrayList<SinhVien> dsSV){
        this.dsSV = dsSV;   
    }

    public ArrayList<SinhVien> getDsSV(){
        return dsSV;
    }
    public void setDsSV(ArrayList<SinhVien> dsSV){
        this.dsSV = dsSV;
    }
    public void themSinhVien(SinhVien sv){
        dsSV.add(sv);
    }
    public void xoaSinhVien(SinhVien sv){
        dsSV.remove(sv);
    }
    public void inDanhSachSinhVien(){
        for (SinhVien sv : dsSV){
            System.out.println(sv.toString());
        }
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma lop hoc phan: ");
        maLHP = sc.nextLine();
        System.out.println("Nhap ten lop hoc phan: ");
        tenLHP = sc.nextLine();
        System.out.println("Nhap ten giao vien: ");
        tenGV = sc.nextLine();
        System.out.println("Nhap thong tin lop hoc: ");
        thongTinLopHoc = sc.nextLine();
    }

    @Override
    public String toString() {
        return "--------" +
            "- maLHP |" + getMaLHP() + "'" +
            "- tenLHP |" + getTenLHP() + "'" +
            "- tenGV |" + getTenGV() + "'" +
            "- thongTinLopHoc |'" + getThongTinLopHoc() + "'" +
            "Tong so sinh vien:'" + dsSV.size() + "'" +
            "----------";
    }

}
