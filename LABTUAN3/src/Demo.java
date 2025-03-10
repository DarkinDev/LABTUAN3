public class Demo {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        System.out.print("Phan so p1 (mac dinh): ");
        p1.xuatPhanSo();

        System.out.println("Nhap thong tin cho p1:");
        p1.nhapPhanSo();
        System.out.print("Phan so p1 sau khi nhap: ");
        p1.xuatPhanSo();

        PhanSo p2 = new PhanSo(4, 16);
        System.out.print("Phan so p2 (4/16): ");
        p2.xuatPhanSo();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Nhap thong tin cho p3:");
        System.out.print("Nhap tu so: ");
        int tuP3 = sc.nextInt();
        int mauP3;
        do {
            System.out.print("Nhap mau so (khac 0): ");
            mauP3 = sc.nextInt();
            if (mauP3 == 0) {
                System.out.println("Mau so khong the bang 0, vui long nhap lai!");
            }
        } while (mauP3 == 0);
        PhanSo p3 = new PhanSo(tuP3, mauP3);
        System.out.print("Phan so p3: ");
        p3.xuatPhanSo();

        PhanSo tong = p1.cong(p3);
        System.out.print("Tong p1 + p3: ");
        tong.xuatPhanSo();

        PhanSo p4 = new PhanSo(tong);
        System.out.print("Phan so p4 (sao chep tu tong): ");
        p4.xuatPhanSo();

        PhanSo tich = p4.nhan(p2);
        System.out.print("Tich p4 * p2: ");
        tich.xuatPhanSo();
    }
}