package Bai2;

import java.util.Scanner;

public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double giaThanh;
    public CD(){
        maCD = 999999;
        tuaCD = "Chua xac dinh";
    }
    public CD ( int maCD, String tuaCD, int soBaiHat, double giaThanh){
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return this.maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return this.tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public int getSoBaiHat() {
        return this.soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return this.giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }   
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma CD: ");
        maCD = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap tua CD: ");
        tuaCD = sc.nextLine();
        System.out.println("Nhap so bai hat: ");
        soBaiHat = sc.nextInt();
        System.out.println("Nhap gia thanh: ");
        giaThanh = sc.nextDouble();
    }
    @Override
    public String toString() {
        return "{" +
            " maCD='" + getMaCD() + "'" +
            ", tuaCD='" + getTuaCD() + "'" +
            ", soBaiHat='" + getSoBaiHat() + "'" +
            ", giaThanh='" + getGiaThanh() + "'" +
            "}";
    }
    public int size() {
        return 0;
    }


}
