package QuanlyThuCung;
 
public class SoSucKhoe {
    private ThuCung thuCung;
    private String lichSuTiemPhong;
    private double canNangTheoThang;
 
    public SoSucKhoe(ThuCung thuCung, String lichSuTiemPhong, double canNangTheoThang) {
        this.thuCung=thuCung;
        this.lichSuTiemPhong=lichSuTiemPhong;
        this.canNangTheoThang=canNangTheoThang;
    }
 
    public ThuCung getthuCung() { return thuCung; }
    public String getlichSuTiemPhong() { return lichSuTiemPhong; }
    public double getcanNangTheoThang() {return canNangTheoThang; }
 
    public void setthuCung(ThuCung thuCung) { this.thuCung=thuCung; }
    public void setlichSuTiemPhong(String lichSuTiemPhong) { this.lichSuTiemPhong=lichSuTiemPhong; }
    public void setcanNangTheoThang(double canNangTheoThang) { this.canNangTheoThang=canNangTheoThang; }
 
    @Override
    public String toString() {
        return String.format("Sổ sức khỏe của [%s] | Tiêm phòng: %s | Cân nặng: %.1fkg",
                thuCung.getTen(), lichSuTiemPhong, canNangTheoThang);
    }
}