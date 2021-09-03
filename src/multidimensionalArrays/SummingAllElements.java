package multidimensionalArrays;

public class SummingAllElements {

	public static void main(String[] args) {
		int total = 0;
		int[][] matrix = new int[6][7];

		for (int column = 0; column < matrix[0].length; column++) {
			for (int row = 0; row < matrix.length; row++)
				total += matrix[row][column];
			System.out.println("Sum for column " + column + " is " + total);

		}

	}

}
