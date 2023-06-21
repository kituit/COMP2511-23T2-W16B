package staticTesting.example2;

public class B {
    private int x;
    private static int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incX() {
        x++; // Increments this B's X
    }

    public void incY() {
        y++; // Increments all B's y
    }
}
