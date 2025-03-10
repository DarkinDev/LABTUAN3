class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    private static int soLuongNhanVien = 0;

    public NhanVien() {
        this.maSo = "";
        this.hoTen = "";
        this.luongCoBan = 0.0;
        this.heSoLuong = 0.0;
        soLuongNhanVien++;
    }

    public NhanVien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNhanVien++;
    }

    public NhanVien(NhanVien nv) {
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCoBan = nv.luongCoBan;
        this.heSoLuong = nv.heSoLuong;
        soLuongNhanVien++;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void nhapNhanVien() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maSo = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        this.luongCoBan = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        this.heSoLuong = sc.nextDouble();
    }

    public void xuatNhanVien() {
        System.out.println("Ma so: " + maSo + ", Ho ten: " + hoTen + 
                          ", Luong co ban: " + luongCoBan + 
                          ", He so luong: " + heSoLuong + 
                          ", Luong: " + tinhLuong());
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public static void inSoLuongNhanVien() {
        System.out.println("Tong so luong nhan vien: " + soLuongNhanVien);
    }
}