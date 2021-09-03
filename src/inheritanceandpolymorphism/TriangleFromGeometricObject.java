package inheritanceandpolymorphism;

public class TriangleFromGeometricObject extends GeometricObject {

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	public TriangleFromGeometricObject() {

	}

	public TriangleFromGeometricObject(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public TriangleFromGeometricObject(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}

	double getSide1() {
		this.side1 = side1;
		return side1;
	}

	double getSide2() {
		this.side2 = side2;
		return side2;
	}

	double getSide3() {
		this.side3 = side3;
		return side3;
	}

	double getArea() {
		double s = (side1 + side2 + side3);
		return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
	}

	double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return ("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
	}
}
