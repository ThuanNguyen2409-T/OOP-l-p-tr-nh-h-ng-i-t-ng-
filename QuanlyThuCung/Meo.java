package QuanlyThuCung;
 
public class Meo extends ThuCung {
    private String loaiLong;
    private String tapTinh;
 
    public Meo(String Ma, String Ten, int Tuoi, double canNang, String loaiLong, String tapTinh) {
        super(Ma, Ten, Tuoi, canNang);
        this.loaiLong = loaiLong;
        this.tapTinh = tapTinh;
    }
 
    public String getloaiLong() { return loaiLong; }
    public String gettapTinh() { return tapTinh; }
 
    public void setloaiLong(String loaiLong) { this.loaiLong=loaiLong; }
    public void settapTinh(String tapTinh) { this.tapTinh=tapTinh; }
 
    @Override
    public String getLoai() {
        return "Mèo";
    }
 
    @Override
    public String toString() {
        return String.format("[%s] Mã: %s | Tên: %s | Tuổi: %d | Nặng: %.1fkg | Lông: %s | Tập tính: %s",
                getLoai(), getMa(), getTen(), getTuoi(), getcanNang(), loaiLong, tapTinh);
    }
}