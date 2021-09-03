package inheritanceandpolymorphism;

import java.util.GregorianCalendar;

public class MyDate extends Object {
	public int year;
	public int month;
	public int day;

	GregorianCalendar c = new GregorianCalendar();

	public MyDate() {
		this.year = (GregorianCalendar.YEAR);
		this.month = (GregorianCalendar.MONTH);
		this.day = (GregorianCalendar.DAY_OF_MONTH);
	}

	public MyDate(long elapsedTime) {
		long elapsedDate = c.setTimeInMillis(elapsedTime);
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	int getYear() {
		this.year = (GregorianCalendar.YEAR);
		return this.year;
	}

	int getMonth() {
		this.month = (GregorianCalendar.MONTH);
		return this.month;
	}

	int getDay() {
		this.day = (GregorianCalendar.DAY_OF_MONTH);
		return this.day;
	}

	long setDate(long elapsedTime) {
 
		return elapsedDate;
	}
}
