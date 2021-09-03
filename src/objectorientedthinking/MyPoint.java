package objectorientedthinking;

public class MyPoint {
	private double x = 0;
	private double y = 0;

	MyPoint() {
		this(0, 0);
	}

	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double getX() {
		return x;

	}

	double getY() {
		return y;
	}

	double distance(MyPoint mypoint) {
		return Math.sqrt((mypoint.getY() - y) * (mypoint.getY() - y) + (mypoint.getX() - x) * (mypoint.getX() - x));
	}

	double distance(double x, double y) {
		return distance(new MyPoint(x, y));
	}
}
