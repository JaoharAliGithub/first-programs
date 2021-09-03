package chapterfour;

public class DegreestoRadians {

	public static void main(String[] args) {

		double a = Math.toRadians(47);
		System.out.println(a);

		double b = Math.toDegrees(Math.PI / 7);
		System.out.println(b);

		double c = 34 + (int) Math.random() * 55;
		System.out.println(c);

		double d = (int) Math.random() * 999;
		System.out.println(d);

		double e = 5.5 + (double) Math.random() * 55.5;
		System.out.println(e);

		double f = Math.log(Math.exp(5.5));
		
		double g = Math.exp(Math.log(5.5));
		
		double h = Math.asin(Math.sin(Math.PI/6));
		
		double i = Math.sin(Math.asin(Math.PI/6));
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
	}

}
