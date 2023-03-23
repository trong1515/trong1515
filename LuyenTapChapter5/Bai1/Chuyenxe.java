public class Chuyenxe {
    private String Masochuyen;
    private String Hotentaixe;
    private String Soxe;
    private float Doanhthu;
    public Chuyenxe() {
        Masochuyen = "";
        Hotentaixe = "";
        Soxe = "";
    }
    public Chuyenxe(String Masochuyen, String Hotentaixe, String Soxe, float Doanhthu) {
        this.Masochuyen = Masochuyen;
        this.Hotentaixe = Hotentaixe;
        this.Soxe = Soxe;
        this.Doanhthu = Doanhthu;
    }
    public String getMasochuyen() {
        return Masochuyen;
    }
    public void setMasochuyen(String Masochuyen) {
        this.Masochuyen = Masochuyen;
    }
    public String getHotentaixe() {
        return Hotentaixe;
    }
    public void setHotentaixe(String Hotentaixe) {
        this.Hotentaixe = Hotentaixe;
    }
    public String getSoxe() {
        return Soxe;
    }
    public void setSoxe(String Soxe) {
        this.Soxe = Soxe;
    }
    @Override
    public String toString() {
        return "Chuyenxe {" + " Masochuyen = " + Masochuyen + ", Hotentaixe = " + Hotentaixe + ", Soxe = " + Soxe + '}';
    }

}