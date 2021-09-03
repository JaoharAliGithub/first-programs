package abstractclasses;

public class Square extends AbstractGeometricObject
		implements Comparable<AbstractGeometricObject>, Colorable<AbstractGeometricObject> {
	double side;

	public Square(double side) {

	}

	@Override
	public void howToColor() {
		System.out.println("Color All Four Sides");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
