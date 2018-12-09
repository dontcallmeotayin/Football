package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.Stadium;

public class StadiumPane extends HBox {
	
	public StadiumPane(Stadium stadium) {
		
		setPrefWidth(500);
		setPrefHeight(100);
		setAlignment(Pos.CENTER_LEFT);
		setStyle("-fx-background-color: #F3F3F3;-fx-border-color : #636363");
		setPadding(new Insets(5,10,5,15));
		setSpacing(20);
		
		Label name = new Label(stadium.getName());
		name.setFont(new Font(25));
		name.setMinWidth(210);
		
		VBox h = new VBox();
		h.setPrefWidth(480);
		h.setSpacing(5);
		h.setPadding(new Insets(10));
		
		HBox v1 = new HBox(5);
		HBox v2 = new HBox(5);
		HBox v3 = new HBox(5);
		Label t = new Label("Team");
		t.setStyle("-fx-font-weight: bold,-fx-font-size 30");
		Label team = new Label(stadium.getTeam());
		v1.getChildren().addAll(t,team);
		v1.setPrefSize(5,50);
		v1.setAlignment(Pos.CENTER_LEFT);
		
		Label c = new Label("Capacity");
		c.setStyle("-fx-font-weight: bold,-fx-font-size 30");
		Label cap = new Label(String.valueOf(stadium.getCap()));
		v2.getChildren().addAll(c,cap);
		v2.setPrefSize(5,50);
		v2.setAlignment(Pos.CENTER_LEFT);
		
		Text address = new Text(stadium.getAddress());
		address.setStyle("-fx-font-size 20");
		v3.getChildren().addAll(address);
		v3.setPrefSize(5,350);
		v3.setAlignment(Pos.CENTER_LEFT);
		
		h.getChildren().addAll(v1,v2,v3);
		h.setAlignment(Pos.CENTER_LEFT);
		
		getChildren().addAll(name,h);
	}
}
