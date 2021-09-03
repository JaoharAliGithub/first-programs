package inheritanceandpolymorphism;

public class PolymorphismDemo {
	public static void main(String[] args) {

		displayObject(new TriangleFromGeometricObject(2, 2, 2, "red", true));

	}

	public static void displayObject(GeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
	}
}
