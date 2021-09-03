package inheritanceandpolymorphism;

import java.util.ArrayList;
import java.util.Collections;

public class shuffleArrayList {

	public static void main(String[] args) {
		ArrayList<Number> mylist = new ArrayList<>();
		mylist.add(1);
		mylist.add(2);
		mylist.add(6);
		mylist.add(2);
		mylist.add(9);
		mylist.add(10);

		System.out.println("Original List : \n" + mylist);

		shuffle(mylist);

		System.out.println("\nShuffled List : \n" + mylist);
	}

	public static void shuffle(ArrayList<Number> list) {
		Number temp_i;
		Number temp_randomer;
		for (int i = 0; i < list.size(); i++) {
			double arandomer = (Math.random() * list.size());
			int randomer = (int) arandomer;
			temp_i = list.get(i);
			temp_randomer = list.get(randomer);
			temp_i = list.get(randomer);
			temp_randomer = list.get(i);
		}
	}// Collections.shuffle(list);

}
