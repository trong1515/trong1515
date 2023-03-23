public class Chuyenxenoithanh extends Chuyenxe {
    private String Sotuyen ;
    private float Sokm ;
    public Chuyenxenoithanh(String Sotuyen, float Sokm, String Masochuyen, String Hotentaixe, String Soxe, float Doanhthu) {
        super(Masochuyen, Hotentaixe, Soxe, Doanhthu);
        this.Sotuyen = Sotuyen;
        this.Sokm = Sokm;
    }
    public Chuyenxenoithanh() {
    }
    public String getSotuyen() {
        return Sotuyen;
    }
    public void setSotuyen(String Sotuyen) {
        this.Sotuyen = Sotuyen;
    }
    public float getSokm() {
        return Sokm;
    }
    public void setSokm(int Sokm) {
        this.Sokm = Sokm;
    }
    public float Doanhthu() {
        return Sokm * 15000;
    }

    @Override
    public String toString() {
        return "{" +
            "Masochuyen ='" + getMasochuyen() + "'" +
            ", Hotentaixe ='" + getHotentaixe() + "'" +
            ", Soxe='" + getSoxe() + "'" +
            " Sotuyen ='" + getSotuyen() + "'" +
            ", Sokm ='" + getSokm() + "'" +
            ", Doanhthu ='" + Doanhthu() + "'" +
            "}";
    }
    
}
