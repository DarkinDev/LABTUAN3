package Bai01;
class DanhSachHocSinh {
    private HocSinh[] ds;
    private int n;

    public DanhSachHocSinh(int size) {
        ds = new HocSinh[size];
        n = 0;
    }

    public void nhapDanhSach() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        n = sc.nextInt();
        sc.nextLine();

        if (n > ds.length) {
            System.out.println("So luong vuot qua kich thuoc mang!");
            n = ds.length;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap hoc sinh thu " + (i + 1) + ":");
            ds[i] = new HocSinh();
            ds[i].nhapHocSinh(); 
        }
    }

    public void inDanhSach() {
        for (int i = 0; i < n; i++) {
            ds[i].xuatHocSinh();
        }
    }

    public void sapXep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].getDiemTB() < ds[j].getDiemTB()) {
                    HocSinh temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}