package Dichvuvahoadon;

public  class DichVuspa  extends DichVu  implements IDichVu {
    private String  goiSpa;
public DichVuspa(String maDV, String tenDV, Double giaDv, String goiSpa) {
    super(maDV, tenDV, giaDv);
    this.goiSpa = goiSpa;
}
@Override 
public double tinhphidichvu() {
     if (goiSpa.equalsIgnoreCase("Trọn gói")) {
            return giaDV * 1.3;
        }
        return giaDV;
}
@Override 
public void xuatthongtin(){
    System.out.println("[Dịch vụ Spa] Mã: " + maDV + " | Tên: " + tenDV +   " | Gói: " + goiSpa + " | Phí dịch vụ: " + tinhphidichvu());
}
public String getGoiSpa() {
    return goiSpa;}
public void setGoiSpa(String goiSpa) {
    this.goiSpa = goiSpa;}

}
