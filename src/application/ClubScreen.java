package application;

import java.util.ArrayList;

import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import logic.Club;
import logic.Manager;
import logic.Player;

public class ClubScreen  extends Pane{
		
	private ImageView home;

	public ClubScreen() {
		
		for(Club club : clubs) {
			ClubPane pane = new ClubPane(club);
			getChildren().add(pane);
		}
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		
		this.getChildren().addAll(home);
		
	}

	public ImageView getGoHome() {
		return home;
	}
	
}
