package Bai2;
import java.util.ArrayList;

public class DanhSachHinh {
    ArrayList Hinh = new ArrayList();
    public void themHinh(Hinh h) {
        Hinh.add(h);
    }
    public void inDanhSach() {
        for (int i = 0; i < Hinh.size(); i++) {
            System.out.println(Hinh.get(i));
        }
    }
    
}
