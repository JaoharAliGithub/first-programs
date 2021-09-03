package objectorientedthinking;

public class Triangle2D {

	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		x1 = 0;
		y1 = 0;
		x2 = 1;
		y2 = 1;
		x3 = 2;
		y3 = 5;
	}

	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	MyPoint getP1() {
		return p1;
	}

	MyPoint getP2() {
		return p2;
	}

	MyPoint getP3() {
		return p3;
	}

	double getArea() {
		double s = ((p1.distance(p2)) + (p2.distance(p3)) + (p3.distance(p1)));
		return Math.sqrt(s * ((s - p1.distance(p2)) * (s - p2.distance(p3)) * (s - p3.distance(p1))));
	}

	double getPerimeter() {
		return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
	}

	boolean contains(MyPoint p) {

		double a = p1.getY() - p2.getY();
		double b = p1.getX() - p2.getX();
		double c = p3.getY() - p3

		if (intersecting1 == intersecting2) {
			return true;
		} else {
			return false;
		}

	}

}
