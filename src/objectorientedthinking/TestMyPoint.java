package objectorientedthinking;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);

		double Distance = point1.distance(point2);
		System.out.println(Distance);
	}

}
