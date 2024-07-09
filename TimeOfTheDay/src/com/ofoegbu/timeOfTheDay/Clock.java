package com.ofoegbu.timeOfTheDay;

import java.util.Scanner;

import DisplayTime.Display;

public class Clock implements Control{
	

	public String shutdown(Hour hr) {
		hr.shutdown();
		return "you have stopped the program";
	}

	public static void main(String[] args) {
		Clock implm = new Clock();
		Scanner scanner = new Scanner(System.in);

		Hour currentHour = new Hour();
		Thread elapsedMinute = new Thread(currentHour);
		Display seeMyClock = new Display();
		Thread myDisplay = new Thread(seeMyClock);
		elapsedMinute.start();
		myDisplay.start();
		System.out.println("Hit the return key to terminate the program");
		String endIt = scanner.nextLine();
		
		implm.shutdown(currentHour);

	}
	
	

}
interface Control{
	public String shutdown(Hour hr);
}
