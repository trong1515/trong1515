import java.util.ArrayList;

public class DanhSachChuyenXe {
    ArrayList Chuyenxe = new ArrayList();
    public void themChuyenXe(Chuyenxe cx) {
        Chuyenxe.add(cx);
    }
    public void inDanhSach() {
        for (int i = 0; i < Chuyenxe.size(); i++) {
            System.out.println(Chuyenxe.get(i));
        }
    }
    
}
