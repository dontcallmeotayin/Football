package application;

import java.util.ArrayList;


import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import logic.Club;
import logic.Manager;
import logic.Player;

public class ClubPane extends VBox {

	public ClubPane(Club club) {
		ImageView image = new ImageView(club.getImage());
		Label name = new Label(club.getName());
		Label stadium = new Label(club.getStadium().getName());
		VBox text = new VBox();
		text.getChildren().addAll(name,stadium);
		getChildren().addAll(image,text);
		
	}
}
