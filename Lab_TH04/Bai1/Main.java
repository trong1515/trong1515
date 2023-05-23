package Bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich qlgd = new QuanLyGiaoDich();
        GiaoDich gd ;
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.printf("---Menu---\n"+
                    "1. Them giao dich\n"+
                    "2. Xuat danh sach giao dich\n"+
                    "3. Tong so luong tung loai giao dich \n"+
                    "4. Tinh trung binh thanh tien cua giao dich dat\n"+
                    "5. Xuat giao dich ngay hom nay\n"+
                    "0. Thoat\n");
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if ( luachon == 1 ){
                System.out.printf("1. Giao dich dat\n"+
                        "2. Giao dich nha\n"+
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if ( i == 1){
                    gd = new GiaoDichDat();
                    qlgd.themGD(gd);
                } else if ( i == 2){
                    gd = new GiaoDichNha();
                    qlgd.themGD(gd);
                }
            }else if ( luachon == 2 ){
                qlgd.xuatGD();
            } else if ( luachon == 3){
                System.out.printf(" Nhap loai giao dich can dem :");
                sc.nextLine();
                String loai = sc.nextLine();
                System.out.println(" So luong giao dich la:" +qlgd.demSoLuong(loai));

            }else if ( luachon == 4){
                System.out.println(" Tong thanh tien la:"+ qlgd.tinhTBThanhTien());
            }else if ( luachon == 5){
                qlgd.XuatGDHomNay();
            }
        } while ( luachon != 0);
    }
}