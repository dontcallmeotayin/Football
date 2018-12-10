package application;

import javafx.geometry.Insets;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import logic.Player;

public class PlayerPane extends HBox{
		
	public PlayerPane(Player p) {
		super(10);
		setAlignment(Pos.CENTER_LEFT);
		setMinWidth(540);
		setMaxWidth(540);
		setPrefHeight(100);
		setStyle("-fx-background-color: #f5f5f5;-fx-border-color : #9e9e9e");
		setPadding(new Insets(10));
		
		ImageView club = new ImageView(p.getTeam()+"00.png");
		club.setFitHeight(20); 
		club.setFitWidth(20);
		club.setPreserveRatio(true);
		ImageView img = new ImageView(p.getImage());
		img.setFitHeight(70); 
		img.setFitWidth(70);
		img.setPreserveRatio(true);
		Label number = new Label(String.valueOf(p.getNumber()));
		number.setFont(new Font(20));
		Label name = new Label(p.getName());
		name.setFont(new Font(15));
		getChildren().addAll(club,img,number,name);
	}
}
