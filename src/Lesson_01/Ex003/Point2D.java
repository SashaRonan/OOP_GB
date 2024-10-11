package Lesson_01.Ex003;

/**
 * "Это точка 2D
 */

public class Point2D {
    private int x, y;

    /**
     * Это контруктор
     * @param valueX координата x
     * @param valueY координата y
     */

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
//        this.x = value;
//        this.y = value;
        this(value, value);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public String getInfo() {
        return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
