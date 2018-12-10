package application;

import java.time.LocalDateTime;
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
	
	public Day(LocalDateTime dateNow,ArrayList<MatchPane> matches) {
		
		int count = matches.size();
		
		Pane bg = new Pane();
		bg.setPrefSize(682, 120);
//		bg.setStyle("-fx-background-color: #c2f442;");		// same color with table class   ,  DARKSALMON >> so cute
		
		// date
		Pane pane = new Pane();
		pane.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		pane.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		pane.setPrefSize(602, 65*count);
		pane.setLayoutX(30);
		pane.setLayoutY(10);
				
		// matches
		Pane pane2 = new Pane();
		pane2.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		pane2.setBackground(new Background(new BackgroundFill(Color.GHOSTWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		pane2.setPrefSize(602, (count*73));
		pane2.setLayoutX(30);
		pane2.setLayoutY(50);
		
		String day = ""+dateNow.getDayOfMonth();
		String month = dateNow.getMonth().name();
		String year = ""+dateNow.getYear();
		
		date = new Label(day + " " + month + " " + year);
		date.setFont(new Font(20));
		date.setLayoutX(45);
		date.setLayoutY(17);
		date.setTextFill(Color.BLACK);
		
		bg.getChildren().addAll(pane, pane2, date);
		
		VBox blog = new VBox();
		for(MatchPane panes:matches) {
			blog.getChildren().add(panes);
		}
		blog.setSpacing(7);
		blog.setPrefWidth(640);
		blog.setLayoutX(30);
		blog.setLayoutY(60);
		bg.getChildren().add(blog);
	
		this.getChildren().add(bg);
		
	}
}
