package multidimensionalArrays;

import java.util.Scanner;

public class EightPointTwo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 4-by-4 matrix row by row");

		double Value = 0;
		double[][] um = new double[4][4];
		int i = 0;
		int x = 0;
		for (i = 0; i < 4; i++) {
			for (x = 0; x < 4; x++) {
				Value = input.nextDouble();
				um[i][x] = Value;
			}

		}
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(um));

	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = m[0][0] + m[1][1] + m[2][2] + m[3][3];
		return sum;
	}
}