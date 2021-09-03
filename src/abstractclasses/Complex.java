package abstractclasses;

public class Complex implements Cloneable {
	double a;
	double b;
	double c;
	double d;

	Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	Complex(double a) {
		this.a = a;
		this.b = 0;
	}

	Complex() {
		this.a = 0;
		this.b = 0;
	}

	public static String add(double a, double b, double c, double d) {
		double realA = a + c;
		double realB = b + d;

		return (realA + " + " + realB + "i");
	}

	public static String subtract(double a, double b, double c, double d) {
		double realA = a - c;
		double realB = b - d;
		return (realA + " + " + realB + "i");
	}

	public static String multiply(double a, double b, double c, double d) {
		double realA = a * c - b * d;
		double realB = b * c + a * d;
		return (realA + " + " + realB + "i");
	}

	public static String divide(double a, double b, double c, double d) {
		double realA = (a * c + b * d) / (c * c + d * d);
		double realB = (b * c - a * d) / (c * c + d * d);
		return (realA + " + " + realB + "i");
	}

	public static double abs(double a, double b, double c, double d) {
		return Math.sqrt(a * a + b * b);
	}
}
