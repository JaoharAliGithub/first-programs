package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class anotherONe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = input.nextInt();
		double Best = 0;
		double[] StudentGrade = new double[n];

		System.out.println("Enter the grades: ");
		for (int i = 0; i < n; i++) {
			StudentGrade[i] = input.nextDouble();

			if (StudentGrade[i] == StudentGrade[0]) {
				Best = StudentGrade[0];
			}
		}
		for (int i = 1; i < n; i++) {
			if (StudentGrade[i] > Best) {
				Best = StudentGrade[i];

			}

		}

		for (int i = 0; i < n; i++) {
			if (StudentGrade[i] > Best - 10) {
				double A = StudentGrade[i];

				System.out.println(" The Student " + i + " got a mark of " + StudentGrade[i] + " The Mark was an A");
			} else if (StudentGrade[i] > Best - 20) {
				double B = StudentGrade[i];

				System.out.println(" The Student " + i + " got a mark of " + StudentGrade[i] + " The Mark was a B");
			} else if (StudentGrade[i] > Best - 30) {
				double C = StudentGrade[i];

				System.out.println(" The Student " + i + " got a mark of " + StudentGrade[i] + " The Mark was a C");
			} else if (StudentGrade[i] > Best - 100) {
				double D = StudentGrade[i];

				System.out.println(" The Student " + i + " got a mark of " + StudentGrade[i] + " The Mark was a D");

			}
		}
	}

}
