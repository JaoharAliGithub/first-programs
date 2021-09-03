package objectsandclasses;

public class Time {

	private int hour;
	private int minute;
	private int second;
	private long current;

	public Time() {
		current = System.currentTimeMillis();
	}

	public Time(int new_hour, int new_minute, int new_second) {

		hour = new_hour;
		minute = new_minute;
		second = new_second;
	}

	public Time(long time) {
		current = time;

	}

	public void setTime(long elapsedTime) {
		current = elapsedTime;
	}

	public int getHour() {
		return (int) (current / (1000 * 60 * 60)) % 24;
	}

	public int getMinute() {
		return (int) (current / (1000 * 60)) % 60;
	}

	public int getSecond() {
		return (int) (current / 1000) % 60;
	}

}
