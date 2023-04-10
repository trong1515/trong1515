
public class XeOto extends Phuongtiendichuyen{
    String loaiNhienLieu;

    public XeOto(String loaiNhienLieu, String loaiPhuongTien, HangSanXuat hangSanXuat) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
   @Override
    public double layVanToc(){
        return 0;
    }
    
}