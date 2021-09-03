package abstractclasses;

import java.util.Scanner;

public class TestComplexClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first complex number: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("Enter the second complex number:");
		double c = input.nextDouble();
		double d = input.nextDouble();

		Complex num1 = new Complex(a, b);
		Complex num2 = new Complex(c, d);

		System.out.println(Complex.add(a, b, c, d));
		System.out.println(Complex.subtract(a, b, c, d));
		System.out.println(Complex.multiply(a, b, c, d));
		System.out.println(Complex.divide(a, b, c, d));
		System.out.println(Complex.abs(a, b, c, d));
	}

}
