import java.util.Scanner;

public class AnotherOne {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size of the classroom");
		int classSize = input.nextInt();

		System.out.println("Enter the name of your student");
		String name = input.next();
		System.out.println("Enter the mark of the student");
		double highestMark = input.nextDouble();

		System.out.println("Enter the next name");
		String secondName = input.next();
		System.out.println("Enter the mark");
		double secondMark = input.nextDouble();

		if (secondMark > highestMark) {
			highestMark = secondMark;
			secondMark = highestMark;
			
		}
		for (int x = 2; x < classSize; x++) {

			System.out.println("Enter the next name");
			secondName = input.next();
			System.out.println("Enter the mark");
			secondMark = input.nextDouble();

			if (secondMark > highestMark) {
				highestMark = secondMark;
				secondMark = highestMark;

			}
			System.out.println("The highest mark was: " + highestMark);
			System.out.println("The second highest mark was: " + secondMark);
		}
	}
}