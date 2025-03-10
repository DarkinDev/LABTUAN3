public class Demo4 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien(); 
        NhanVien nv2 = new NhanVien("NV002", "Tran Van B", 5000000, 2.5); 
        NhanVien nv3 = new NhanVien(nv2); 

        System.out.println("Nhap thong tin nhan vien 1:");
        nv1.nhapNhanVien();
        System.out.println("\nThong tin nhan vien 1:");
        nv1.xuatNhanVien();

        System.out.println("\nThong tin nhan vien 2:");
        nv2.xuatNhanVien();

        System.out.println("\nNhap thong tin nhan vien 3:");
        nv3.nhapNhanVien();
        System.out.println("\nThong tin nhan vien 3:");
        nv3.xuatNhanVien();

        nv1.setHoTen("Nguyen Thi Moi");
        System.out.println("\nThong tin nhan vien 1 sau khi doi ten:");
        nv1.xuatNhanVien();

        NhanVien maxHeSo = nv1;
        if (nv2.getHeSoLuong() > maxHeSo.getHeSoLuong()) maxHeSo = nv2;
        if (nv3.getHeSoLuong() > maxHeSo.getHeSoLuong()) maxHeSo = nv3;
        System.out.println("\nNhan vien co he so luong cao nhat:");
        maxHeSo.xuatNhanVien();

        System.out.println("\nNhap danh sach nhan vien:");
        DanhSachNhanVien ds = new DanhSachNhanVien(5);
        ds.nhapDanhSach();
        System.out.println("\nDanh sach nhan vien:");
        ds.xuatDanhSach();

        NhanVien.inSoLuongNhanVien();
    }
}