package objectsandclasses;

import abstractclasses.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();
		System.out.println("The width of this rectangle is " + "(" + rectangle1.width + ")");
		System.out.println("The height of this rectangle is " + "(" + rectangle1.height + ")");
		System.out.println("The perimeter of this rectangle is " + "(" + rectangle1.getPerimeter() + ")");
		System.out.println("The area of this rectangle is " + "(" + rectangle1.getArea() + ")");

		System.out.println();
		Rectangle rectangle2 = new Rectangle(4, 40);
		System.out.println("The width of this rectangle is " + "(" + rectangle2.width + ")");
		System.out.println("The height of this rectangle is " + "(" + rectangle2.height + ")");
		System.out.println("The perimeter of this rectangle is " + "(" + rectangle2.getPerimeter() + ")");
		System.out.println("The area of this rectangle is " + "(" + rectangle2.getArea() + ")");

		System.out.println();
		Rectangle rectangle3 = new Rectangle(3.5, 35.9);
		System.out.println("The width of this rectangle is " + "(" + rectangle3.width + ")");
		System.out.println("The height of this rectangle is " + "(" + rectangle3.height + ")");
		System.out.println("The perimeter of this rectangle is " + "(" + rectangle3.getPerimeter() + ")");
		System.out.println("The area of this rectangle is " + "(" + rectangle3.getArea() + ")");
	}

}
