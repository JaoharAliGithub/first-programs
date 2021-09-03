package methods;

public class SixPointOne {

	public static int getPentagonalNumber(int y) {
		int Pentagon = y * (3 * y - 1) / 2;
		return Pentagon;
	}

	public static void main(String[] args) {
		int line = 0;
		for (int n = 1; n < 100; n++) {
			int number = getPentagonalNumber(n);
			System.out.print(number + " ");
			line++;
			if (line >= 10) {
				System.out.println(" ");
				line = 0;
			}
		}

	}

}
