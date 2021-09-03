package practice;

import java.util.Scanner;

public class ThreePointOneNine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first side length");

		double x = input.nextInt();

		System.out.println("Enter your second side length");

		double y = input.nextInt();

		System.out.println("Enter your third side length");

		double z = input.nextInt();

		if (x + y > z && x + z > y && y + z > x) {
			System.out.println("Your triangle is valid");
		}
		else 
			System.out.println("Your triangle is invalid");

	
	
	
	
	}

	
}
