package application;

import java.util.ArrayList;


import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import logic.Player;

public class PlayerScreen extends Pane{
	
	private TilePane tpane;
	
	public PlayerScreen(ArrayList<Player> players) {
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPrefSize(540, 675);
		
		tpane = new TilePane();
		tpane.setPrefColumns(1);
		tpane.setPadding(new Insets(1));
		tpane.setStyle("-fx-background-color: #643D68;");

		for(Player player:players) {
			PlayerPane pane = new PlayerPane(player);
			tpane.getChildren().add(pane);
		}
		
		scrollPane.setContent(tpane);
		getChildren().addAll(scrollPane);
		setPadding(new Insets(5));

	}
	
}
