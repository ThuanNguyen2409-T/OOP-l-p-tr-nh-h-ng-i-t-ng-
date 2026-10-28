package product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class ThucAn extends SanPham {
    private String hanSuDung;
    private double khoiLuong;
    private String loaiThuCung;

    public ThucAn(String ma, String tenSanPham, double donGia, int soLuongTon, String hanSuDung, double khoiLuong, String loaiThuCung){
        super(ma, tenSanPham, donGia, soLuongTon);
    setHanSuDung(hanSuDung);
    setKhoiLuong(khoiLuong);
    setLoaiThuCung(loaiThuCung);
    }
    //Getter
    public String getHanSuDung(){
        return hanSuDung;
    }

    public double getKhoiLuong(){
        return khoiLuong;
    }

    public String getLoaiThuCung(){
        return loaiThuCung;
    }

    //Setter
    
    public void setHanSuDung(String hanSuDung){
    if(hanSuDung == null || hanSuDung.trim().isEmpty()){
        throw new IllegalArgumentException("Han su dung khong duoc de trong!");
    }

    DateTimeFormatter dinhDang = DateTimeFormatter
            .ofPattern("dd/MM/uuuu")
            .withResolverStyle(ResolverStyle.STRICT);

    try {
        LocalDate ngay = LocalDate.parse(hanSuDung, dinhDang);

        if(ngay.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("San pham da het han su dung!");
        }

        this.hanSuDung = hanSuDung;
    } catch(DateTimeParseException e){
        throw new IllegalArgumentException("Han su dung khong hop le! Dinh dang dd/MM/yyyy");
    }
    }


    public void setKhoiLuong(double khoiLuong){
        if(khoiLuong <= 0 || !Double.isFinite(khoiLuong)){
            throw new IllegalArgumentException("Khoi luong phai lon hon 0!");
        }
        this.khoiLuong = khoiLuong;
    }

    public void setLoaiThuCung(String loaiThuCung){
    if(loaiThuCung == null || loaiThuCung.trim().isEmpty()){
        throw new IllegalArgumentException("Loai thu cung khong duoc de trong!");
    }
    this.loaiThuCung = loaiThuCung;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Han su dung: " + hanSuDung);
        System.out.println("Khoi luong : " + khoiLuong);
        System.out.println("Loai thu cung : " + loaiThuCung);
    }
}
