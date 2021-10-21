package TamGiac;

public class Point {
	double x, y;
	Point p;
	public Point() {
		
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point(Point p) {
		this.p = p;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double distance(Point p1) {
		return Math.sqrt(Math.pow(this.x-p1.x, 2) + Math.pow(this.y-p1.y, 2));
	}
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2));
	}
	public static boolean isTriangle(Point p1, Point p2, Point p3) {
		double a = p1.x*(p2.y - p3.y) + p2.x*(p1.x - p3.x) + p3.x*(p1.y - p2.y);
		if(a == 0.0) {
			return false;
		}
		else
			return true;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
}
