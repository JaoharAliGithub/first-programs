package exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionTwoINTS {

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			try {
				System.out.print("Enter two integers: ");
				int number1 = input.nextInt();
				int number2 = input.nextInt();

				System.out.println("The sum is: " + sum(number1, number2));
				continueInput = false;

			} catch (InputMismatchException ex) {
				System.out.println("The input must be an integer. Try again");
				input.nextLine();
			}
		} while (continueInput);

	}

}
