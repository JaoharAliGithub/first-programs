package abstractclasses;

public class TestComparableCircle {

	public static void main(String[] args) {
		AbstractGeometricObject obj1 = new Circle(2);
		AbstractGeometricObject obj2 = new Circle(3);
		
		System.out.println("The bigger object is: " + obj1.compareTo(obj2));
	}

}
