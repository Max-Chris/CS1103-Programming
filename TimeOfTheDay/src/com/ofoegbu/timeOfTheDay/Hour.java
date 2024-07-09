package com.ofoegbu.timeOfTheDay;
import DisplayTime.Display;

public class Hour implements Runnable{
	private int timeInHour;
	private int count;
	private int Seconds;
	private Display dsp;
	
	
	@Override
	public void run() {
		Seconds = showMyTime(dsp);
		//long startTime = System.currentTimeMillis();
	    //while(count < Seconds) {
	    	//count++;
	    }
	    //long elapsedTime = System.currentTimeMillis() - startTime;
	    //System.out.println("The elapsed time is: " +elapsedTime);
	public int showMyTime(Display dsp) {
		
		int viewTime = dsp.hourTime();
		return viewTime;
	}
	}
