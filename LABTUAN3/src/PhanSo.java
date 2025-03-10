public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        if (mau == 0) {
            throw new IllegalArgumentException("Mau so khong the bang 0");
        }
        this.tu = tu;
        this.mau = mau;
        this.rutGon();
    }

    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPhanSo() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.tu = sc.nextInt();
        do {
            System.out.print("Nhap mau so (khac 0): ");
            this.mau = sc.nextInt();
            if (this.mau == 0) {
                System.out.println("Mau so khong the bang 0, vui long nhap lai!");
            }
        } while (this.mau == 0);
        this.rutGon();
    }

    public void xuatPhanSo() {
        System.out.println(this.tu + "/" + this.mau);
    }

    private int USCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void rutGon() {
        int ucln = USCLN(this.tu, this.mau);
        this.tu /= ucln;
        this.mau /= ucln;
        if (this.mau < 0) {
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
    }

    public PhanSo cong(PhanSo p) {
        int tuMoi = this.tu * p.mau + p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo tru(PhanSo p) {
        int tuMoi = this.tu * p.mau - p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo nhan(PhanSo p) {
        int tuMoi = this.tu * p.tu;
        int mauMoi = this.mau * p.mau;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo chia(PhanSo p) {
        if (p.tu == 0) {
            throw new ArithmeticException("Khong the chia cho phan so bang 0");
        }
        int tuMoi = this.tu * p.mau;
        int mauMoi = this.mau * p.tu;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        System.out.println("Nhap phan so 1:");
        ps1.nhapPhanSo();

        PhanSo ps2 = new PhanSo();
        System.out.println("Nhap phan so 2:");
        ps2.nhapPhanSo();

        System.out.print("Phan so 1: ");
        ps1.xuatPhanSo();
        System.out.print("Phan so 2: ");
        ps2.xuatPhanSo();

        System.out.print("Tong: ");
        ps1.cong(ps2).xuatPhanSo();
        System.out.print("Hieu: ");
        ps1.tru(ps2).xuatPhanSo();
        System.out.print("Tich: ");
        ps1.nhan(ps2).xuatPhanSo();
        System.out.print("Thuong: ");
        ps1.chia(ps2).xuatPhanSo();
    }
}