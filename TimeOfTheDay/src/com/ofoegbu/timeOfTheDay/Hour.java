package com.ofoegbu.timeOfTheDay;
import DisplayTime.Display;

public class Hour extends Display implements Runnable{
	
	private int timeInHour;
	private int count;
	private int seconds;
	private Display dsp;
	private boolean terminate = true;
	
	@Override
	public void run() {
		 while(terminate) {
			 
			 seconds = showMyTime();
				System.out.println("Time in seconds is: "+seconds );
				//long startTime = System.currentTimeMillis();
			    //while(count < Seconds) {
			    	//count++;
			    
			    //long elapsedTime = System.currentTimeMillis() - startTime;
			    //System.out.println("The elapsed time is: " +elapsedTime);	
				
			} 
		 }
	
	public int showMyTime() {
		int my;
		my =super.hourTime();	
		return 		my;
}
	

	public String shutdown() {
		terminate = false;
		return "you have stopped the program";
	}
		
		

	}
