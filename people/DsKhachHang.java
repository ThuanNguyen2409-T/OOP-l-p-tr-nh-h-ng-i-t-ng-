package people;

import java.util.ArrayList;

public class DsKhachHang {
    private ArrayList<KhachHang> danhSach;

    public DsKhachHang() {
        danhSach = new ArrayList<>();
    }

    public void hienThiKhachHang() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach khach hang rong!");
            return;
        }

        for (KhachHang kh : danhSach) {
            kh.hienThiThongTin();
            System.out.println("------------------------------------");
        }
    }

    public KhachHang timKhachHang(String ma) {
        for (KhachHang kh : danhSach) {
            if (kh.getMa().equals(ma)) {
                return kh;
            }
        }
        return null;
    }

    public boolean themKhachHang(KhachHang kh) {
        if (kh == null) {
            return false;
        }

        if (timKhachHang(kh.getMa()) != null) {
            return false;
        }

        danhSach.add(kh);
        return true;
    }

    public boolean xoaKhachHang(String ma) {
        KhachHang kh = timKhachHang(ma);

        if (kh != null) {
            danhSach.remove(kh);
            return true;
        }

        return false;
    }

    public boolean suaKhachHang(String ma, int luaChon, String giaTriMoi) {
        KhachHang kh = timKhachHang(ma);

        if (kh == null) {
            return false;
        }

        try {
            switch (luaChon) {
                case 1:
                    kh.setSdt(giaTriMoi);
                    break;

                case 2:
                    kh.setHoTen(giaTriMoi);
                    break;

                case 3:
                    kh.setEmail(giaTriMoi);
                    break;

                case 4:
                    int diemMoi = Integer.parseInt(giaTriMoi);
                    kh.setDiemTichLuy(diemMoi);
                    break;

                default:
                    return false;
            }
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }
}
