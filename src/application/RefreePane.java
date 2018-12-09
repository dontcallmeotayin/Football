package application;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.Person;
import logic.Refree;

public class RefreePane extends VBox {
	private HBox head;
	private VBox data;
	
	public RefreePane(Refree rf) {
		Label name = new Label(rf.getName());
		name.setFont(new Font(30));
		head = new HBox(30);
		head.setAlignment(Pos.CENTER_LEFT);
		head.setMinWidth(650);
		head.setPrefHeight(200);
		head.setStyle("-fx-background-color: #ffffff");
		Label match = new Label("Matches");
		Text m = new Text(String.valueOf(rf.getMatches()));
		DetailsData d1 = new DetailsData(match,m);
		Label red = new Label("Red cards");
		Text r = new Text(String.valueOf(rf.getRed()));
		DetailsData d2 = new DetailsData(red,r);
		Label yel = new Label("Yellow cards");
		Text y = new Text(String.valueOf(rf.getYellow()));
		DetailsData d3 = new DetailsData(yel,y);
		data.getChildren().addAll(d1,d2,d3);
		head.getChildren().addAll(name,data);
		getChildren().add(head);
	}

}
