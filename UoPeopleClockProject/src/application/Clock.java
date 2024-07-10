package application;
	
import java.util.Calendar;

import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.scene.layout.FlowPane;
import javafx.event.EventHandler;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.application.Platform;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import application.HourTime;



public class Clock extends Application implements Runnable{
	//private TextField text = new TextField();

	
	private int timeInHour;
	private int count;
	private String seconds;
	//private Display dsp;
	private volatile boolean terminate = true;
	private HourTime seeTheTime;
	
	@Override
	public void run() {
		 while(terminate) {
			 //seconds = hourTime();
				System.out.println("Time in seconds is: "+seconds );
				//long startTime = System.currentTimeMillis();
			    //while(count < Seconds) {
			    	//count++;
			    
			    //long elapsedTime = System.currentTimeMillis() - startTime;
			    //System.out.println("The elapsed time is: " +elapsedTime);	
				
				//Platform.runLater( () ->
					//			text.setText(hourTime()));

			} 
		 }
	
	public int displayhour(){
		int myHour= getTimeInHour();
		return myHour;
	}


	
	public int getTimeInHour() {
		return timeInHour;
	}

	public void setTimeInHour(int timeInHour) {
		this.timeInHour = timeInHour;
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			
			TextField text = new TextField();
			HBox componentGroup = new HBox();
			componentGroup.setSpacing(20);

			//TextArea display = new TextArea();
			//BorderPane root = new BorderPane();
			Label message = new Label("Welcom GMT+1 London");
	        message.setFont( new Font(20) );

			
			Button clockStart = new Button(" Start the clock");
			componentGroup.getChildren().addAll(clockStart, text);
			componentGroup.setAlignment(Pos.CENTER);
			//root.getChildren().addAll(message, clockStart, text);
			
			clockStart.setOnAction(new EventHandler<ActionEvent>(){

				public void handle(ActionEvent event){
					
					Thread myThread = new Thread(new Runnable() {
						@Override
						public void run() {
									String conVertSeconds;
									String convertMinutes;
									String convertHour;
									String fullTime;
									while (true) {

										Calendar now= Calendar.getInstance();
										int hour = now.get(Calendar.HOUR_OF_DAY);
										final int minutes=now.get(Calendar.MINUTE);
										final int seconds = now.get(Calendar.SECOND);
										setTimeInHour(seconds);
										
										Platform.runLater( () ->
													text.setText("" +hour + " : "+ minutes +" : "+ seconds));
										conVertSeconds = "s = " + seconds;
										convertMinutes = "m = " + minutes;
										convertHour = "h = " + hour;
										fullTime = "time =" + hour +":"+ minutes +":"+ seconds;
										}

				//Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "Thread-6"

							 }
						
					});
					myThread.start();
									
				}});
			//text.setText(""+ seconds);

			Scene scene = new Scene(componentGroup, 400, 200);
			//root.setCenter(message);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//scene.setRoot(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		}
}
interface HourTime{
	
	public String hourTime();
	}
