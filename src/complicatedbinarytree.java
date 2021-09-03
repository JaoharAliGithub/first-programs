import java.util.ArrayList;
import java.util.Arrays;

public class complicatedbinarytree {

	public static void main(String[] args) {

		int initialSum = 10;
		ArrayList<Integer> lastNodeArr = new ArrayList<>();
		while (check(lastNodeArr) == false) {

			lastNodeArr.clear();
			int newNode1 = splitter(initialSum);
			int complementNode = initialSum - splitter(initialSum);
			System.out.println(newNode1 + " " + complementNode);

			if ((newNode1 == 1 || newNode1 == 0) && (complementNode == 1 || complementNode == 0)) {

				lastNodeArr.add(newNode1);
				lastNodeArr.add(complementNode);
				check(lastNodeArr);

			} else {
				splitter(newNode1);

			}
		}
		ArrayListMultiDimensional(lastNodeArr);
		System.out.println(lastNodeArr.toString());

	}

	public static boolean check(ArrayList<Integer> list) {
		boolean checke = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1 || list.get(i) == 0) {
				checke = true;
			} else {
				checke = false;
			}
		}
		return checke;

	}

	public static int splitter(int initialSum) {
		double complement = Math.random() * (initialSum - 1);
		return (int) complement;
	}

	public static void ArrayListMultiDimensional(ArrayList<Integer> list) {

		int numOfElements = list.size();
		double extra = Math.log(numOfElements);
		int numOfArrays = (int) extra;
		int[][] newList = new int[numOfArrays][];
		for (int i = 0; i < numOfArrays; i++) {
			double extraStep = Math.pow(2, i);
			int x = (int) extraStep;
			for (int z = 0; z < x; z++) {
				int[] newArr = new int[z];

				newArr = null;
			}
		}
	}

	public static int newNodeMaker(ArrayList<Integer> list) {
		int newVar = 0;
		for (int i = 0; i < list.size(); i++) {
			newVar = list.get(i);
		}
		return newVar;
	}

}
