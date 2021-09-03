import java.util.Scanner;

public class FivePointOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double average = 0;
		int denominator = 0; // number of integers
		int positive = 0;
		int negative = 0;
		int sum = 0;

		System.out.println("Enter your numbers here (if the number is 0 then the sequence will be terminated): ");
		int integer;
		while ((integer = input.nextInt()) != 0)  {

			denominator++;
			sum = sum + integer;

			if (integer > 0) {
				positive++;
			}

			else {
				negative++;
			}

		}

		average = sum / denominator;
		System.out.println("The sum of your numbers is " + sum);
		System.out.println("The average of your numbers is " + average);
		System.out.println("The number of negatives in your sequence is: " + negative);
		System.out.println("The number of positives in your sequence is: " + positive);

	}
}
