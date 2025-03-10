public class Demo5 {
    public static void main(String[] args) {
        try {
            TamGiac tg1 = new TamGiac(3, 3, 3);
            System.out.println("Tam giac 1:");
            System.out.println("Chu vi: " + tg1.tinhChuVi());
            System.out.println("Dien tich: " + String.format("%.2f", tg1.tinhDienTich()));
            System.out.println("Loai tam giac: " + tg1.loaiTamGiac());

            TamGiac tg2 = new TamGiac(3, 4, 5);
            System.out.println("\nTam giac 2:");
            System.out.println("Chu vi: " + tg2.tinhChuVi());
            System.out.println("Dien tich: " + String.format("%.2f", tg2.tinhDienTich()));
            System.out.println("Loai tam giac: " + tg2.loaiTamGiac());

            TamGiac tg3 = new TamGiac(3, 4, 6);
            System.out.println("\nTam giac 3:");
            System.out.println("Chu vi: " + tg3.tinhChuVi());
            System.out.println("Dien tich: " + String.format("%.2f", tg3.tinhDienTich()));
            System.out.println("Loai tam giac: " + tg3.loaiTamGiac());
        } catch (IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}