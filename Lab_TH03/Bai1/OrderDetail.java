import java.util.*;

public class OrderDetail {
    private int quatity ;
    private  Product product;
    public OrderDetail(){

    }
    public OrderDetail(int quatity,Product product){
        this.quatity = quatity;
        this.product = product;
    }
    public double calcTotalPrice(){
        return quatity * product.getPrice();
    }
    public int getQuatity() {
        return this.quatity;
    }
    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }
    public OrderDetail(Product p, int x){
        this.product = p;
        this.quatity = x;
    }
    public void add (OrderDetail orderDetail){
    }
    public Product getProduct() {
        return this.product;
    }

    @Override
    public String toString() {
        return String.format ("%3d %5f", quatity, calcTotalPrice());
    }

}
