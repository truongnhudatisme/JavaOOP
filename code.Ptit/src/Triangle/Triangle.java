package Triangle;

public class Triangle {
    private Point p1,p2,p3;
    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean valid() {
		double a = p1.getX()*(p2.getY()-p3.getY()) + p2.getX()*(p3.getY()-p1.getY()) + p3.getX()*(p1.getY()-p2.getY());
		if((int) a ==0) 
			return false;
		return true;
	}
    public String getPerimeter(){
        if(valid()) {
			double cv  = Point.distance(p1, p2) + Point.distance(p2, p3) + Point.distance(p3, p1);
			return String.format("%.3f",cv);
		}
        else
            return "INVALID";
    }
}
