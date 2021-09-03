package practice;

import java.util.Scanner;

public class ThreePointThreeThree {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x value");
		double ex = input.nextDouble();
		System.out.println("Enter the y value");
		double why = input.nextDouble();

		if ((ex >= -5 && ex <= 5) && (why >= -2.5 && why <= 2.5)) {
			System.out.println("Point " + ex + " and " + why + " are within the rectangle");
		}

		else {
			System.out.println("Point " + ex + " and " + why + " are not within the rectangle");
		}

	}
}
