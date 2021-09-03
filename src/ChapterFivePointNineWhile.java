import java.util.Scanner;

public class ChapterFivePointNineWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students in the class");
		int noStudent = input.nextInt();
		System.out.println("Enter the name of the student");
		String name = input.next();
		System.out.println("Enter the grade of the student");
		int grade = input.nextInt();
		
		for (int i = 0; i + 1 < noStudent; i++) {

			System.out.println("Enter the name of the student");
			String name1 = input.next();
			System.out.println("Enter the grade of the student");
			int grade1 = input.nextInt();

			if (Math.max(grade, grade1) == grade) {
				System.out.println("The highest mark belongs to " + name + " " + grade);
			} else if (Math.max(grade, grade1) == grade1) {
				System.out.println("The highest mark belongs to " + name1 + " " + grade1);

			}

		}

	}
}