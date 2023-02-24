package Lab_03.Baitaptrenlop;

public class Square {
    private double canh;
    public Square (double canh){
        this.canh = canh;
    }
    public Square() {
        this.canh = 0.0;
    }
    public double getDientich(){
        return canh * canh;
    }
    public double getChuvi(){
        return 4 * canh;
    }
    private String getcanh() {
        return canh + "";
    }
    public String toString() {
        return "{" +
            " canh= " + getcanh() + " " +
            "}";
    }
    
}
