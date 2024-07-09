package com.ofoegbu.timeOfTheDay;
import DisplayTime.Display;

public class Hour extends Display implements Runnable{
	
	private int timeInHour;
	private int count;
	private int seconds;
	private Display dsp;
	
	
	@Override
	public void run() {
		seconds = showMyTime(dsp);
		System.out.println("Time in seconds is: "+seconds );
		//long startTime = System.currentTimeMillis();
	    //while(count < Seconds) {
	    	//count++;
	    }
	    //long elapsedTime = System.currentTimeMillis() - startTime;
	    //System.out.println("The elapsed time is: " +elapsedTime);
	public int showMyTime(Display dsp1) {
		int my =dsp1.hourTime();
		
		return 		my;
}
	}
