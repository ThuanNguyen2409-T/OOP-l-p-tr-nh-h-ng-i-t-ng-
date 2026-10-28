package QuanlyThuCung;
 
public abstract class ThuCung {
    private String Ma;
    private String Ten;
    private int Tuoi;
    private double canNang;
 
    public ThuCung(String Ma, String Ten, int Tuoi, double canNang) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.canNang = canNang;
    }
 
    public String getMa() { return Ma; }
    public String getTen() { return Ten; }
    public int getTuoi() { return Tuoi; }
    public double getcanNang() { return canNang; }
 
    public void setMa(String Ma) { this.Ma=Ma; }
    public void setTen(String Ten) { this.Ten=Ten; }
    public void setTuoi(int Tuoi) { this.Tuoi=Tuoi; }
    public void setcanNang(double canNang) {this.canNang=canNang; }
 
    public abstract String getLoai();
}
 
