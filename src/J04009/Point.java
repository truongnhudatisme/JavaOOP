package J04009;

public class Point {
    private double x, y;
    // private Point p;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // public Point(Point p) {
    //     this.p = p;
    // }
    public Point() {
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    public static boolean isTriangle(Point p1, Point p2, Point p3){
        double a = Point.distance(p1, p2);
        double b = Point.distance(p1, p3);
        double c = Point.distance(p2, p3);
        if((a + b) > c || (a + c) > b || (b + c) > a)
            return true;
        else
            return false; 
    }
    @Override
    public String toString() {
        return super.toString();
    }
    
}
