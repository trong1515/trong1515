package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyKhachHang qlkh = new QuanLyKhachHang();
        KhachHang kh;
        int luachon = 0 ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("---Menu---\n"+
                    "1. Them khach hang\n"+
                    "2. Xuat danh sach khach hang\n"+
                    "3. Tong so luong tung loai khach hang \n"+
                    "4. Tinh trung binh thanh tien cua khach hang Viet Nam\n"+
                    "5. Xuat khach hang ngay hom nay\n"+
                    "0. Thoat\n");
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if ( luachon == 1 ){
                System.out.printf("1.Them hoa don khach hang VietNam\n"+
                        "2.Them hoa don khach hang nuoc ngoai\n"+
                        "Nhap lua chon: ");
                int i = sc.nextInt();
                if ( i == 1 ){
                    kh = new KhachHangVietNam();
                    qlkh.themKHGD(kh);
                }else if ( i == 2 ){
                    kh = new KhachHangNuocNgoai();
                    qlkh.themKHGD(kh);
                }

            }else if (luachon == 2){
                qlkh.xuatDSGD();
            }else if (luachon == 3){
                System.out.printf(" Nhap loai khach hang can dem :");
                sc.nextLine();
                String loai = sc.nextLine();
                System.out.println(" So luong khach hang la:" +qlkh.demSoLuong(loai));
            }else if (luachon == 4 ){
                System.out.println(" Tong thanh tien la:"+ qlkh.tinhTBThanhTien());
            }else if (luachon == 5 ){
                qlkh.xuatGDHomNay();
            }
        }while ( luachon != 0);
    }
}
