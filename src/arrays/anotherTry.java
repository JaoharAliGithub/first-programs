package arrays;

public class anotherTry {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = input.nextInt();
		double[] numbers = new double[n];
		double max = numbers[0];
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;

		System.out.println("Enter the grades: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			max = numbers[i];
		}

		for (int i = 0; i < n; i++)
			if (numbers[i] > max)
				max = numbers[i];
			else if (numbers[i] < max - 10)
				A = numbers[i];
			else if (numbers[i] < max - 20)
				B = numbers[i];
			else if (numbers[i] < max - 30)
				C = numbers[i];
			else if (numbers[i] < max - 40)
				D = numbers[i];

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);

	}

}
