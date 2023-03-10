import java.util.Date;

public class CamSanh extends Quacam {
    private String nguongoc;
    private float giaban;
    private int soluong;
    private Date ngaynhap;
        public CamSanh(){}
            public CamSanh(String nguongoc, float giaban, int soluong, Date ngaynhap) {
                super(nguongoc, giaban, soluong, ngaynhap);
            }
}

