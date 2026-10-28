package people;

public abstract class Nguoi {
    protected String ma;
    protected  String hoTen;
    protected  String sdt;
    protected String email;

    public Nguoi(String ma, String hoTen, String sdt, String email){
        setMa(ma);
        setHoTen(hoTen);
        setSdt(sdt);
        setEmail(email);
    }

    public String getMa(){
        return ma;
    }

    public String getHoTen(){
        return hoTen;
    }
    public String getSdt(){
        return sdt;
    }

    public String getEmail(){
        return email;
    }


    private void setMa(String ma){
        if(ma == null || ma.trim().isEmpty()){
            throw new IllegalArgumentException("Ma khong duoc de trong!");
        }
        this.ma = ma.trim();
    }

    public void setHoTen(String hoTen){
        if(hoTen == null || hoTen.trim().isEmpty()){
            throw new IllegalArgumentException("Ho ten khong duoc de trong!");
        }
        this.hoTen = hoTen;
    }

    public void setSdt(String sdt){
        if(sdt == null || !sdt.matches("0\\d{9}")){
            throw new IllegalArgumentException("So dien thoai phai gom 10 chu so va bat dau bang 0!");
        }
        this.sdt = sdt;
    }

    public void setEmail(String email){
        if(email == null || !email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")){
            throw new IllegalArgumentException("Email khong hop le!");
        }
        this.email = email;
    }

    public void hienThiThongTin(){
        System.out.println("Ma: " + ma);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("So dien thoai: " + sdt);
        System.out.println("Email: " + email);
    }
}
