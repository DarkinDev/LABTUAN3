package Bai01;
public class Demo1 {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("HS001", "Nguyen Van A", 8.5);
        HocSinh hs2 = new HocSinh("HS002", "Nguyen Van B", 9.5);
        HocSinh hs3 = new HocSinh("HS003", "Nguyen Van C", 7.5);

        System.out.println("== Nhap thong tin hoc sinh 1 ==");
        hs1.nhapHocSinh();

        System.out.println("== Thong tin cac hoc sinh ==");
        hs1.xuatHocSinh();
        hs2.xuatHocSinh();
        hs3.xuatHocSinh();
        
        hs1.setHoTen("Tran Ngoc Thuyet Minh");
        System.out.println("\n== Sau khi doi ten hs1 ==");
        hs1.xuatHocSinh();

        HocSinh[] arr = {hs1, hs2, hs3};
        HocSinh maxDTB = hs1;
        for (HocSinh hs : arr) {
            if (hs.getDiemTB() > maxDTB.getDiemTB()) {
                maxDTB = hs;
            }
        }
        System.out.println("\n== Hoc sinh co diem trung binh cao nhat ==");
        maxDTB.xuatHocSinh();
    }
}
