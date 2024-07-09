package com.ofoegbu.timeOfTheDay;

import DisplayTime.Display;

public class Clock {

	public static void main(String[] args) {
		Hour currentHour = new Hour();
		Thread elapsedMinute = new Thread(currentHour);
		Display seeMyClock = new Display();
		elapsedMinute.start();

	}

}
