package inheritanceandpolymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> listed = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers until you feel like stopping. To stop entering integers, enter 0.");
		int done = 0;
		boolean check = false;
		while (check == false) {
			Integer value = input.nextInt();
			if (value == 0) {
				check = true;

			} else {
				listed.add(value);
			}
			done = max(listed);
		}
		System.out.println("The max value is: " + done);
	}

	public static Integer max(ArrayList<Integer> list) {
		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}
}
