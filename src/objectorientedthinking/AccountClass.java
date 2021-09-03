package objectorientedthinking;

import java.util.Date;

public class AccountClass {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new java.util.Date();

	AccountClass() {

	}

	AccountClass(int new_id, double new_balance, double new_annualInterestRate, Date new_dateCreated) {
		id = new_id;
		balance = new_balance;
		annualInterestRate = new_annualInterestRate;
		dateCreated = new_dateCreated;
	}

	int get_id() {
		return id;
	}

	double get_balance() {
		return balance;
	}

	double get_annualInterestRate() {
		return annualInterestRate;
	}

	Date get_dateCreated() {
		return dateCreated;
	}

	double getMonthlyInterestRate() {
		double MonthlyInterestRate = (annualInterestRate / 100) / 12;
		return MonthlyInterestRate;
	}

	double getMonthlyInterest() {
		double MonthlyInterest = balance * (annualInterestRate / 100) / 12;
		return MonthlyInterest;
	}
	double withdraw(double withdrawe) {
		double withdrawedaccount = balance - withdrawe;
		return withdrawedaccount;
	}
	double deposit(double deposite) {
		double deposited = balance + deposite;
		return deposited;
		
	}

}
