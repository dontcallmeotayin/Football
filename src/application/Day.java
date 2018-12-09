package application;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Day extends Pane{
	
	private Label date;
	
	public Day(LocalDate dateNow,ArrayList<MatchPane> matches) {
		
		Pane bg = new Pane();
		bg.setPrefSize(700, 675);
		bg.setStyle("-fx-background-color: #643D68;");		// same color with table class   ,  DARKSALMON >> so cute
		
		Pane pane = new Pane();
		pane.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		pane.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		pane.setPrefSize(640, 40);
		pane.setLayoutX(30);
		pane.setLayoutY(120);
		
		Pane pane2 = new Pane();
		pane2.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		pane2.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		pane2.setPrefSize(640, 80);
		pane2.setLayoutX(30);
		pane2.setLayoutY(159);
		
		String day = ""+dateNow.getDayOfMonth();
		
		String month = dateNow.getMonth().name();
		
		String year = ""+dateNow.getYear();
		
		date = new Label(day + " " + month + " " + year);
		date.setFont(new Font(20));
		date.setLayoutX(45);
		date.setLayoutY(127);
		date.setTextFill(Color.BLACK);
		
		bg.getChildren().addAll(pane, pane2, date);
		
		
		for(MatchPane panes:matches) {
			bg.getChildren().add(panes);
		}
	
		this.getChildren().add(bg);
		
	}
}
