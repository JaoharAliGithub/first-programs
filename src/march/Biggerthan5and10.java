package march;

import java.util.Scanner;

public class Biggerthan5and10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your integer");

		int number = input.nextInt();

		if (number >= 5) {
			if (number <= 10) {
				System.out.println("your number is between 5 & 10");
			}

			else {
				System.out.println("Your number is greater than 10");

			}
		}

		else {
			System.out.println("Your number is less than 5");

		}

	}
}