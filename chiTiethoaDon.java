package Dichvuvahoadon;
/* còn thiếu 1 số file từ class thu cưng á sửa lại cho phù hợp tên biến nha  */
public class chiTiethoaDon {
    private ThuCung thuCung;
    private IDichVu dichVu;
    private Double giaDichVu;
public chiTiethoaDon(ThuCung thuCung, IDichVu dichVu) {
    this.thuCung = thuCung;
    this.dichVu = dichVu;
    this.giaDichVu = dichVu.tinhphidichvu();
}/**
     * Tính thành tiền cho dòng chi tiết hóa đơn này.*/

    public double tinhThanhTien() {
        return giaDichVu;
    }
public void xuatChiTiet() {
        System.out.print("   -> Thú cưng: " + thuCung.getTen() + " | ");
        dichVu.xuatthongtin();
    }
public ThuCung getThuCung() {
    return thuCung;
}
public void setThuCung(ThuCung thuCung) {
    this.thuCung = thuCung;}
public IDichVu getDichVu() {
    return dichVu;} 
public void setDichVu(IDichVu dichVu) {
    this.dichVu = dichVu;}
public Double getGiaDichVu() {
    return giaDichVu;}
public void setGiaDichVu(Double giaDichVu) {
    this.giaDichVu = giaDichVu;}

}
