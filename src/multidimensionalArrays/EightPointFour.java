package multidimensionalArrays;

import java.util.Scanner;

public class EightPointFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of employees: ");
		int numberOfEmployees = input.nextInt();

		int[][] weeklyHours = new int[numberOfEmployees][7];

		for (int i = 0; i < numberOfEmployees; i++) {
			for (int x = 0; x < 7; x++) {
				double hours = Math.random() * 9;
				weeklyHours[i][x] = (int) hours;
	
				//WRITE A SWTICH STATEMENT AND SET 0 -6 AS SUNDAY - SATURDAY
				System.out.print(weeklyHours[i][x] + " ");
			}
			
			System.out.println();
		}
	}
}