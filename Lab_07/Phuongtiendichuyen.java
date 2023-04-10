
public abstract class Phuongtiendichuyen {

    public String loaiPhuongTien;
    HangSanXuat hangSanXuat;

    public Phuongtiendichuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat() {
        return hangSanXuat.tenHangSanXuat;
    }

    public void BatDau() {

    }

    public void tangToc() {

    }

    public void dungLai() {

    }

    public abstract double layVanToc();

    class HangSanXuat {

        public String tenHangSanXuat, tenQuocGia;

        public HangSanXuat(String a, String b) {
            tenHangSanXuat = a;
            tenQuocGia = b;
        }
    }
}