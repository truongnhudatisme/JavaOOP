package J04009;

public class Tamgiac {
    public static String dienTich(Point p1, Point p2, Point p3) {
		if(Point.isTriangle(p1, p2, p3)) {
			double a = Point.distance(p1, p2);
			double b = Point.distance(p1, p3);
			double c = Point.distance(p2, p3);
			double s = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c))/4;
			s = Math.round(s*100.0)/100.0;
			return String.format("%.02f",s);
		}
		else
			return "INVALID";
	}
}   
