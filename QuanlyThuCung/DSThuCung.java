package QuanlyThuCung;
import java.util.*;
 
public class DSThuCung {
    private ArrayList<ThuCung> danhSach = new ArrayList<>();
    public void themThuCung(ThuCung tc) {
        danhSach.add(tc);
    }
 
    public void hienThiDanhSach() {
        if(danhSach.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for(ThuCung tc : danhSach) {
            System.out.println(tc);
        }
    }
}
 