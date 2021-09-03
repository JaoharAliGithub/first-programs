package abstractclasses;

public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		AbstractGeometricObject obj1 = new Octagon(5);
		AbstractGeometricObject obj2 = obj1.clone(obj1);
		System.out.println(obj1.compareTo(obj2));
	}
}
