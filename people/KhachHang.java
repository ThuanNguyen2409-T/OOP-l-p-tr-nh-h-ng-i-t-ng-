package people;

public class KhachHang extends Nguoi {
    private int diemTichLuy;

    public KhachHang(String ma, String hoTen, String sdt, String email, int diemTichLuy) {
        super(ma, hoTen, sdt, email);
        setDiemTichLuy(diemTichLuy);
    }

    // getter
    public String getLoaiThanhVien() {
        if (diemTichLuy >= 300) {
            return "Kim cuong";
        } else if (diemTichLuy >= 200) {
            return "Bach kim";
        } else if (diemTichLuy >= 100) {
            return "Vang";
        } else {
            return "Bac";
        }
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    // setter
    public void setDiemTichLuy(int diemTichLuy) {
        if (diemTichLuy < 0) {
            throw new IllegalArgumentException(
                "Diem tich luy khong duoc am!"
            );
        }
        this.diemTichLuy = diemTichLuy;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loai thanh vien: " + getLoaiThanhVien());
        System.out.println("Diem tich luy: " + diemTichLuy);
    }
}
