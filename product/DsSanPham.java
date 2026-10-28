package product;

import java.util.ArrayList;

public class DsSanPham {
    private ArrayList<SanPham> danhSach;

    public DsSanPham() {
        danhSach = new ArrayList<>();
    }

    public boolean themSanPham(SanPham sp) {
        if (sp == null) {
            return false;
        }

        if (timSanPham(sp.getMaSanPham()) != null) {
            return false;
        }

        danhSach.add(sp);
        return true;
    }

    public SanPham timSanPham(String ma) {
        for (SanPham sp : danhSach) {
            if (sp.getMaSanPham().equals(ma)) {
                return sp;
            }
        }
        return null;
    }

    public void hienThiSanPham() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (SanPham sp : danhSach) {
            System.out.println("-------------------------");
            sp.hienThiThongTin();
        }
    }

    public boolean xoaSanPham(String ma) {
        SanPham sp = timSanPham(ma);

        if (sp != null) {
            danhSach.remove(sp);
            return true;
        }

        return false;
    }

    public boolean suaSanPham(String ma, int luaChon, String giaTriMoi) {
        SanPham sp = timSanPham(ma);

        if (sp == null) {
            return false;
        }

        try {
            switch (luaChon) {
                case 1:
                    sp.setTenSanPham(giaTriMoi);
                    break;

                case 2:
                    double donGia = Double.parseDouble(giaTriMoi);
                    sp.setDonGia(donGia);
                    break;

                case 3:
                    int soLuongTon = Integer.parseInt(giaTriMoi);
                    sp.setSoLuongTon(soLuongTon);
                    break;

                case 4:
                    if (sp instanceof PhuKien) {
                        PhuKien pk = (PhuKien) sp;
                        pk.setLoaiPhuKien(giaTriMoi);
                    } else {
                        return false;
                    }
                    break;

                case 5:
                    if (sp instanceof PhuKien) {
                        PhuKien pk = (PhuKien) sp;
                        pk.setKichThuoc(giaTriMoi);
                    } else {
                        return false;
                    }
                    break;

                case 6:
                    if (sp instanceof ThucAn) {
                        ThucAn ta = (ThucAn) sp;
                        ta.setHanSuDung(giaTriMoi);
                    } else {
                        return false;
                    }
                    break;

                case 7:
                    if (sp instanceof ThucAn) {
                        ThucAn ta = (ThucAn) sp;
                        double khoiLuong = Double.parseDouble(giaTriMoi);
                        ta.setKhoiLuong(khoiLuong);
                    } else {
                        return false;
                    }
                    break;

                case 8:
                    if (sp instanceof ThucAn) {
                        ThucAn ta = (ThucAn) sp;
                        ta.setLoaiThuCung(giaTriMoi);
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
