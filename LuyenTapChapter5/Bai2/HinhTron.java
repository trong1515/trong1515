package Bai2;

public class HinhTron extends Hinh {
    private float bk;
    public HinhTron() {
    }
    public HinhTron(float bk, double dientich) {
        super(dientich);
        this.bk = bk;
    }
    public float getBk() {
        return bk;
    }
    public void setBk(float bk) {
        this.bk = bk;
    }
    public double dientich() {
        return bk * bk * 3.14;
    }

    @Override
    public String toString() {
        return "{" +
            " bk='" + getBk() + "'" +
            "}";
    }
    
}
