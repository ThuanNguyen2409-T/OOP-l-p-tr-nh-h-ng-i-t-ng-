package product;

public class PhuKien extends SanPham {
    private String loaiPhuKien;
    private String kichThuoc;

    public PhuKien(String ma, String tenSanPham, double donGia, int soLuongTon, String loaiPhuKien, String kichThuoc){
        super(ma, tenSanPham, donGia, soLuongTon);
        setLoaiPhuKien(loaiPhuKien);
        setKichThuoc(kichThuoc);
    }
    
    //getter
    public String getLoaiPhuKien(){
        return loaiPhuKien;
    }

    public String getKichThuoc(){
        return kichThuoc;
    }

    //setter
    public void setLoaiPhuKien(String loaiPhuKien){
        if(loaiPhuKien == null || loaiPhuKien.trim().isEmpty()){
            throw new IllegalArgumentException("Loai phu kien khong duoc de trong!");
        }
        this.loaiPhuKien = loaiPhuKien;
    }

    
    public void setKichThuoc(String kichThuoc){
    if(kichThuoc == null ||
        (!kichThuoc.equalsIgnoreCase("S") && !kichThuoc.equalsIgnoreCase("M") && !kichThuoc.equalsIgnoreCase("L") && !kichThuoc.equalsIgnoreCase("XL"))){
        throw new IllegalArgumentException("Kich thuoc chi duoc la S, M, L hoặc XL!");
    }
    this.kichThuoc = kichThuoc.toUpperCase();
    }


    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Loai phu kien: " + loaiPhuKien);
        System.out.println("Kich thuoc: " + kichThuoc);
    }
}
