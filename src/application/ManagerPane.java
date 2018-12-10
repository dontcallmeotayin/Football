package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import logic.Manager;

public class ManagerPane extends HBox{
	
	public ManagerPane(Manager mng) {
		super(10);
		
		setPrefWidth(500);
		setPrefHeight(100);
		setAlignment(Pos.CENTER_LEFT);
		setStyle("-fx-background-color: #F3F3F3;-fx-border-color : #636363");
		setPadding(new Insets(5,20,5,20));
		setSpacing(20);

		ImageView club = new ImageView(new Image(ClassLoader.getSystemResource(mng.getTeam().toLowerCase()+"00.png").toString()));
		club.setFitHeight(45); 
		club.setFitWidth(45);
		club.setPreserveRatio(true);
		
		ImageView img = new ImageView(mng.getImage());
		img.setFitHeight(80); 
		img.setFitWidth(80);
		img.setPreserveRatio(true);
		
		Label name = new Label(mng.getName());
		name.setFont(new Font(22));
		name.setMinWidth(200);
		
		Label seasonl = new Label("Seasons");
		Label seasonv = new Label(String.valueOf(mng.getSeasons()));
		seasonl.setFont(new Font(15));
		seasonv.setFont(new Font(15));
		
		VBox season = new VBox(); 
		season.setAlignment(Pos.CENTER);
		season.getChildren().addAll(seasonl,seasonv);
		
		getChildren().addAll(club,img,name,season);
	}
}
