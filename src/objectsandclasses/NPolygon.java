package objectsandclasses;

public class NPolygon {

	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;

	NPolygon() {

	}

	NPolygon(int new_n, double new_side) {
		n = new_n;
		side = new_side;

	}

	NPolygon(int new_n, double new_side, double new_x, double new_y) {
		n = new_n;
		side = new_side;
		x = new_x;
		y = new_y;
	}

	int get_n() {
		return n;
	}

	double get_side() {
		return side;
	}

	double get_x() {
		return x;
	}

	double get_y() {
		return y;
	}

	double getPerimeter() {
		double perimeter = n * side;
		return perimeter;
	}

	double getArea() {
		double Area = (n * (side * side)) / (4 * (Math.tan(Math.PI / n)));
		return Area;
	}
}
