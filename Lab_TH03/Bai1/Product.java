public class Product {
    private String description;
    private double price;
    private String productID;
    public Product(){

    }
    public Product(String description,double price,String productID){
        this.description = description;
        this.price = price;
        this.productID = productID;
    }
    public String getDescription() {
        return this.description;
    }
    public String getProductID() {
        return this.productID;
    }
    public double getPrice() {
        return this.price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return String.format("%-7s %-10s %-5f", productID, description, price);
    }

}
