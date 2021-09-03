package inheritanceandpolymorphism;

import java.util.Scanner;
import abstractclasses.AbstractGeometricObject;
import abstractclasses.Circle;
import abstractclasses.NewTriangleClass;

public class TestNewTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three sides, a color, true or false for if the triangle is filled in or not: ");

		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		String color = input.next();
		boolean filled = input.nextBoolean();

		System.out.println("Enter a radius, color, and true or false for if the circle is filled or not");

		double radius = input.nextDouble();
		String color1 = input.next();
		boolean filled1 = input.nextBoolean();

		AbstractGeometricObject obj1 = new NewTriangleClass(side1, side2, side3, color, filled);
		AbstractGeometricObject obj2 = new Circle(radius, color1, filled1);

		System.out.println(obj1.toString());
		System.out.println("The area of the triangle is: " + obj1.getArea());
		System.out.println("The area of the circle is: " + obj2.getArea());
		System.out.println("The perimeter of the circle is: " + obj2.getPerimeter());

		System.out.println("Do the two objects have the same area?: " + equalArea(obj1, obj2));

		if (equalArea(obj1, obj2) == false) {
			System.out.println("The difference between the two areas are: " + difArea(obj1, obj2));
		}
	}

	public static boolean equalArea(AbstractGeometricObject obj1, AbstractGeometricObject obj2) {
		return obj1.getArea() == obj2.getArea();
	}

	public static double difArea(AbstractGeometricObject obj1, AbstractGeometricObject obj2) {
		return (double) (Math.abs((obj1.getArea()) - (obj2.getArea())));
	}

}
