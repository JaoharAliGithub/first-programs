
package march;


import java.util.Scanner;

public class computearea {

	public static void main(String args[]) {
	
	// create a scanner object	
	Scanner input = new Scanner(System.in);
	// prompt user to enter radius
	System.out.println(" Enter a number for radius: ");
	
	// radius is a variable to store radius values
	double radius = input.nextDouble();
	// compute area
	double area = radius * radius * 3.14159;
	
	System.out.println("The area for the circle of radius " + radius + " is " + area);
	
}


}
