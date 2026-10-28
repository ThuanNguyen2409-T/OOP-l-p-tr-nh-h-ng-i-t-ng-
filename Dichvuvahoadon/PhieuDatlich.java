
package Dichvuvahoadon;
import java.util.Date;
public class PhieuDatlich {
    private String maPhieu;
    private Date ngayDat;
    private IDichVu dichVu;
    private String TrangThai;

public PhieuDatlich(String maPhieu, Date ngayDat, IDichVu dichVu, String TrangThai) {
    this.maPhieu = maPhieu;
    this.ngayDat = ngayDat;
    this.dichVu = dichVu;
    this.TrangThai = TrangThai;}
public void xuatphieuDichVu(){
   System.out.print("Phiếu hẹn [Mã: " + maPhieu + "] - Lúc: " + ngayDat + " | ");
        // Tự động gọi hàm xuất thông tin của dịch vụ được chọn
        if (dichVu != null) {
            dichVu.xuatthongtin();
        }
        System.out.println(" - Trạng thái: " + TrangThai);
    }
public String getMaPhieu() {
    return maPhieu;}
public void setMaPhieu(String maPhieu) {
    this.maPhieu = maPhieu;}
public Date getNgayDat() {
    return ngayDat;}
public void setNgayDat(Date ngayDat) {
    this.ngayDat = ngayDat;}
public IDichVu getDichVu() {
    return dichVu;}

}
