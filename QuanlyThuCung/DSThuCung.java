package QuanlyThuCung;

import java.util.ArrayList;

public class DSThuCung {
    private ArrayList<ThuCung> danhSach;

    public DSThuCung() {
        danhSach = new ArrayList<>();
    }

    public boolean themThuCung(ThuCung tc) {
        if (tc == null) {
            return false;
        }

        if (timThuCung(tc.getMa()) != null) {
            return false;
        }

        danhSach.add(tc);
        return true;
    }

    public ThuCung timThuCung(String ma) {
        for (ThuCung tc : danhSach) {
            if (tc.getMa().equalsIgnoreCase(ma)) {
                return tc;
            }
        }
        return null;
    }

    public ArrayList<ThuCung> timTheoTen(String ten) {
        ArrayList<ThuCung> ketQua = new ArrayList<>();
        for (ThuCung tc : danhSach) {
            if (tc.getTen().toLowerCase().contains(ten.toLowerCase())) {
                ketQua.add(tc);
            }
        }
        return ketQua;
    }

    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach thu cung trong!");
            return;
        }

        for (ThuCung tc : danhSach) {
            System.out.println(tc);
            System.out.println("-------------------------");
        }
    }

    public boolean xoaThuCung(String ma) {
        ThuCung tc = timThuCung(ma);

        if (tc != null) {
            danhSach.remove(tc);
            return true;
        }

        return false;
    }

    public boolean suaThuCung(String ma, int luaChon, String giaTriMoi) {
        ThuCung tc = timThuCung(ma);

        if (tc == null) {
            return false;
        }

        try {
            switch (luaChon) {
                case 1:
                    tc.setTen(giaTriMoi);
                    break;

                case 2:
                    int tuoi = Integer.parseInt(giaTriMoi);
                    tc.setTuoi(tuoi);
                    break;

                case 3:
                    double canNang = Double.parseDouble(giaTriMoi);
                    tc.setcanNang(canNang);
                    break;

                case 4:
                    if (tc instanceof Cho) {
                        Cho cho = (Cho) tc;
                        cho.setgiongCho(giaTriMoi);
                    } else {
                        return false;
                    }
                    break;

                case 5:
                    if (tc instanceof Cho) {
                        Cho cho = (Cho) tc;
                        cho.setmucDoVanDong(giaTriMoi);
                    } else {
                        return false;
                    }
                    break;

                case 6:
                    if (tc instanceof Meo) {
                        Meo meo = (Meo) tc;
                        meo.setloaiLong(giaTriMoi);
                    } else {
                        return false;
                    }
                    break;

                case 7:
                    if (tc instanceof Meo) {
                        Meo meo = (Meo) tc;
                        meo.settapTinh(giaTriMoi);
                    } else {
                        return false;
                    }
                    break;

                default:
                    return false;
            }
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }

    //(đọc/ghi file, hóa đơn...) lấy danh sách
    public ArrayList<ThuCung> getDanhSach() {
        return danhSach;
    }
}