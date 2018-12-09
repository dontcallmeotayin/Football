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

public class ManagerPane extends HBox{
	
	public ManagerPane(Manager mng) {
		super(10);
		setAlignment(Pos.CENTER_LEFT);
		setMinWidth(350);
		setMaxWidth(350);
		setPrefHeight(100);
		setStyle("-fx-background-color: #ffffff;-fx-border-color : #000000");			

		ImageView club = new ImageView(new Image(ClassLoader.getSystemResource(mng.getTeam().toLowerCase()+"00.png").toString()));
		club.setFitHeight(20); 
		club.setFitWidth(20);
		club.setPreserveRatio(true);
		ImageView img = new ImageView(mng.getImage());
		img.setFitHeight(70); 
		img.setFitWidth(70);
		img.setPreserveRatio(true);
		Label name = new Label(mng.getName());
		name.setFont(new Font(20));
		
		getChildren().addAll(club,img,name);
	}
}
