public class Chuyenxengoaithanh extends Chuyenxe {
    private String Noiden = " Long An ";
    private int Songay= 20 ;
    public Chuyenxengoaithanh(String Noiden, int Songay, String Masochuyen, String Hotentaixe, String Soxe, float Doanhthu) {
        super(Masochuyen, Hotentaixe, Soxe, Doanhthu);
        this.Noiden = Noiden;
        this.Songay = Songay;
    }
    public Chuyenxengoaithanh() {
    }
    public String getNoiden() {
        return Noiden;
    }
    public void setNoiden(String Noiden) {
        this.Noiden = Noiden;
    }
    public int getSongay() {
        return Songay;
    }
    public void setSongay(int Songay) {
        this.Songay = Songay;
    }
    public float Doanhthu() {
        return Songay * 100000;
    }

    @Override
    public String toString() {
        return "{" +
            "MaSoChuyen='" + getMasochuyen() + "'" +
            ", HoTenTaiXe='" + getHotentaixe() + "'" +
            ", SoXe='" + getSoxe() + "'" +
            " Noiden='" + getNoiden() + "'" +
            ", Songay='" + getSongay() + "'" +
            ", Doanhthu='" + Doanhthu() + "'" +
            "}";
    }

}
