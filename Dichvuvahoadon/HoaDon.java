package Dichvuvahoadon;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import people.*;

public class HoaDon {
    private String maHoaDon;
    private Date ngayLap;
    private KhachHang khachHang;   // Khách hàng thanh toán (Lớp KhachHang từ nhóm Con Người)
    private NhanVien nhanVienLap;  // Nhân viên lập hóa đơn (Lớp NhanVien từ nhóm Con Người)
    private List<chiTiethoaDon> chiTietHoaDonList; // Danh sách chi tiết hóa đơn (Lớp chiTiethoaDon)
    private double tongTien; // Tổng tiền của hóa đơn

public HoaDon(String maHoaDon, Date ngayLap, KhachHang khachHang, NhanVien nhanVienLap) {
    this.maHoaDon = maHoaDon;
    this.ngayLap = ngayLap;
    this.khachHang = khachHang;
    this.nhanVienLap = nhanVienLap;
    this.chiTietHoaDonList = new ArrayList<>(); // Khởi tạo danh sách chi tiết trống
    this.tongTien = 0.0;}
/**
     * Thêm một dòng chi tiết dịch vụ vào hóa đơn và cập nhật lại tổng tiền.
     */
    public void themChiTiet(chiTiethoaDon chiTiet) {
        chiTietHoaDonList.add(chiTiet);
        tinhTongTien(); // Tự động cập nhật tổng tiền khi thêm mới
    }
    public void tinhTongTien() {
        tongTien = 0.0;
        for (chiTiethoaDon ct : chiTietHoaDonList) {
            tongTien += ct.tinhThanhTien(); // file chi tiet hoa don
        }
    }
    public void xuatHoaDon() {
        System.out.println("\n================ HÓA ĐƠN THANH TOÁN ================");
        System.out.println("Mã HĐ: " + maHoaDon + " | Ngày lập: " + ngayLap);
        System.out.println("Khách hàng: " + khachHang.getHoTen() + " | SĐT: " + khachHang.getSdt());
        System.out.println("Nhân viên lập: " + nhanVienLap.getHoTen());
        System.out.println("--- Chi tiết dịch vụ sử dụng ---");
        
        // Duyệt qua danh sách chi tiết để in từng dịch vụ
        for (chiTiethoaDon ct : chiTietHoaDonList) {
            ct.xuatChiTiet();
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("TỔNG TIỀN THANH TOÁN: " + tongTien + " VNĐ");
        System.out.println("=====================================================\n");
    }
    // ==========================================
    // CÁC PHƯƠNG THỨC GETTER VÀ SETTER
    // ==========================================

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(NhanVien nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    public List<chiTiethoaDon> getDanhSachChiTiet() {
        return chiTietHoaDonList;
    }

    public double getTongTien() {
        return tongTien;
    }
}