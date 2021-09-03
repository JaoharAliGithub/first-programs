package objectsandclasses;

public class Location {

	public static int row;
	public static int column;
	public static double maxValue = 0;

	Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public static Location locateLargest(double[][] a) {
		int row = 0;
		int column = 0;
		double maxValue = a[row][column];
		for (int i = 0; i < row; i++) {
			for (int n = 0; n < column; n++) {
				if (a[i][n] > maxValue) {
					maxValue = a[i][n];
					row = i;
					column = n;

				}
			}
		}
		return new Location(row, column, maxValue);
	}
}
