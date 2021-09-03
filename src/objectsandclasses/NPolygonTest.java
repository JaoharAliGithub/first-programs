package objectsandclasses;

public class NPolygonTest {

	public static void main(String[] args) {
		NPolygon poly1 = new NPolygon();
		System.out.println("The perimeter of this polygon is: " + poly1.getPerimeter());
		System.out.println("The area of this polygon is: " + poly1.getArea());
		System.out.println();

		NPolygon poly2 = new NPolygon(6, 4);
		System.out.println("The perimeter of this polygon is: " + poly2.getPerimeter());
		System.out.println("The area of this polygon is: " + poly2.getArea());
		System.out.println();

		NPolygon poly3 = new NPolygon(10, 4, 5.6, 7.8);
		System.out.println("The perimeter of this polygon is: " + poly3.getPerimeter());
		System.out.println("The area of this polygon is: " + poly3.getArea());
		System.out.println();

	}

}
