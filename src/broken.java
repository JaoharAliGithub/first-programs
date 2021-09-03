import java.util.Scanner;

public class broken {

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		int playerturn = 1;
		Scanner input = new Scanner(System.in);

		if (checker(board) == false) {
			for (int plays = 0; plays < 9; plays++) {

				int first1 = 0;
				int second1 = 0;
				int first2 = 0;
				int second2 = 0;

				if (playerturn == 1) {

					System.out.println("Enter a row (0, 1, or 2) for player X: ");
					first1 = input.nextInt();
					System.out.println("Enter a column (0, 1, or 2) for player X: ");
					second1 = input.nextInt();
					board[first1][second1] = 'X';
					playerturn = 0;

					for (int x = 0; x < 3; x++) {
						for (int y = 0; y < 3; y++) {

							System.out.print(board[x][y] + " ");
						}
						System.out.println();
					}
					if (checker(board) == true) {
						System.out.println("You win!");
						System.exit(1);
					} else if (playerturn == 0) {
						System.out.println("Enter a row (0, 1, or 2) for player O: ");
						first2 = input.nextInt();
						System.out.println("Enter a column (0, 1, or 2) for player O: ");
						second2 = input.nextInt();
						board[first2][second2] = 'O';
						playerturn = 1;

						for (int x = 0; x < 3; x++) {
							for (int y = 0; y < 3; y++) {

								System.out.print(board[x][y] + " ");
							}
							System.out.println();
						}
						if (checker(board) == true) {
							System.out.println("You win!");
							System.exit(1);

						}

					}
				}
			}
		} else if (checker(board) == true) {
			System.exit(1);
		} else if (checker(board) == false) {
			System.out.println("The game was a tie");
		}

	}

	public static boolean checker(char[][] board) {
		boolean condition = false;
		int column = 0;
		int row = 0;

		for (row = 0; row < 3; row++) {
			column = 0;
			if (board[row][column] == 'X' || board[row][column] == 'O') {
				condition = true;
			}
		}
		for (column = 0; column < 3; column++) {
			row = 0;
			if (board[row][column] == 'X' || board[row][column] == 'O') {
				condition = true;
			}
		}

		if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			condition = true;
		} else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			condition = true;
		} else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			condition = true;
		} else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
			condition = true;
		} else {
			condition = false;
		}
		return condition;
	}
}
