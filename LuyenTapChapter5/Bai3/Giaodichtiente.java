package Bai3;
import java.util.Date;

public class Giaodichtiente extends Giaodich {
    private double tigia;
    private double tienEuro;
    private double tienUSD;
    public Giaodichtiente() {
    }
    public Giaodichtiente(String magiaodich, Date ngaygiaodich, double dongia, double soluong, double thanhtien, double tigia, double tienEuro, double tienUSD) {
        super(magiaodich, ngaygiaodich, dongia, soluong, thanhtien);
        this.tigia = tigia;
        this.tienEuro = tienEuro;
        this.tienUSD = tienUSD;
    }
    public double getTigia() {
        return tigia;
    }
    public void setTigia(double tigia) {
        this.tigia = tigia;
    }
    public double getTienEuro() {
        return tienEuro;
    }
    public void setTienEuro(double tienEuro) {
        this.tienEuro = tienEuro;
    }
    public double getTienUSD() {
        return tienUSD;
    }
    public void setTienUSD(double tienUSD) {
        this.tienUSD = tienUSD;
    }
    


}


    
