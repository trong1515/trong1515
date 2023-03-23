public class Main {
    public static void main(String[] args){
        Chuyenxe cx = new Chuyenxe("CX01", "Nguyen Van A", "123456", 1000000);
        Chuyenxenoithanh cxnt = new Chuyenxenoithanh("Tuyen 1", 100, "CX02", "Nguyen Van B", "123456", 1000000);
        Chuyenxengoaithanh cxngt = new Chuyenxengoaithanh("Ha Noi", 5, "CX03", "Nguyen Van C", "123456", 1000000);
        DanhSachChuyenXe dscx = new DanhSachChuyenXe();
        dscx.themChuyenXe(cx);
        dscx.themChuyenXe(cxnt);
        dscx.themChuyenXe(cxngt);
        dscx.inDanhSach();
    }
}
