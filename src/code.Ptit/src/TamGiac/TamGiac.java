package TamGiac;

public class TamGiac {
	public static String dienTich(Point p1, Point p2, Point p3) {
		if(Point.isTriangle(p1, p2, p3)) {
			double a = Point.distance(p1, p2);
			double b = Point.distance(p1, p3);
			double c = Point.distance(p2, p3);
			double s = Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4;
			s = Math.round(s*1000)/1000.0;
			return String.format("%.2f",s);
		}
		else
			return "INVALID";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
