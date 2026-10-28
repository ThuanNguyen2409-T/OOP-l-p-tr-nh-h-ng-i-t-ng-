package data;

import people.*;
import product.*;

public class DuLieuMau {
    public static void taoKhachHang(DsKhachHang ds) {
        ds.themKhachHang(new KhachHang(
            "KH01", "Nguyen Van An",
            "0912345678", "an@gmail.com",
            50
        ));

        ds.themKhachHang(new KhachHang(
            "KH02", "Tran Thi Bich",
            "0987654321", "bich@gmail.com",
            150
        ));

        ds.themKhachHang(new KhachHang(
            "KH03", "Le Minh Khang",
            "0934567890", "khang@gmail.com",
            350
        ));
    }

    public static void taoNhanVien(DsNhanVien ds) {
        ds.themNhanVien(new NhanVienBacSi(
            "NV01", "Pham Quoc Bao",
            "0901111111", "bao@gmail.com",
            3.5, "10/03/2023",
            "Noi khoa", 500000
        ));

        ds.themNhanVien(new NhanVienBacSi(
            "NV02", "Nguyen Thi Lan",
            "0902222222", "lan@gmail.com",
            3.2, "15/06/2024",
            "Ngoai khoa", 400000
        ));

        ds.themNhanVien(new NhanVienBacSi(
            "NV03", "Tran Minh Duc",
            "0903333333", "duc@gmail.com",
            3.0, "20/01/2025",
            "Da lieu", 300000
        ));

        ds.themNhanVien(new NhanVienGrooming(
            "NV04", "Le Hoang Nam",
            "0904444444", "nam@gmail.com",
            2.2, "12/08/2024",
            25
        ));

        ds.themNhanVien(new NhanVienGrooming(
            "NV05", "Vo Ngoc Mai",
            "0905555555", "mai@gmail.com",
            2.4, "05/02/2025",
            30
        ));
    }

    public static void taoSanPham(DsSanPham ds) {

        // Phu kien
        ds.themSanPham(new PhuKien(
            "SP01", "Can cau cho meo",
            45000, 20, "Do choi", "M"
        ));

        ds.themSanPham(new PhuKien(
            "SP02", "Vong co cho cho",
            65000, 15, "Vong co", "L"
        ));

        ds.themSanPham(new PhuKien(
            "SP03", "Bong cao su",
            30000, 30, "Do choi", "S"
        ));

        ds.themSanPham(new PhuKien(
            "SP04", "Day dat thu cung",
            85000, 12, "Day dat", "XL"
        ));

        // Thuc an
        ds.themSanPham(new ThucAn(
            "SP05", "Sup thuong cho meo",
            15000, 50, "31/12/2027",
            0.015, "Meo"
        ));

        ds.themSanPham(new ThucAn(
            "SP06", "Hat cho meo",
            180000, 25, "30/06/2028",
            1.0, "Meo"
        ));

        ds.themSanPham(new ThucAn(
            "SP07", "Hat cho cho",
            220000, 20, "31/12/2028",
            2.0, "Cho"
        ));

        ds.themSanPham(new ThucAn(
            "SP08", "Pate cho meo",
            25000, 40, "31/12/2027",
            0.085, "Meo"
        ));
    }
}
