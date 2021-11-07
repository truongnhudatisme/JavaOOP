package Triangle;

import java.util.Scanner;

public class Point {
	private double x,y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(),sc.nextDouble());
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public static double distance(Point p1, Point p2) {
		return(double) Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
}
