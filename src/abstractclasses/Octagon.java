package abstractclasses;

public class Octagon extends AbstractGeometricObject implements Cloneable, Comparable<AbstractGeometricObject> {
	double side;

	public Octagon() {

	}

	public Octagon(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return ((2 + (4 / (Math.sqrt(2)))) * side * side);
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
}
