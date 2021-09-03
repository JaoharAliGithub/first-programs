package objectorientedthinking;

import java.util.Date;

public class TestAccountClass {

	public static void main(String[] args) {
		Date date = new Date();
		AccountClass ac1 = new AccountClass(1122, 20000, 4.5, date);
		System.out.println("The ID of the Account is: " + ac1.get_id());
		System.out.println("The balance of the Account is: " + ac1.get_balance());
		System.out.println("The monthly interest of the Account is: " + ac1.getMonthlyInterest());
		System.out.println("The ID of the Account is: " + ac1.get_dateCreated());
	}

}
