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
		
		int count = 0;
		
		Pane bg = new Pane();
		bg.setPrefSize(700, 675);
		bg.setStyle("-fx-background-color: #643D68;");		// same color with table class   ,  DARKSALMON >> so cute
		
		VBox blog = new VBox();
		for(Day day:days) {
			double d = day.getScaleY();
			double l = day.getLayoutY();
			day.setLayoutY(l+(d*count+5));
			bg.getChildren().addAll(day);
			count += 1;
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
		
		this.getChildren().addAll(bg,calendar, home, cal);
//		this.setStyle("-fx-background-color: #9273AD;");
		
	}
	
	public ImageView getGoHome() {
		return home;
	}

}