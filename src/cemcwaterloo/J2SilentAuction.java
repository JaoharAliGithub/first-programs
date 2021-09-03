package cemcwaterloo;

import java.util.Scanner;

public class J2SilentAuction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of bids collected: ");
		int bids = input.nextInt();
		int[] auctions = new int[bids];
		String[] names = new String[bids];
		int highest = 0;
		String highestName = "";

		for (int i = 0; i < auctions.length; i++) {
			names[i] = input.next();
			auctions[i] = input.nextInt();

			if (highest < auctions[i]) {
				highest = auctions[i];
				highestName = names[i];
			}
		}
		System.out.print(highestName);
	}

}
