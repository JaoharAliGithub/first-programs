package march;

import java.util.Scanner;

public class Averagevalueof5numberss {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" Enter your first number: ");

		double one = input.nextDouble();

		System.out.println(" Enter your second number: ");

		double two = input.nextDouble();

		System.out.println(" Enter your third number: ");

		double three = input.nextDouble();

		System.out.println(" Enter your fourth number: ");

		double four  = input.nextDouble();
		
		System.out.println(" Enter your fifth number: ");

		double five  = input.nextDouble();
		
		double average = (one + two + three + four + five)/5;

		//System.out.println(" The average of your five numbers is : " + average);
		
		
		System.out.printf(" The average of your five numbers is : % .2f and % .4f" ,(one + two + three + four + five)/5 , average);
	
	}

}
