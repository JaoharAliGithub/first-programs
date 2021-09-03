package practice;

import java.util.Scanner;
import java.util.Random;

public class ThreePointFive {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 0 - 6 day");

		int day = input.nextInt();

		System.out.println("Enter how many days you want from today");

		int addDay = input.nextInt();

		if (addDay == 0)

			switch (day) {

			case 0:
				System.out.println("Today is Sunday");
				break;
			case 1:
				System.out.println("Today is Monday");
				break;
			case 2:
				System.out.println("Today is Tuesday");
				break;
			case 3:
				System.out.println("Today is Wednesday");
				break;
			case 4:
				System.out.println("Today is Thursday");
				break;
			case 5:
				System.out.println("Today is Friday");
				break;
			case 6:
				System.out.println("Today is Saturday");
				break;
			default:
				System.out.println(
						"The current date value cannot be calculated as you have not entered a value between 0 and 6.");

			}

		else { 
			switch (day) {

		case 0:
			System.out.println("Today is Sunday");
			break;
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println(
					"The current date value cannot be calculated as you have not entered a value between 0 and 6.");

		}

		if ((day + addDay) % 7 == 0) {
			System.out.println("Your future date is a Sunday");
		} else if ((day + addDay) % 7 == 1) {
			System.out.println("Your future date is a Monday");
		} else if ((day + addDay) % 7 == 2) {
			System.out.println("Your future date is a Tuesday");
		} else if ((day + addDay) % 7 == 3) {
			System.out.println("Your future date is a Wednesday");
		} else if ((day + addDay) % 7 == 4) {
			System.out.println("Your future date is a Thursday");
		} else if ((day + addDay) % 7 == 5) {
			System.out.println("Your future date is a Friday");
		} else if ((day + addDay) % 7 == 6) {
			System.out.println("Your future date is a Saturday");
		}

	}
	}
}