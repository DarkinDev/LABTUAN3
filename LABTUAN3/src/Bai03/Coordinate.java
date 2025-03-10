package Bai03;
public class Coordinate {
    private float x;
    private float y;

    public Coordinate() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Coordinate(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Coordinate add(Coordinate other) {
        float newX = this.x + other.x;
        float newY = this.y + other.y;
        return new Coordinate(newX, newY);
    }

    public Coordinate symmetricOverXAxis() {
        return new Coordinate(this.x, -this.y);
    }

    public void printCoordinate() {
        System.out.println("Toa do: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Coordinate A = new Coordinate();
        System.out.print("Diem A ");
        A.printCoordinate();

        Coordinate B = new Coordinate(3.0f, 4.0f);
        System.out.print("Diem B ");
        B.printCoordinate();

        Coordinate sum = A.add(B);
        System.out.print("Tong A + B ");
        sum.printCoordinate();

        Coordinate symB = B.symmetricOverXAxis();
        System.out.print("Doi xung B qua truc hoanh ");
        symB.printCoordinate();
    }
}