package Lesson_01.Ex002;

public class Program {
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0,2);
//        a.x = 0;
//        a.y = 2;
        System.out.println(a.getInfo());

//        Point2D b = new Point2D(0, 10);
        Point2D b = new Point2D(10);
//        b.x = 10;
//        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b));
    }
}
