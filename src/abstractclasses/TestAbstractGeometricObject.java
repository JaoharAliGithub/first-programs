package abstractclasses;

public class TestAbstractGeometricObject {

	public static void main(String[] args) {
		AbstractGeometricObject geoObject1 = new Circle(5);
		AbstractGeometricObject geoObject2 = new Rectangle(5, 3);

		System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

		displayGeometricObject(geoObject1);
		displayGeometricObject(geoObject2);
	}

	public static boolean equalArea(AbstractGeometricObject object1, AbstractGeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

	public static void displayGeometricObject(AbstractGeometricObject object) {
		System.out.println();
		System.out.println("The area of the object is: " + object.getArea());
		System.out.println("The perimeter of the object is: " + object.getPerimeter());
	}

}
