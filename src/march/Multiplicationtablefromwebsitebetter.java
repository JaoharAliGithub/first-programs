package march;

import java.util.Scanner;

public class Multiplicationtablefromwebsitebetter {

	public static void main(String args []) {
	
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Input a number");
        
		int num1 = input.nextInt();
        //yet to understand the "for" function 
		for (int i=0; i<10; i++) {
			System.out.println(num1 + " x " + (i+1) +  " = " + (num1 * (i+1)));
		}
		
		
}

}