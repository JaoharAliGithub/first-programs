package practice;

import java.util.Scanner;

public class ThreePointOneEight {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of your package");

		int weight = input.nextInt();

		if (0 < weight && weight <= 1) {
			System.out.println("The cost of shipping $3.50");
		}

		else if (1 < weight && weight <= 3) {
			System.out.println("The cost of shipping is $5.50");
		} else if (3 < weight && weight <= 10) {
			System.out.println("The cost of shipping is $8.50");
		} else if (10 < weight && weight <= 20) {
			System.out.println("The cost of shipping is $10.50");

		} else if (weight > 50) {
			System.out.println("The package cannot be shipped");
		}
	}

}
