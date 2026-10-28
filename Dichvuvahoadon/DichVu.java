package Dichvuvahoadon;

public abstract class DichVu {
    protected String maDV;
    protected String tenDV;
    protected double giaDV;


public DichVu(String maDV, String tenDV, Double giaDv){
    this.maDV = maDV;
    this.tenDV = tenDV;
    this.giaDV = giaDv;
}
//không có hàm khởi tạo sao chép và hàm clone

public void setMaDV(String maDV) {
    this.maDV = maDV;

}
public void setTenDV(String tenDV) {
    this.tenDV = tenDV;
}
public void setGiaDV(double giaDV) {
    this.giaDV = giaDV;
}
public String getMaDV() {
    return maDV;
}
public String getTenDV() {
    return tenDV;
}
public double getGiaDV() {
    return giaDV;
}

}

