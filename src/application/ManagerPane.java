package application;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.Manager;
import logic.Person;

public class ManagerPane extends VBox{
	private HBox head;
	
	public ManagerPane(Manager mng) {
		ImageView club = new ImageView(new Image(ClassLoader.getSystemResource("ars0m.png").toString()));
		club.setFitHeight(50); 
		club.setFitWidth(50);
		club.setPreserveRatio(true);
		ImageView img = new ImageView(mng.getImage());
		img.setFitHeight(150); 
		img.setFitWidth(150);
		img.setPreserveRatio(true);
		Label name = new Label(mng.getName());
		name.setFont(new Font(30));
		head = new HBox(30);
		head.setAlignment(Pos.CENTER_LEFT);
		head.setMinWidth(650);
		head.setPrefHeight(200);
		head.getChildren().addAll(club,img,name);
		head.setStyle("-fx-background-color: #ffffff");
	}
}
