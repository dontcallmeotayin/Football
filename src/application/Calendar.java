package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Calendar extends Pane {
	
	private ImageView home;
	private Label calendar;
	private ImageView cal;

	public Calendar(ArrayList<Day> days) {
		
		int size = days.size();
		
		ScrollPane bg = new ScrollPane();
		bg.setPrefSize(700, 675);
		bg.setStyle("-fx-background-color: #643D68;");		// same color with table class   ,  DARKSALMON >> so cute
				
		calendar = new Label("CALENDAR");
		calendar.setFont(new Font(60));
		calendar.setTextFill(Color.WHITESMOKE);
		
		cal = new ImageView(new Image(ClassLoader.getSystemResource("calendar2.png").toString()));
		cal.setFitHeight(50);
		cal.setFitWidth(50);
		
		HBox h = new HBox(20);
		h.getChildren().addAll(cal,calendar);
		h.setPrefHeight(50);
		h.setPadding(new Insets(10));
		h.setAlignment(Pos.CENTER);

		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		
		VBox v = new VBox(5);
		v.setPrefHeight(500+(size*150));
		v.setStyle("-fx-background-color: #643D68;");
//		v.getChildren().addAll(h);
		
		for(Day day:days) {
			v.getChildren().addAll(day);
		}
		bg.setContent(v);
				
		this.getChildren().addAll(bg,home);

		
	}
	
	public ImageView getGoHome() {
		return home;
	}

}