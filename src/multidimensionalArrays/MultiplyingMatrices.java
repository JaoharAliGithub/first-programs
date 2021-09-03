package multidimensionalArrays;

import java.util.Scanner;

public class MultiplyingMatrices {

	Scanner input = new Scanner(System.in);

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double element = 0;
		double[][] c = new double[3][3];
		
		for (int i = 0; i < 9; i ++) {
			if (i < 3) {
				
			}
			if (i > 3) {
				
			}
			else if (i > 6) {
				
			}			
		}

	c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0]+a[0][2]*b[2][0];

	return c;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] A = new double[3][3];
		double[][] B = new double[3][3];
		double[][] C = new double[3][3];

		System.out.println("Enter Matrix 1: ");
		for (double limitArow = 0; limitArow < 3; limitArow++) {
			for (double limitAcolumn = 0; limitAcolumn < 3; limitAcolumn++) {
				double Elements1 = input.nextDouble();
				A[(int) limitArow][(int) limitAcolumn] = Elements1;
			}

		}
		System.out.println("Enter Matrix 2: ");
		for (double limitBrow = 0; limitBrow < 3; limitBrow++) {
			for (double limitBcolumn = 0; limitBcolumn < 3; limitBcolumn++) {
				double Elements2 = input.nextDouble();
				B[(int) limitBrow][(int) limitBcolumn] = Elements2;
			}

		}

		C = multiplyMatrix(A, B);

		for (double limitCrow = 0; limitCrow < 3; limitCrow++) {
			for (double limitCcolumn = 0; limitCcolumn < 3; limitCcolumn++) {
				System.out.print(C[(int) limitCrow][(int) limitCcolumn] + " ");
			}
			System.out.println();
		}
	}

}
