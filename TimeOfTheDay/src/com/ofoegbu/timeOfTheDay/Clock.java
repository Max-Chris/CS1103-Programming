package com.ofoegbu.timeOfTheDay;

public class Clock {

	public static void main(String[] args) {
		Hour currentHour = new Hour();
		Thread elapsedMinute = new Thread(currentHour);
		elapsedMinute.start();

	}

}
