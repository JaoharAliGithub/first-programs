package exceptionhandling;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArrayIndexOutOfBoundsExceptionPrompt {
	public static void fillArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (100 * Math.random());
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[100];
		fillArray(arr);
		boolean continueInput = true;

		do {
			try {
				System.out.println("Enter the index of the array to check: ");
				int index = input.nextInt();
				System.out.println(arr[index]);
				continueInput = false;

			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Please enter an index between 0 - 100");
				input.nextLine();
			}
		} while (continueInput);

	}

}
