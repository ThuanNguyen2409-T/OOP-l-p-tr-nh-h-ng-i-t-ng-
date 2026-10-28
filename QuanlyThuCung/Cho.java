package QuanlyThuCung;
 
public class Cho extends ThuCung {
    private String giongCho;
    private String mucDoVanDong;
 
    public Cho(String Ma, String Ten, int Tuoi, double canNang, String giongCho, String mucDoVanDong) {
        super(Ma, Ten, Tuoi, canNang);
        this.giongCho = giongCho;
        this.mucDoVanDong = mucDoVanDong;
    }
 
    public String getgiongCho() { return giongCho; }
    public String getmucDoVanDong() { return mucDoVanDong; }
 
    public void setgiongCho(String giongCho) { this.giongCho=giongCho; }
    public void setmucDoVanDong(String mucDoVanDong) { this.mucDoVanDong=mucDoVanDong; }
 
    @Override
    public String getLoai() {
        return "Chó";
    }
 
    @Override
    public String toString() {
        return String.format("[%s] Mã: %s | Tên: %s | Tuổi: %d | Nặng: %.1fkg | Giống: %s | Vận động: %s",
                getLoai(), getMa(), getTen(), getTuoi(), getcanNang(), giongCho, mucDoVanDong);
    }
}