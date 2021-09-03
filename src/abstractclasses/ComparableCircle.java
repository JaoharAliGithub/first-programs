package abstractclasses;
public abstract class ComparableCircle extends Circle implements Comparable<AbstractGeometricObject> {

	public ComparableCircle(double radius) {
		super(radius);
	}

	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
		// TODO Auto-generated constructor stub
	}

	double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI * (radius * radius));
	}

	public double getPerimeter() {
		return (2 * radius) * (Math.PI);
	}

	public int compareTo(AbstractGeometricObject o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

}
