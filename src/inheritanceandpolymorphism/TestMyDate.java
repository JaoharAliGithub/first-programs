package inheritanceandpolymorphism;

import java.util.GregorianCalendar;

public class TestMyDate {

	public static void main(String[] args) {
		long elapsedTime = 324677357;
		MyDate date = new MyDate(elapsedTime);

		date.setTimeMillis(elapsedTime);

	}

}
