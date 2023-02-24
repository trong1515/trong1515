package Lab_03.Bai2;

public class LibaryCard {
    private long lbCode;
    private String owner;
    private int borrowCount;
    public LibaryCard() {
        this.lbCode = 0;
        this.owner = "";
        this.borrowCount = 0;
    }
    public LibaryCard(long lbCode, String owner, int borrowCount) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }
    public long getLbCode(){
        return this.lbCode;
    }
    public String getOwner(){
        return this.owner;
    }
    public int getBorrowCount(){
        return this.borrowCount;
    }
    public void setLbCode(long code){
        this.lbCode = code;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void checkOut(int num){
        this.borrowCount += num;
    }
    public String toString(){
        return "{" +
            " lbCode='" + getLbCode() + "'" +
            ", owner='" + getOwner() + "'" +
            ", borrowCount='" + getBorrowCount() + "'" +
            "}";
    }
}
