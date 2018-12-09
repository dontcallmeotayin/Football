package application;

import java.util.ArrayList;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import logic.Player;

public class PlayerScreen extends Pane{
	
	public PlayerScreen(ArrayList<Player> players) {
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPrefSize(700, 675);
		
		TilePane tpane = new TilePane();

		for(Player player:players) {
			PlayerPane pane = new PlayerPane(player);
			tpane.getChildren().add(pane);
		}
		
		scrollPane.setContent(tpane);
		getChildren().add(scrollPane);
	}
}
