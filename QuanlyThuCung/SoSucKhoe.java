package QuanlyThuCung;

import java.util.ArrayList;
import java.util.Locale;

public class SoSucKhoe {
    private ThuCung thuCung;
    private ArrayList<String> lichSuTiemPhong;
    private double[] canNangTheoThang;  

    public SoSucKhoe(ThuCung thuCung) {
        if (thuCung == null) {
            throw new IllegalArgumentException("Thu cung khong duoc null!");
        }
        this.thuCung = thuCung;
        this.lichSuTiemPhong = new ArrayList<>();
        this.canNangTheoThang = new double[12];
    }

    public ThuCung getThuCung() { return thuCung; }
    public ArrayList<String> getLichSuTiemPhong() { return lichSuTiemPhong; }

    public void themTiemPhong(String thongTin) {
        if (thongTin == null || thongTin.trim().isEmpty()) {
            throw new IllegalArgumentException("Thong tin tiem phong khong duoc de trong!");
        }
        lichSuTiemPhong.add(thongTin.trim());
    }

    public void setCanNangThang(int thang, double kg) {
        if (thang < 1 || thang > 12) {
            throw new IllegalArgumentException("Thang phai tu 1 den 12!");
        }
        if (kg <= 0) {
            throw new IllegalArgumentException("Can nang phai lon hon 0!");
        }
        canNangTheoThang[thang - 1] = kg;
    }

    public double getCanNangThang(int thang) {
        if (thang < 1 || thang > 12) {
            throw new IllegalArgumentException("Thang phai tu 1 den 12!");
        }
        return canNangTheoThang[thang - 1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("So suc khoe cua [").append(thuCung.getTen()).append("]\n");
        sb.append("  Tiem phong: ");
        if (lichSuTiemPhong.isEmpty()) {
            sb.append("(chua co)");
        } else {
            sb.append(String.join("; ", lichSuTiemPhong));
        }
        sb.append("\n  Can nang theo thang: ");
        boolean coDuLieu = false;
        for (int i = 0; i < 12; i++) {
            if (canNangTheoThang[i] > 0) {
                sb.append(String.format(Locale.US, "T%d=%.1fkg  ", i + 1, canNangTheoThang[i]));
                coDuLieu = true;
            }
        }
        if (!coDuLieu) {
            sb.append("(chua co)");
        }
        return sb.toString();
    }
}