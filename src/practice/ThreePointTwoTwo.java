package practice;

import java.util.Scanner;

public class ThreePointTwoTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your x value");

		double ex = input.nextDouble();

		System.out.println("Enter your y value");

		double why = input.nextDouble();

		double preDistance = (((ex - 0) * (ex - 0)) + ((why - 0) * (why - 0)));
		double distance = Math.pow(preDistance, 0.5);

		if (distance <= 10) {

			System.out.println("Points " + (ex) + " and " + (why) + " are within the circle");
			System.out.println("The distance from the centre of the circle to your point is " + distance);
		}

		else {
			System.out.println("Points " + (ex) + "and " + (why) + " are not within the circle");
			System.out.println("The distance from the centre of the circle to your point is " + distance);
		}
	}
}