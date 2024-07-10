package application;
	
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



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TextField text = new TextField();
			HBox componentGroup = new HBox();
			componentGroup.setSpacing(20);

			TextArea display = new TextArea();
			BorderPane root = new BorderPane();
			Label message = new Label("Welcom GMT+1 London");
	        message.setFont( new Font(20) );

			
			Button clockStart = new Button(" Start the clock");
			componentGroup.getChildren().addAll(clockStart);
			componentGroup.setAlignment(Pos.CENTER);
			root.getChildren().addAll(clockStart, display, text);
			Scene scene = new Scene(root, 400, 200);
			root.setCenter(message);
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
