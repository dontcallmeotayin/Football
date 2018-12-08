package application;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Day extends VBox{
	private Label date;
	
	public Day(LocalDate date,ArrayList<MatchPane> matches) {
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		String day = ""+date.getDayOfMonth();
		String month = date.getMonth().name();
		String year = ""+date.getYear();
		this.date = new Label(day + " " + month + " " + year);
		getChildren().add(this.date);
		for(MatchPane pane:matches) {
			getChildren().add(pane);
		}
	}
}
