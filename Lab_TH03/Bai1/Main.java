import java.util.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Nuoc tuong", 8000, "sp4");
        OrderDetail od1 = new OrderDetail(10, p1);
        Product p2 = new Product("Gao", 18000, "sp1");
        OrderDetail od2 = new OrderDetail(5, p2);
        Product p3 = new Product("Duong", 10000, "sp3");
        OrderDetail od3 = new OrderDetail(1, p3);
        Product p4 = new Product ("Gao", 18000, "sp1");
        OrderDetail od4 = new OrderDetail(1, p4);
        Order o1 = new Order(1, LocalDate.now());
        o1.lineItems = new ArrayList<>();
        o1.addLineItem(p1, od1.getQuatity());
        o1.addLineItem(p2, od2.getQuatity());
        o1.addLineItem(p3, od3.getQuatity());
        o1.addLineItem(p4, od4.getQuatity());
        System.out.println ("Ma HD :"+ o1.getOrderID());
        System.out.println ("Ngay Lap Hoa Don :"+ o1.getOrderDate());
        System.out.printf("\n%-5s %-10s %-15s %-15s %-15s %-20s",
                                         "STT",
                                         "| Ma SP",
                                         "|Mo ta ",
                                        " |Don gia",
                                        " |So luong",
                                        " |Thanh tien");
            for ( OrderDetail orderDetail : o1.getLineItems()) {
                System.out.printf("\n%-5s %-10s %-15s %-15s %-15s %-20s",
                                            o1.getLineItems().indexOf(orderDetail)+1,
                                        "|"+ orderDetail.getProduct().getProductID(),
                                        "|"+ orderDetail.getProduct().getDescription(),
                                        "|"+ orderDetail.getProduct().getPrice(),
                                        "|"+ orderDetail.getQuatity(),
                                        "|"+ orderDetail.calcTotalPrice() + " VND"
                                          );
            }   
            System.out.println("\nTong tien thanh toan :"+ o1.calcTotalCharge() + "  VND" );    
        
        }

    }

