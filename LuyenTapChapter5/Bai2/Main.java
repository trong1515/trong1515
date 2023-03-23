package Bai2;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(5, 6, 0);
        HinhTron ht = new HinhTron(5, 0);
        System.out.println("Dien tich hinh chu nhat: " + hcn.dientich());
        System.out.println("Dien tich hinh tron: " + ht.dientich());
        DanhSachHinh dsh = new DanhSachHinh();
        dsh.themHinh(hcn);
        dsh.themHinh(ht);
        dsh.inDanhSach();
    }
    
}
