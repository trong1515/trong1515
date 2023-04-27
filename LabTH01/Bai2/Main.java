package Bai2;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args){
        SinhVien sv = new SinhVien();
        LopHocPhan lhp = new LopHocPhan( );
        Scanner sc = new Scanner(System.in);
        lhp = new LopHocPhan();
        sv.nhap();
        lhp.themSinhVien(sv);
        lhp.toString();

    }
}
