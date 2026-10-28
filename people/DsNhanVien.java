package people;

import java.util.ArrayList;

public class DsNhanVien {
    private ArrayList<NhanVien> danhSach;

    public DsNhanVien() {
        danhSach = new ArrayList<>();
    }

    public boolean themNhanVien(NhanVien nv) {
        if (nv == null) {
            return false;
        }

        if (timNhanVien(nv.getMa()) != null) {
            return false;
        }

        danhSach.add(nv);
        return true;
    }

    public NhanVien timNhanVien(String ma) {
        for (NhanVien nv : danhSach) {
            if (nv.getMa().equals(ma)) {
                return nv;
            }
        }
        return null;
    }

    public void hienThiNhanVien() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach nhan vien trong!");
            return;
        }

        for (NhanVien nv : danhSach) {
            nv.hienThiThongTin();
            System.out.println("-------------------------");
        }
    }

    public boolean xoaNhanVien(String ma) {
        NhanVien nv = timNhanVien(ma);

        if (nv != null) {
            danhSach.remove(nv);
            return true;
        }

        return false;
    }

    public boolean suaNhanVien(String ma, int luaChon, String giaTriMoi) {
        NhanVien nv = timNhanVien(ma);

        if (nv == null) {
            return false;
        }

        try {
            switch (luaChon) {
                case 1:
                    nv.setHoTen(giaTriMoi);
                    break;

                case 2:
                    nv.setSdt(giaTriMoi);
                    break;

                case 3:
                    nv.setEmail(giaTriMoi);
                    break;

                case 4:
                    double heSoLuong = Double.parseDouble(giaTriMoi);
                    nv.setHeSoLuong(heSoLuong);
                    break;

                case 5:
                    nv.setNgayVaoLam(giaTriMoi);
                    break;

                case 6:
                    if (nv instanceof NhanVienBacSi) {
                        NhanVienBacSi bs = (NhanVienBacSi) nv;
                        bs.setChuyenMon(giaTriMoi);
                    } else {
                        return false;
                    }
                    break;

                case 7:
                    if (nv instanceof NhanVienBacSi) {
                        NhanVienBacSi bs = (NhanVienBacSi) nv;
                        double phuCapKham = Double.parseDouble(giaTriMoi);
                        bs.setPhuCapKham(phuCapKham);
                    } else {
                        return false;
                    }
                    break;

                case 8:
                    if (nv instanceof NhanVienGrooming) {
                        NhanVienGrooming gr = (NhanVienGrooming) nv;
                        int soCaTamCatTia = Integer.parseInt(giaTriMoi);
                        gr.setSoCaTamCatTia(soCaTamCatTia);
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
}
