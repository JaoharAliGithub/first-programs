package march;

import java.util.Scanner;

public class HiFiveHiEven {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your integer");

		int Number = input.nextInt();

		if (Number % 5 == 0) {

			System.out.println("HiFive");
		}

		else {
			System.out.println("NoHiFive");
		}

		if (Number % 2 == 0) {

			System.out.println("HiEven");

		}

		else {
			System.out.println("NoHiEven");
		}

	}

}
