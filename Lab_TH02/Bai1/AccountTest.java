package Bai1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args ){
        AccountList a = new AccountList();
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        int luachon = 0 ;
        do{
            a.menu();
            System.out.println("Nhap lua chon cua ban: ");
            luachon = sc.nextInt();
            if (luachon == 1){
                a.themTK(ac);
            }
            if (luachon == 2 ){
                System.out.printf("So tai khoan hien co: " + a.demTK());
                
            }
            if ( luachon == 3){
                a.inTK();
            }
            if (luachon == 4){
               a.napTien();
            }
            if (luachon == 5){
                a.rutTien();
            }
            if (luachon == 6){
               a.chuyenTien();
            }
        } while (luachon != 0);
        

    }
}