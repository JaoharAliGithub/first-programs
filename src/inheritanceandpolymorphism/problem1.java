package inheritanceandpolymorphism;

public class problem1 {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			if (i < 5) {
				for (int x = 0; x < i; x++) {
					System.out.print("*");
				}
				System.out.println();

			} else if (i > 4) {
				for (int rowsLeft = 8 - i; rowsLeft != 0; rowsLeft--) {
					System.out.print("*");
				}
				System.out.println();
			}

		}

	}

}
