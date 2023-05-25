package Bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        QuanLyPhongHoc ql = new QuanLyPhongHoc();
        PhongHoc ph = new PhongHoc();
        Scanner sc = new Scanner(System.in);
        ql.authorCode();
        int luachon = 0 ;
        do {
            ql.menu();
            System.out.printf("Nhap lua chon cua ban : ");
            luachon = sc.nextInt();
            if (luachon == 1){
                System.out.printf("1. Phong Hoc Ly Thuyet\n"+
                            "2. Phong Hoc May Tinh\n"+
                            "3. Phong Hoc Thi Nghiem\n");
                System.out.printf("Nhap lua chon cua ban : ");
                int i = sc.nextInt();
                if (i == 1){
                    ph = new PhongHocLyThuyet();
                    ql.themPhongHoc(ph);
                }else if (i == 2){
                    ph = new PhongHocMayTinh();
                    ql.themPhongHoc(ph);
                }else if (i == 3){
                    ph = new PhongHocThiNghiem();
                    ql.themPhongHoc(ph);
                }
            }else if (luachon == 2){
                Scanner sd = new Scanner(System.in);
                System.out.println("Nhap ma phong hoc can tim :");
                String mphong = sd.nextLine();
                System.out.println(ql.timKiemPhongHoc(mphong).toString());
            }else if (luachon == 3){
                ql.xuatPhongHoc();
            }else if (luachon == 4){
                ql.inPhongHocDatChuan();
            }else if (luachon == 5){
                ql.sapXepTangDanTheoDayNha();
            }else if (luachon == 6){
                ql.sapXepTangDanTheoDienTich();
            }else if (luachon == 7){
                ql.sapXepTangDanTheoSoBongDen();
            }else if (luachon == 8){
                ql.capNhatMayTinh();;
            }else if (luachon == 9){
                ql.xoaPhongHoc();
            }else if (luachon == 10){
                ql.xuatPhongHoc();
            }
        } while ( luachon != 0 );
    }
}
