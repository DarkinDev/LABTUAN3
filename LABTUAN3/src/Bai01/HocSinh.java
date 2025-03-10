package Bai01;
class HocSinh {
    private String maSo;
    private String hoTen;
    private double diemTB;

    public HocSinh() {
        this.maSo = "";
        this.hoTen = "";
        this.diemTB = 0.0;
    }

    public HocSinh(String maSo) {
        this.maSo = maSo;
        this.hoTen = "";
        this.diemTB = 0.0;
    }

    public HocSinh(String maSo, String hoTen, double diemTB) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getMaSo() {
        return this.maSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public double getDiemTB() {
        return this.diemTB;
    }

    public void nhapHocSinh() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maSo = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        this.diemTB = sc.nextDouble();
    }

    public void xuatHocSinh() {
        System.out.println("Ma so: " + this.maSo + ", Ho ten: " + this.hoTen + ", Diem trung binh: " + this.diemTB);
    }
}
