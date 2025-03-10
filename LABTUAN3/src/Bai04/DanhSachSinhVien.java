package Bai04;
class DanhSachNhanVien {
    private NhanVien[] ds;
    private int n;

    public DanhSachNhanVien(int size) {
        ds = new NhanVien[size];
        n = 0;
    }

    public void nhapDanhSach() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        n = sc.nextInt();
        sc.nextLine();
        if (n > ds.length) {
            n = ds.length;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            ds[i] = new NhanVien();
            ds[i].nhapNhanVien();
        }
    }

    public void xuatDanhSach() {
        for (int i = 0; i < n; i++) {
            ds[i].xuatNhanVien();
        }
    }
}