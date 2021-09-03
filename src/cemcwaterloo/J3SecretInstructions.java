package cemcwaterloo;

import java.util.Scanner;

public class J3SecretInstructions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean checker = false;
		while (checker != true) {
			{
				int inputSheesh = input.nextInt();
				if (inputSheesh == 99999) {
					checker = true;
					System.exit(1);
				}
				int steps = inputSheesh % 1000;
				if (steps == 000) {
					steps = 100;
				}
				System.out.println(direction(inputSheesh) + " " + steps);
			}
		}
	}

	public static String direction(int value) {
		int directionCheck = value / 1000 + value / 10000;
		if (directionCheck % 2 != 0) {
			return "left";
		} else {
			return "right";
		}
	}

}
