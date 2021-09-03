package methods;

import java.util.Scanner;

public class SixPointTwo {

	public static int sumDigits(int n) {
		int ok = 0;
		int Extract = 0;
		int Remove = 0;
		while (n != ok) {

			Extract = n % 10;
			Remove = n / 10;

			Extract += Extract;
			if (Remove == 0) {
				break;
			} else {
				ok = Remove;
				n = Remove;
			
			}
		}
		return Extract;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int Initial = input.nextInt();

		int sum = sumDigits(Initial);

		System.out.println("The sum of the digits of your integer is: " + sum);
	}

}
