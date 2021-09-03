package objectsandclasses;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many rows and columns will the matrix have?");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] arr = new double[row][column];
		
		System.out.println("Enter the array: ");
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < column; y++) {
				arr[x][y] = input.nextDouble();

			}
		}

		Location loc1 = Location.locateLargest(arr);

		System.out.println(
				"The location of the largest element is: " + loc1.maxValue + "(" + loc1.row + "," + loc1.column + ")");

	}

}
