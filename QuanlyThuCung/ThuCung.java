package QuanlyThuCung;

public abstract class ThuCung {
    private String Ma;
    private String Ten;
    private int Tuoi;
    private double canNang;

    public ThuCung(String Ma, String Ten, int Tuoi, double canNang) {
        setMa(Ma);
        setTen(Ten);
        setTuoi(Tuoi);
        setcanNang(canNang);
    }

    public String getMa() { return Ma; }
    public String getTen() { return Ten; }
    public int getTuoi() { return Tuoi; }
    public double getcanNang() { return canNang; }

    public final void setMa(String Ma) {
        if (Ma == null || Ma.trim().isEmpty()) {
            throw new IllegalArgumentException("Ma khong duoc de trong!");
        }
        this.Ma = Ma.trim();
    }

    public final void setTen(String Ten) {
        if (Ten == null || Ten.trim().isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de trong!");
        }
        this.Ten = Ten.trim();
    }

    public final void setTuoi(int Tuoi) {
        if (Tuoi < 0) {
            throw new IllegalArgumentException("Tuoi khong duoc am!");
        }
        this.Tuoi = Tuoi;
    }

    public final void setcanNang(double canNang) {
        if (canNang <= 0) {
            throw new IllegalArgumentException("Can nang phai lon hon 0!");
        }
        this.canNang = canNang;
    }

    public abstract String getLoai();
}