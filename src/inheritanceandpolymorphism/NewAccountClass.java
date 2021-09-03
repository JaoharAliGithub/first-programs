package inheritanceandpolymorphism;

import java.util.ArrayList;
import java.util.Date;

public class NewAccountClass {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	public static Date dateCreated = new java.util.Date();
	private String name;
	static ArrayList<TransactionClass> transactions = new ArrayList<>();

	public NewAccountClass() {

	}

	public NewAccountClass(int new_id, double new_balance, double new_annualInterestRate, Date new_dateCreated,
			String new_name, TransactionClass transaction) {

		id = new_id;
		balance = new_balance;
		annualInterestRate = new_annualInterestRate;
		dateCreated = new_dateCreated;
		name = new_name;
	}

	public NewAccountClass(String name, int id, double balance) {
		TransactionClass transaction1 = new TransactionClass();
		transactions.add(transaction1);
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

	void set_annualInterestRate(double rate) {
		this.annualInterestRate = rate;
	}

	Date get_dateCreated() {
		return dateCreated;
	}

	String getName() {
		return this.name;
	}

	String setName(String name) {
		this.name = name;
		return this.name;
	}

	double getMonthlyInterestRate() {
		double MonthlyInterestRate = (annualInterestRate / 100) / 12;
		return MonthlyInterestRate;
	}

	double getMonthlyInterest() {
		double MonthlyInterest = balance * (annualInterestRate / 100) / 12;
		return MonthlyInterest;
	}

	double deposit(double money) {
		this.balance = balance + money;
		return balance;
	}

	double withdraw(double money) {
		this.balance = balance - money;
		return balance;
	}

	public ArrayList<TransactionClass> getTransactions() {
		return transactions;
	}
}
