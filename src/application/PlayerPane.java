package application;

import javafx.geometry.Insets;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import logic.Player;

public class PlayerPane extends HBox{
		
	public PlayerPane(Player p) {
		super(10);
		setAlignment(Pos.CENTER_LEFT);
		setMinWidth(521);
		setMaxWidth(521);
		setPrefHeight(100);
		setStyle("-fx-background-color: #f5f5f5;-fx-border-color : #9e9e9e");
		setPadding(new Insets(12));

		ImageView club = new ImageView(new Image(ClassLoader.getSystemResource(p.getTeam().toLowerCase()+"00.png").toString()));
		club.setFitHeight(25); 
		club.setFitWidth(25);
		club.setPreserveRatio(true);
		ImageView img = new ImageView(p.getImage());
		img.setFitHeight(73); 
		img.setFitWidth(73);
		img.setPreserveRatio(true);
		Label number = new Label(String.valueOf(p.getNumber()));
		number.setFont(new Font(20));
		Label name = new Label(p.getName());
		name.setFont(new Font(15));
		getChildren().addAll(club,img,number,name);
	}
}
