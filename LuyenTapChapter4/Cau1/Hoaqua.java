import java.util.Date;

public class Hoaqua {
    private String nguongoc = " ";
    private float giaban = 0 ;
    private int soluong = 0;
    private Date ngaynhap = new Date();
    public Hoaqua(){}
    public Hoaqua(String nguongoc, float giaban, int soluong, Date ngaynhap) {
        this.nguongoc = nguongoc;
        this.giaban = giaban;
        this.soluong = soluong;
        this.ngaynhap = ngaynhap;
    }
    public String getNguongoc() {
        return nguongoc;
    }
    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }
    public float getGiaban() {
        return giaban;
    }
    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public Date getNgaynhap() {
        return ngaynhap;
    }
    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    public float ThanhTien(){
        return giaban*soluong;
    }

    @Override
    public String toString() {
        return "{" +
            " nguongoc='" + getNguongoc() + "'" +
            ", giaban='" + getGiaban() + "'" +
            ", soluong='" + getSoluong() + "'" +
            ", ngaynhap='" + getNgaynhap() + "'" +
            ", ThanhTien='" + ThanhTien() + "'" +
            "}";
    }
}

