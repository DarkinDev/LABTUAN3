public class Demo2 {
    public static void main(String[] args) {
        DanhSachHocSinh ds = new DanhSachHocSinh(10);

        System.out.println("== Nhap danh sach hoc sinh ==");
        ds.nhapDanhSach();

        ds.sapXep();

        System.out.println("== Danh sach hoc sinh sau khi sap xep ==");
        ds.inDanhSach();
    }
}
