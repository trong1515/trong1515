package Bai1;

import java.util.*;
import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;

import java.awt.*;

public class QuanLyPhongHoc {
    private ArrayList <PhongHoc> list ;
    public QuanLyPhongHoc(){
        list = new ArrayList<PhongHoc>();
    }
    public void themPhongHoc(PhongHoc ph){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap so luong phong hoc can them : ");
        int n = sc.nextInt();
        for ( int i = 0; i < n; i++ ){
            System.out.printf("\nLan nhap phong hoc thu " +( i+1 ));
            if ( ph instanceof PhongHocLyThuyet ){
                ph = new PhongHocLyThuyet();
                ph.nhap();
            }
            else if ( ph instanceof PhongHocMayTinh ){
                ph = new PhongHocMayTinh();
                ph.nhap();
            } else if ( ph instanceof PhongHocThiNghiem ){
                ph = new PhongHocThiNghiem();
                ph.nhap();
            }
            boolean ktMaPhong = false ;
            for (PhongHoc ph1 : list){
                if (ph1.getMaPhong().equals(ph.getMaPhong())){
                    ktMaPhong = true;
                    break;
                }
            }
            if (ktMaPhong){
                System.out.println("\nDa xay ra loi !!");
                System.out.println("\nMa phong hoc da ton tai");
            }
            else {
                list.add(ph);
                System.out.println("\nDa them phong hoc");
            }
        } list.add(ph);

    }
    public void xuatPhongHoc(){
        for ( PhongHoc ph : list ){
            System.out.println(ph.toString());
        }
    }
    public PhongHoc timKiemPhongHoc(String maPhong){
        
        for ( PhongHoc ph : list ){
            if ( ph.getMaPhong().equalsIgnoreCase(maPhong)){
                return ph;       
            }
        }
        return null;
    }
    public void inPhongHocDatChuan(){
        System.out.println("\nDanh sach phong hoc dat chuan: ");
        for ( PhongHoc ph : list ){
                if (ph instanceof PhongHocLyThuyet){
                    if (ph.ktDatChuan()){
                        System.out.println(ph.toString());
                    }
                }else if (ph instanceof PhongHocMayTinh){
                    if (ph.ktDatChuan()){
                        System.out.println(ph.toString());
                    }
                }else if (ph instanceof PhongHocThiNghiem){
                    if (ph.ktDatChuan()){
                        System.out.println(ph.toString());
                    }
                }
    }
    
}
    public void sapXepTangDanTheoDayNha(){
        Collections.sort(this.list, new Comparator<PhongHoc>(){
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2){
                return ph1.getDayNha().compareTo(ph2.getDayNha());
            }
        });
    }
    public void sapXepTangDanTheoDienTich(){
        Collections.sort(this.list, new Comparator<PhongHoc>(){
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2){
                return (int) (ph2.getDienTich() - ph1.getDienTich());
            }
        });
    }
    public void sapXepTangDanTheoSoBongDen(){
        Collections.sort(this.list, new Comparator<PhongHoc>(){
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2){
                return (int) (ph1.getSoBongDen() - ph2.getSoBongDen());
            }
        });
    }
    public void capNhatMayTinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phong hoc can cap nhat :");
        String maPhong = sc.nextLine();
        for ( PhongHoc ph : list ){
            if ( ph.getMaPhong().equals(maPhong)){
                if ( ph instanceof PhongHocMayTinh ){
                    System.out.println("Nhap so may tinh moi :");
                    int soMayTinh = sc.nextInt();
                    ((PhongHocMayTinh) ph).setSoMayTinh(soMayTinh);
                    System.out.println("Da cap nhat so may tinh");
                }
            }
        }
    }
    public void xoaPhongHoc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phong hoc can xoa :");
        String maPhong = sc.nextLine();
        for ( PhongHoc ph : list ){
            if ( ph.getMaPhong().equals(maPhong)){
                list.remove(ph);
                System.out.println("Da xoa phong hoc");
            }
        }
    }
    public void inTongSoPhongHoc(){
        System.out.println("Tong so phong hoc la : " + list.size());
    }
    public void inPhongMay(){
        System.out.println(" Danh sach phong may co tren 60 may tinh : ") ;
        for ( PhongHoc ph : list ){
            if (ph instanceof PhongHocMayTinh && ((PhongHocMayTinh) ph).getSoMayTinh() > 60 ){
                System.out.println(ph.toString());
            } else {
                System.out.println("Khong co phong may nao co tren 60 may tinh");
            }
        }
    }
    public void authorCode(){
        System.out.println("\n======"+" Code was wtitten by Tram Xuan Trong "+"======");
    }
    public void menu(){
        System.out.println(" \n---------- QUAN LY PHONG HOC ----------\n"+
                            "1. Them phong hoc \n"+
                            "2. Tim kiem phong hoc\n"+
                            "3. In phong hoc dat chuan\n"+
                            "4. Sap xep phong hoc theo day nha\n"+
                            "5. Sap xep phong hoc theo dien tich\n"+
                            "6. Sap xep phong hoc theo so bong den\n"+
                            "7. Cap nhat so may tinh\n"+
                            "8. Xoa phong hoc\n"+
                            "9. In tong so phong hoc\n"+
                            "10. In danh sach phong may\n");
    }

}
