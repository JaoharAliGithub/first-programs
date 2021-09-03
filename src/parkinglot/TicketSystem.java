package parkinglot;

import java.util.Scanner;
import java.util.Date;
public class TicketSystem {

	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your six digit parking ticket number: ");

		double Ticket = input.nextDouble();
		Date Now = new Date ();
		System.out.println("The time of your entry to this garage is: " + Now);
		System.out.print(Ticket);
	
		 
	}
}
