import java.util.Scanner;

public class ChapterFivePointNine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students in class: ");
		int classSize = input.nextInt();
		int i = 2;

		while (i < classSize) {
			System.out.println("Enter the name of the student: ");
			String name = input.next();
			System.out.println("Enter the grade of the student");
			double grade = input.nextDouble();
			System.out.println("Enter the name of the student: ");
			String name1 = input.next();
			System.out.println("Enter the grade of the student");
			double grade1 = input.nextDouble();
			i++;

			while (grade > grade1) {
				System.out.println("Enter the name of the student: ");
				String name2 = input.next();
				System.out.println("Enter the grade of the student");
				double grade2 = input.nextDouble();
				if (grade > grade1 && grade > grade2) {
					System.out.println(name + " " + grade + " is the highest mark");
					i++;
					if (i <= classSize) {

					}
				}
				while (grade1 > grade) {
					System.out.println("Enter the name of the student: ");
					String name3 = input.next();
					System.out.println("Enter the grade of the student");
					double grade3 = input.nextDouble();
					if (grade1 > grade && grade1 > grade3) {
						System.out.println(name + " " + grade + " is the highest mark");
						i++;
						if (i <= classSize) {
							break;
						}
					}

				}
			}

		}
	}
}
