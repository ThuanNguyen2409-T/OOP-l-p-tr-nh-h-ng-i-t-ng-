package product;

public abstract class SanPham{
    protected String ma;
    protected String tenSanPham;
    protected double donGia;
    protected int soLuongTon;

    public SanPham(String ma, String tenSanPham, double donGia, int soLuongTon){
        setMaSanPham(ma);
        setTenSanPham(tenSanPham);
        setDonGia(donGia);
        setSoLuongTon(soLuongTon);
    }

    public String getMaSanPham(){
        return ma;
    }

    private void setMaSanPham(String ma){
        if(ma == null || ma.trim().isEmpty()){
            throw new IllegalArgumentException("Ma san pham khong duoc de trong!");
        }
        this.ma = ma.trim();
    }


    public String getTenSanPham(){
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham){
        if(tenSanPham == null || tenSanPham.trim().isEmpty()){
            throw new IllegalArgumentException("Ten san pham khong duoc de trong!");
        }
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia(){
        return donGia;
    }

    public void setDonGia(double donGia){
        if(donGia <= 0 || !Double.isFinite(donGia)){
            throw new IllegalArgumentException("Don gia phai lon hon 0!");
        }
        this.donGia = donGia;
    }

    public int getSoLuongTon(){
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon){
        if(soLuongTon < 0){
            throw new IllegalArgumentException("So luong ton phai lon hon hoac bang 0");
        }
        this.soLuongTon = soLuongTon;
    }

    public void hienThiThongTin(){
        System.out.println("Ma: " + getMaSanPham());
        System.out.println("Ten san pham: " + getTenSanPham());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("So luong ton: " + getSoLuongTon());
    }
}
