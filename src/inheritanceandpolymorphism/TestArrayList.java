package inheritanceandpolymorphism;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// Create a list to store cities
		ArrayList<String> cityList = new ArrayList<>();

// add some cities in the list
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");

		System.out.println("List Size? " + cityList.size());
		System.out.println("Is miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());

		cityList.add(2, "Xian");

		cityList.remove("Miami");

		cityList.remove(1);

		System.out.println(cityList.toString());

		for (int i = cityList.size() - 1; i >= 0; i--) {
			System.out.print(cityList.get(i) + " ");
			System.out.println();
		}

		ArrayList<TriangleFromGeometricObject> list = new ArrayList<>();

		list.add(new TriangleFromGeometricObject(2, 3, 1));
		list.add(new TriangleFromGeometricObject(2, 2, 2));

		System.out.println("The area of the triangle? " + list.get(0).getArea());
	}

}
