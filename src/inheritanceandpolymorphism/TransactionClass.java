package inheritanceandpolymorphism;

public class TransactionClass extends NewAccountClass {

	java.util.Date date;
	char type;
	double amount;
	double balance;
	String description;

	public TransactionClass() {

	}

	public TransactionClass(java.util.Date date, char type, double amount, double balance, String description) {
		this.date = date;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;

	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setType(char type) {
		this.type = type;
	}

	public char getType() {
		return type;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

}
