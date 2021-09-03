package practice;

import java.util.Random;

public class ThreePointTwoFour {

	public static void main(String[] args) {

		Random rn = new Random();
		int deck = rn.nextInt(52) + 1;

		if (deck >= 1 && deck <= 4) {
			System.out.println("You got an Ace!");

			if (deck == 1) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 1 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 1 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 1 + 3) {
				System.out.println(" You got a Spades!");
			}

		}
		if (deck >= 5 && deck <= 8) {
			System.out.println("You got a two!");
			if (deck == 5) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 5 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 5 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 5 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 9 && deck <= 12) {
			System.out.println("You got a three!");
			if (deck == 9) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 9 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 9 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 9 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 13 && deck <= 16) {
			System.out.println("You got a four!");
			if (deck == 13) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 13 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 13 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 13 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 17 && deck <= 20) {
			System.out.println("You got a five!");
			if (deck == 17) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 17 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 17 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 17 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 21 && deck <= 24) {
			System.out.println("You got a six!");
			if (deck == 21) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 21 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 21 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 21 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 25 && deck <= 28) {
			System.out.println("You got an seven!");
			if (deck == 25) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 25 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 25 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 25 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 29 && deck <= 32) {
			System.out.println("You got an eight!");
			if (deck == 29) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 29 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 29 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 29 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 33 && deck <= 36) {
			System.out.println("You got an nine!");
			if (deck == 33) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 33 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 33 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 33 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 37 && deck <= 40) {
			System.out.println("You got an ten!");
			if (deck == 37) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 37 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 37 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 37 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 41 && deck <= 44) {
			System.out.println("You got an King!");
			if (deck == 41) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 41 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 41 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 41 + 3) {
				System.out.println(" You got a Spades!");
			}
		}
		if (deck >= 45 && deck <= 48) {
			System.out.println("You got an Queen!");

			if (deck == 45) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 45 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 45 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 45 + 3) {
				System.out.println(" You got a Spades!");
			}
		}

		if (deck >= 49 && deck <= 52) {
			if (deck == 49) {
				System.out.println(" You got a Clubs!");
			}
			if (deck == 49 + 1) {
				System.out.println(" You got a Diamonds!");
			}
			if (deck == 49 + 2) {
				System.out.println(" You got a Hearts!");
			}
			if (deck == 49 + 3) {
				System.out.println(" You got a Spades!");
			}
		}

	}

}