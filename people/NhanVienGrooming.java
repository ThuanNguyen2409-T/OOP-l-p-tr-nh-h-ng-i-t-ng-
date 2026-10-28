package people;

public class NhanVienGrooming extends NhanVien {
    private int soCaTamCatTia;

    public NhanVienGrooming(String ma, String hoTen, String sdt, String email, double heSoLuong, String ngayVaoLam, int soCaTamCatTia){
        super(ma, hoTen, sdt, email, heSoLuong, ngayVaoLam);
        setSoCaTamCatTia(soCaTamCatTia);
    }

    //getter
    public int getSoCaTamCatTia(){
        return soCaTamCatTia;
    }

    //setter
    public void setSoCaTamCatTia(int soCaTamCatTia){
        if(soCaTamCatTia < 0){
            throw new IllegalArgumentException("So ca tam/cat tia khong duoc am!");
        }
        this.soCaTamCatTia = soCaTamCatTia;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("So ca tam/cat tia: " + soCaTamCatTia);
    }
}
