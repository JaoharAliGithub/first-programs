package cemcwaterloo;

import java.util.Scanner;

public class J1BoilingWater {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperate of the water");
		double B = input.nextDouble();
		double P = 5 * B - 400;

		System.out.println(P);
		System.out.println(secondOut(P));
	}

	public static int secondOut(double value) {
		if (value < 100) {
			return 1;
		} else if (value > 100) {
			return -1;
		} else {
			return 0;
		}
	}
}
