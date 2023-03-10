import java.util.Date;

public class CamCaoPhong extends Quacam {
    private String nguongoc;
    private float giaban;
    private int soluong;
    private Date ngaynhap;
    public CamCaoPhong(){}
    public CamCaoPhong(String nguongoc, float giaban, int soluong, Date ngaynhap) {
        super(nguongoc, giaban, soluong, ngaynhap);
        this.ngaynhap = ngaynhap;
    }
}