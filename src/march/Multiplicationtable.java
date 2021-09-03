package march;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a number for the multiplication table");
		
	double x = input.nextDouble();
	
	System.out.println(" This is your multiplication table: ");
	System.out.printf(" This is your first product : % .0f \n" , + x * 1);
	System.out.printf(" This is your second product : % .0f \n " , + x * 2);
	System.out.printf(" This is your third product : % .0f \n" , + x * 3);
	System.out.printf(" This is your fourth product : % .0f " , + x * 4);
	System.out.printf(" This is your fifth product : % .0f " , + x * 5);
	System.out.printf(" This is your sixth product : % .0f " , + x * 6);
	System.out.printf(" This is your seventh product : % .0f " , + x * 7);
	System.out.printf(" This is your eighth product : % .0f " , + x * 8);
	System.out.printf(" This is your ninth product : % .0f  " ,  + x * 9);
	System.out.printf(" This is your tenth product : % .0f " , + x * 10);
			
	}

}
