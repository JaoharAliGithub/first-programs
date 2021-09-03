package practice;

import java.util.Scanner;

public class ThreePointOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of the coefficient a");

		double a = input.nextInt();

		System.out.println("Enter the value of the coefficient b");

		double b = input.nextInt();

		System.out.println("Enter the value of the coefficient a");

		double c = input.nextInt();

		double discriminant = ((b * b) + (-4 * a * c));

		if (discriminant > 0) {
			System.out.println("The equation has two real roots");
			double rootone = (-b - (Math.pow(discriminant, 0.5))) / (2 * a);
			double roottwo = (-b + (Math.pow(discriminant, 0.5))) / (2 * a);
			System.out.println("Your first root is " + rootone + " and " + "your second root is " + roottwo);
		} else if (discriminant == 0) {
			System.out.println("The equation has one real roots");
			double zeroroot = (-b + (Math.pow(discriminant, 0.5))) / (2 * a);
			System.out.println("Your singular root is: " + zeroroot);
		} else if (discriminant < 0) {
			System.out.println("The equation has no real roots");
		}

		
	}

}