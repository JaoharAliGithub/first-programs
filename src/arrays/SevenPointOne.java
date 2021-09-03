package arrays;

import java.util.Scanner;

public class SevenPointOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the number of students");
		int n = input.nextInt();

		double[] StudentGrade = new double[n];
		double max = StudentGrade[0];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the grade of the student");
			StudentGrade[i] = input.nextDouble();
		}
		for (int i = 0; i < StudentGrade[i]; i++) {
			if (StudentGrade[i] > max) {
				max = StudentGrade[i];
			}
		}
		System.out.println(max);

	}

}
