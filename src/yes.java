import java.util.Scanner;

public class yes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many students are in the classroom?");

		int Students = input.nextInt();

		System.out.println("Enter the name of the student");
		String HighestName = input.next();
		System.out.println("Enter the grade of the student");
		double HighestGrade = input.nextDouble();

		System.out.println("Enter the name of the student");
		String SecondName = input.next();
		System.out.println("Enter the grade of the student");
		double SecondGrade = input.nextDouble();

		String HIGHMARKNAME;
		String SECONDMARKNAME;

		if (SecondGrade > HighestGrade) {
			HighestGrade = SecondGrade;
			SecondGrade = HighestGrade;
			HIGHMARKNAME = SecondName + HighestGrade;
			SECONDMARKNAME = HighestName + SecondGrade;
		} else {
			HIGHMARKNAME = HighestName + HighestGrade;
			SECONDMARKNAME = SecondName + SecondGrade;
		}

		for (int x = 2; x < Students; x++) {

			System.out.println("Enter the name of the student");
			String ThirdName = input.next();
			System.out.println("Enter the grade of the student");
			double ThirdGrade = input.nextDouble();

			if (ThirdGrade > HighestGrade) {
				SecondGrade = HighestGrade;
				HighestGrade = ThirdGrade;
				HIGHMARKNAME = ThirdName + HighestGrade;

			} else if (ThirdGrade > SecondGrade && ThirdGrade < HighestGrade) {
				SecondGrade = ThirdGrade;
				SECONDMARKNAME = ThirdName + ThirdGrade;

			} else if (ThirdGrade < SecondGrade && ThirdGrade < HighestGrade) {
				if (SecondGrade > HighestGrade) {
					HighestGrade = SecondGrade;
					SecondGrade = HighestGrade;

					HIGHMARKNAME = SecondName + SecondGrade;
					SECONDMARKNAME = HighestName + ThirdGrade;
				}
			}

		}
		System.out.println("The highest grade was " + "  " + HIGHMARKNAME);
		System.out.println("The second highest grade was " + "  " +  SECONDMARKNAME);
	}

}