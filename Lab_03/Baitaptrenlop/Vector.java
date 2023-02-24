package Lab_03.Baitaptrenlop;

public class Vector {
    private double x;
    private double y;
    private double z;
    public Vector(){
        this.x = 1.0;
        this.y = 1.0;
        this.z = 1.0;
    }
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public Vector cong(Vector a){
        double newx = this.x + a.x ;
        double newy = this.y + a.y ;
        double newz = this.z + a.z ;
        return new Vector(newx, newy, newz);
    }
    public Vector tru(Vector a){
        double newx = this.x - a.x ;
        double newy = this.y - a.y ;
        double newz = this.z - a.z ;
        return new Vector(newx, newy, newz);
    }
    public Vector nhanhangso(double k){
        double newx = this.x * k ;
        double newy = this.y * k ;
        double newz = this.z * k ;
        return new Vector(newx, newy, newz);
    }
    public double nhanvohuong(Vector a){
        return this.x * a.x + this.y * a.y + this.z * a.z;
    }
    public String toString(){
        return "{" +
            " x= " + getX() + " " +
            " y= " + getY() + " " +
            " z= " + getZ() + " " +
            "}";
    }
}
