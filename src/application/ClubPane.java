package application;

import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import logic.Club;
import logic.Manager;
import logic.Player;

public class ClubPane extends HBox {

	private ImageView stad;

	public ClubPane(Club club) {
		
		ImageView image = new ImageView(club.getImage());
		image.setFitHeight(120);
		image.setFitWidth(120);
		
		Label name = new Label(club.getName());
		Label stadium = new Label("          "+club.getStadium().getName());
		name.setTextFill(Color.WHITESMOKE);
		stadium.setTextFill(Color.WHITESMOKE);
		name.setFont(Font.font("", FontWeight.BOLD, 15));
		
		VBox text = new VBox();
		text.getChildren().addAll(name,stadium);
		text.setSpacing(10);
		
		getChildren().addAll(image,text);
		setSpacing(15);
		
	}
}
