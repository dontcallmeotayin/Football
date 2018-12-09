package application;

import java.util.ArrayList;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import logic.Club;
import logic.Player;
import logic.PremierLeagueLogic;

public class ClubScreen  extends Pane{
		
	public ClubScreen() {
		// for adding clubpanes
		PremierLeagueLogic logic = new PremierLeagueLogic();
		ArrayList<Club> clubs = logic.getClubs();
		ClubPane club1 = new ClubPane(clubs.get(0));
		ClubPane club2 = new ClubPane(clubs.get(1));
		ClubPane club3 = new ClubPane(clubs.get(2));
		ClubPane club4 = new ClubPane(clubs.get(3));
		ClubPane club5 = new ClubPane(clubs.get(4));
		ClubPane club6 = new ClubPane(clubs.get(5));
		
		// if wanna put more than image,name,stadium into each clubpane
		// just create here
		// ex: club1.getChildren().add(something)
		
		getChildren().addAll(club1,club2,club3,club4,club5,club6);

	}

}
