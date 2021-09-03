package arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SevenPointTwoOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of balls to drop: ");
		int balls = input.nextInt();

		System.out.println("Enter the number of slots: ");
		int x = input.nextInt();

		int she = 0;
		char right = 'R';
		int count = 0;
		String path = "";
		String[] slots = new String[x];

		for (int i = 0; i < balls; i++) {
			path = "";
			for (int r = 1; r < x; r++) {

				Random ran = new Random();
				int Flip = ran.nextInt(2) + 1;

				if (Flip == 1) {
					path = path + "L";

				}
				if (Flip == 2) {
					path = path + "R";
				}
			}
			for (int z = 1; z < path.length(); z++) {
				if (path.charAt(z) == right) {
					count++;
				}
			}

			slots[count - 1] = "0";

			if (slots[count] == slots[count]) {
				for (int bl = 0; bl < count; bl++) {
					System.out.print(" ");
				}
				System.out.print("0");
			}

			count = 0;
			System.out.println(path);

		}
		// System.out.println(" ");

		System.out.println(java.util.Arrays.toString(slots));

	}
}

//if (she < count) {

// for (int f = 1; f < count; f++) {
// System.out.print(" ");
// }
// System.out.print("0");

// }