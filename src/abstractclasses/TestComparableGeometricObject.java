package abstractclasses;

public class TestComparableGeometricObject {

	public static void main(String[] args) {
		AbstractGeometricObject obj1 = new Circle(2);
		AbstractGeometricObject obj2 = new Circle(3);

		Circle largerCircle = (Circle) AbstractGeometricObject.max(obj1, obj2);

		System.out.printf("the larger circle is: " + largerCircle.getArea());
	}

}
