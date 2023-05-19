package Bai2;
import java.util.* ;
public class QuanLyHangHoa {
    ArrayList <HangHoa> list ;

    public QuanLyHangHoa(){
        list = new ArrayList<>();
    }
    public void themHangHoa(HangHoa hh){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hang hoa: ");
        int n = sc.nextInt();
        for ( int i = 1; i<= n; i++ ){
            System.out.println("Lan nhap thu " + i);
            if (hh instanceof HangDienMay){
                hh = new HangDienMay();
                hh.nhap();
            } else if (hh instanceof HangThucPham) {
                hh = new HangThucPham();
                hh.nhap();
            } else if (hh instanceof HangSanhSu) {
                hh = new HangSanhSu();
                hh.nhap();
            } 
            list.add(hh);
        }
    }
    public void xuatHangHoa( ){
        for ( HangHoa hh : list){
            if (hh instanceof HangDienMay){
                hh = new HangDienMay();
                hh.xuat();
            } else if (hh instanceof HangThucPham){
                hh = new HangThucPham();
                hh.xuat();
            } else if ( hh instanceof HangSanhSu){
                hh = new HangSanhSu();
                hh.xuat();
            }
        }
    }
    }
        
        
        
        

    
    
    
