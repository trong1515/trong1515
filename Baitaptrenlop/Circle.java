package Lab_03.Baitaptrenlop;

public class Circle {
    private double bankinh;
    public Circle (double bankinh){
        this.bankinh = bankinh;
    }
    public Circle() {
        this.bankinh = 0.0;
    }
    public double getDientich(){
        return Math.PI * bankinh * bankinh;
    }
    public double getChuvi(){
        return 2 * Math.PI * bankinh;
    }
    private String getbankinh() {
        return bankinh + "";
    }
    public String toString() {
        return "{" +
            " bankinh= " + getbankinh() + " " +
            "}";
    }
}
