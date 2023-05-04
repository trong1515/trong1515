package Bai2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CDList {
    ArrayList <CD> cds ;
    CD cd = new CD();
    public CDList(){
        cds = new ArrayList<>();
    }
    public void themCD(CD cd){
        cd = new CD();
        cd.nhap();
        boolean kt = false;
        for (CD cd1 : cds){
            if (cd1.getMaCD() == cd.getMaCD()){
                kt = true;
                break;
            }
        }
        if (kt){
            System.out.println("Ma CD da ton tai");
        }
        else {
            cds.add(cd);
            System.out.println("Da them CD");
        }
            
    }
    public int demCD(){
        return cds.size();
    }
    public void tongGiaCD(){
        double tong = 0;
        for (int i = 0; i < cds.size(); i++){
            tong += cds.get(i).getGiaThanh();
        }
        System.out.println("Tong gia CD: " + tong);
    }
    public void sapXepgiamtheogiathanh(){
        Collections.sort(this.cds, new Comparator<CD>() {
        @Override
        public int compare(CD o1, CD o2) {
          return (int) (o2.getGiaThanh() - o1.getGiaThanh());
        }
        });
    }
    public void sapXeptheotuaCD(){
    Collections.sort(this.cds, new Comparator<CD>() {
        @Override
        public int compare(CD o1, CD o2) {
          return o1.getTuaCD().compareTo(o2.getTuaCD());
        }
      });
    }
    public void inThongTin(){
        for (CD a : cds) {
            System.out.println(a.toString());
        }
    }
    public void menu(){
        System.out.println("\n-------- QUAN LY CD --------\n"+
                                 "\n1. Them CD"+
                                "\n2. Dem so luong CD"+
                                "\n3. Tinh tong gia CD"+
                                "\n4. Sap xep giam dan theo gia thanh"+
                                 "\n5. Sap xep theo tua CD"+
                                "\n6. In thong tin CD"+
                                "\n0. Thoat");
    }
}
