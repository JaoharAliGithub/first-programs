package objectorientedthinking;

import java.util.Date;

public class Accounts {
	private double balance = 100;

	public Accounts() {

	}

	public double get_balance() {
		return balance;
	}

	public double deposit(double deposite) {
		balance = balance + deposite;
		return balance;
	}

	public double withdraw(double withdrawe) {
		balance = balance - withdrawe;
		return balance;
	}
}