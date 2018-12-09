package application;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Calendar extends Pane {
	
	private ImageView home;
	private Label calendar;

	public Calendar(ArrayList<Day> days) {
		
		for(Day day:days) {
			this.getChildren().addAll(day);
		}
		
		calendar = new Label("CALENDAR");
		calendar.setFont(new Font(60));
		calendar.setLayoutX(100);
		calendar.setLayoutY(20);
		calendar.setTextFill(Color.WHITESMOKE);

		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(640);
		home.setLayoutY(10);
		
		this.getChildren().addAll(calendar, home);
//		this.setStyle("-fx-background-color: #9273AD;");
		
	}
	
	public ImageView getGoHome() {
		return home;
	}

}