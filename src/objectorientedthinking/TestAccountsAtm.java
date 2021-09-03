package objectorientedthinking;

import java.util.Scanner;

public class TestAccountsAtm {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double value = 100;
		boolean check = false;
		Accounts[] account;
		account = new Accounts[10];

		for (int i = 0; i < 10; i++) {
			account[i] = new Accounts();
		}

		while (check == false) {

			System.out.println("Enter an id: ");
			int idValue = input.nextInt();
			if (idValue == 0 || idValue == 1 || idValue == 2 || idValue == 3 || idValue == 4 || idValue == 5
					|| idValue == 6 || idValue == 7 || idValue == 8 || idValue == 9) {

				while (check == false) {

					System.out.println("Main Menu");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					System.out.println("Enter a choice: ");
					int choice = input.nextInt();

					switch (choice) {
					case 1:
						System.out.println("The balance is: " + account[idValue].get_balance());
						break;
					case 2:
						System.out.println("Enter an amount to withdraw: ");
						double withdrawer = input.nextDouble();
						account[idValue].withdraw(withdrawer);
						break;
					case 3:
						System.out.println("Enter an amount to deposit: ");
						double depositer = input.nextDouble();
						account[idValue].deposit(depositer);
						break;
					case 4:
						break;
					}

				}
			} else {
				System.out.println("Please enter a correct ID");
			}

		}
	}
}