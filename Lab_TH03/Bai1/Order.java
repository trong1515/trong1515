import java.time.*;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private int count;
    ArrayList <OrderDetail> lineItems;
    public Order(){

    }
    public Order(int orderID,LocalDate orderDate){
        this.orderID = orderID;
        this.orderDate = orderDate;
    }
    public void addLineItem(Product p, int x){
        lineItems.add(new OrderDetail(p,x));
        count++;
    }
    public double calcTotalCharge(){
        double total = 0 ;
        for (OrderDetail orderDetail : lineItems) {
            total += orderDetail.calcTotalPrice();
        }
        return total;
    
    }

    @Override
    public String toString() {
        return String.format("%-5d %-10s", orderID, orderDate);
    }
    public ArrayList<OrderDetail> getLineItems() {
        return this.lineItems;
    }
    public LocalDate getOrderDate() {
        return this.orderDate;
    }
    public int getOrderID() {
        return this.orderID;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }


    

}
