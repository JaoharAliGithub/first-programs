package arrays;

import java.util.Scanner;

public class CopiedCode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number of students");
		int n = input.nextInt();
		double[] grades = new double[n];
		int i = 0;
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		double F = 0;
		grades[i] = input.nextDouble();

		System.out.print("Enter the grades: ");
		for (i = 0; i < n; i++) {
			A = grades[i] = input.nextDouble();

			if (grades[i] > A || grades[i] > A - 10) {
				A = grades[i];
			} else if (grades[i] <= A - 20) {
				B = grades[i];
			}

		}
		System.out.println(A + "Is an A");
		System.out.println(B + "Is a B");

	}
}