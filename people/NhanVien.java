package people;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public abstract class NhanVien extends Nguoi {
    protected double heSoLuong;
    protected String ngayVaoLam;

    public NhanVien(String ma, String hoTen, String sdt, String email, double heSoLuong, String ngayVaoLam) {
        super(ma, hoTen, sdt, email);
        setHeSoLuong(heSoLuong);
        setNgayVaoLam(ngayVaoLam);
    }

    // Getter
    public double getHeSoLuong() {
        return heSoLuong;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    // Setter
    public void setHeSoLuong(double heSoLuong) {
        if (heSoLuong <= 0 || !Double.isFinite(heSoLuong)) {
            throw new IllegalArgumentException("He so luong phai lon hon 0!");
        }
        this.heSoLuong = heSoLuong;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        if (ngayVaoLam == null || ngayVaoLam.trim().isEmpty()) {
            throw new IllegalArgumentException("Ngay vao lam khong duoc de trong!");
        }
        DateTimeFormatter dinhDang = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate ngay = LocalDate.parse(ngayVaoLam, dinhDang);

            if (ngay.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException(
                    "Ngay vao lam khong duoc lon hon ngay hien tai!"
                );
            }

            this.ngayVaoLam = ngayVaoLam;

        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(
                "Ngay vao lam khong hop le! Dinh dang dd/MM/yyyy"
            );
        }
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Ngay vao lam: " + ngayVaoLam);
    }
}
