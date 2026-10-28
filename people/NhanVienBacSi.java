package people;

public class NhanVienBacSi extends NhanVien {
    private String chuyenMon;
    private double phuCapKham;

    public NhanVienBacSi(String ma, String hoTen, String sdt, String email, double heSoLuong, String ngayVaoLam, String chuyenMon, double phuCapKham){
        super(ma, hoTen, sdt, email, heSoLuong, ngayVaoLam);
        setChuyenMon(chuyenMon);
        setPhuCapKham(phuCapKham);
    }

    //getter
    public String getChuyenMon(){
        return chuyenMon;
    }
    public double getPhuCapKham(){
        return phuCapKham;
    }

    //setter
    public void setChuyenMon(String chuyenMon){
        if(chuyenMon == null || chuyenMon.trim().isEmpty()){
            throw new IllegalArgumentException("Chuyen mon khong duoc de trong!");
        }
        this.chuyenMon = chuyenMon;
    }
    
    public void setPhuCapKham(double phuCapKham){
        if(phuCapKham < 0 || !Double.isFinite(phuCapKham)){
            throw new IllegalArgumentException("Phu cap kham khong duoc am!");
        }
        this.phuCapKham = phuCapKham;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Phu cap kham: " + phuCapKham);
    }
}
