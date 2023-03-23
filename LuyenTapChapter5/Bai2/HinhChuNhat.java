package Bai2;

public class HinhChuNhat extends Hinh {
    private float cd;
    private float cr;
    public HinhChuNhat() {
    }
    public HinhChuNhat(float cd, float cr, double dientich) {
        super(dientich);
        this.cd = cd;
        this.cr = cr;
    }
    public float getCd() {
        return cd;
    }
    public void setCd(float cd) {
        this.cd = cd;
    }
    public float getCr() {
        return cr;
    }
    public void setCr(float cr) {
        this.cr = cr;
    }
    public double dientich() {
        return cd * cr;
    }

    @Override
    public String toString() {
        return "{" +
            " cd='" + getCd() + "'" +
            ", cr='" + getCr() + "'" +
            "}";
    }

    
    
}
