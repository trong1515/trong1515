package Bai1b;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static Object sc;

    public static void main (String[] args){
        HangThucPham htp1 = new HangThucPham();
        htp1.add (new HangThucPham(001, "Gao", 100000, LocalDate.of(2018, 07, 10), LocalDate.of(2018 , 07, 10)));
}
}