package application;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import logic.Player;

public class PlayerScreen extends VBox{
	
	public PlayerScreen(ArrayList<Player> players) {
		super(20);
		for(Player player:players) {
			PlayerPane pane = new PlayerPane(player);
			getChildren().add(pane);
		}
	}
}
