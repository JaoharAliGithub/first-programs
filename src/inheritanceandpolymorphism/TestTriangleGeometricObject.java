package inheritanceandpolymorphism;

import java.util.Scanner;

public class TestTriangleGeometricObject {

	public static void main(String[] args) {
		TriangleFromGeometricObject tri2 = new TriangleFromGeometricObject(2, 4, 5);
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Enter three sides of a triangle, a color, and a boolean value to indicate whether the trianlge is filled or not: ");
		double sideone = input.nextDouble();
		double sidetwo = input.nextDouble();
		double sidethree = input.nextDouble();
		String color = input.next();
		boolean filledOrNah = input.nextBoolean();

		TriangleFromGeometricObject tri1 = new TriangleFromGeometricObject(sideone, sidetwo, sidethree, color,
				filledOrNah);
		System.out.println(tri1.toString());

	}

}
