package abstractclasses;

public class TestColorableSquare {

	public static void main(String[] args) {
		AbstractGeometricObject[] arr = {new Circle(2), new Rectangle(4,5), new Square(6), new Square(8), new Circle(6)}; 
		AbstractGeometricObject obj1 = new Square(2);
		
		for(int i =0; i < arr.length; i++) {
			arr[i].howToColor();
		}
	}

}
