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
	private HBox head;
	private VBox data;

	public ClubPane(Club club) {
		ImageView image = new ImageView(club.getImage());
		Label name = new Label(club.getName());
		Label stadium = new Label(club.getStadium().getName());
		VBox text = new VBox();
		text.getChildren().addAll(name,stadium);
		head.getChildren().addAll(image,text);
		
		Manager mng = club.getManager();
		ImageView mngImage = new ImageView(mng.getImage());
		Label mngName = new Label(mng.getName());
		HBox manager = new HBox();
		manager.getChildren().addAll(mngImage,mngName);
		
		data.getChildren().add(manager);
		
		ArrayList<logic.Player> players = club.getPlayers();
		for(Player p:players) {
			ImageView img = new ImageView(p.getImage());
			Label no = new Label(String.valueOf(p.getNumber()));
			Label n = new Label(p.getName());
			HBox player = new HBox();
			player.getChildren().addAll(img,no,n);
			data.getChildren().add(player);
		}
	}
}
