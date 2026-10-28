package Dichvuvahoadon;

public class DichvuKhambenh  extends DichVu implements IDichVu {
    private String chieutrung;
 public DichvuKhambenh(String maDV, String tenDV, Double giaDv, String chieutrung) {
    super(maDV, tenDV, giaDv);
    this.chieutrung = chieutrung;
    }
@Override
public double tinhphidichvu() {
    
    if (chieutrung.equalsIgnoreCase("Trọn gói")) {
        return giaDV * 1.5;
    }
    return giaDV;}
@Override
public void xuatthongtin(){
    System.out.println("[Dịch vụ Khám bệnh] Mã: " + maDV + " | Tên: " + tenDV +   " | Chi tiết : " + chieutrung + " | Phí dịch vụ: " + tinhphidichvu());
}
public String getChieutrung() {
    return chieutrung;}
public void setChieutrung(String chieutrung) {
    this.chieutrung = chieutrung;}
    
}
