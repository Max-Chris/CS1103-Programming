package DisplayTime;

import java.util.Calendar;


public class Display implements Runnable{
	
	public int hourTime() {
		int seconds;
		while (true) {

			Calendar now= Calendar.getInstance();
			//int hour = now.get(Calendar.HOUR_OF_DAY);
			//int minute=now.get(Calendar.MINUTE);
			seconds = now.get(Calendar.SECOND);
			return seconds;

			}
	}

	@Override
	public void run() {
		hourTime();
		
	}
	
}
