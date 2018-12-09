package application;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Calendar extends Pane {
	
	private ImageView home;
	private Label calendar;
	private ImageView cal;

	public Calendar(ArrayList<Day> days) {
		
		for(Day day:days) {
			this.getChildren().addAll(day);
		}
		
		calendar = new Label("CALENDAR");
		calendar.setFont(new Font(60));
		calendar.setLayoutX(165);
		calendar.setLayoutY(20);
		calendar.setTextFill(Color.WHITESMOKE);
		
		cal = new ImageView(new Image(ClassLoader.getSystemResource("calendar2.png").toString()));
		cal.setFitHeight(50);
		cal.setFitWidth(50);
		cal.setLayoutX(95);
		cal.setLayoutY(31);

		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		
		this.getChildren().addAll(calendar, home, cal);
//		this.setStyle("-fx-background-color: #9273AD;");
		
	}
	
	public ImageView getGoHome() {
		return home;
	}

}