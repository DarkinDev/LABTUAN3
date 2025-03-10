package Bai05;
class TamGiac {
    private int a; 
    private int b; 
    private int c; 

    public TamGiac(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (b + c <= a) || (a + c <= b)) {
            throw new IllegalArgumentException("Ba canh khong tao thanh tam giac hop le");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int tinhChuVi() {
        return a + b + c;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2.0; 
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String loaiTamGiac() {
        if (a == b && b == c) {
            return "Tam giac deu";
        } else if (a == b || b == c || a == c) {
            return "Tam giac can";
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
            return "Tam giac vuong";
        } else {
            return "Tam giac thuong";
        }
    }
}