package application;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import logic.Player;

public class PlayerScreen extends VBox{
	private PersonalDetails details;
	private VBox record;
	
	public PlayerScreen(Player player) {
		details = new PersonalDetails(player);
		
		record = new VBox();
		Label label = new Label("Premier League Record");
		Label ap = new Label("Appearances");
		Label g = new Label("Goals");
		Label as = new Label("Assists");		
		Label c = new Label("Clean sheets");
		String appear = "" + player.getAppearance();
		String goal = "" + player.getGoals();
		String assist = "" + player.getAssists();
		String clean = "" + player.getCleansheets();
		DetailsData d1 = new DetailsData(ap, new Text(appear));
		DetailsData d2 = new DetailsData(g, new Text(goal));
		DetailsData d3 = new DetailsData(as, new Text(assist));
		DetailsData d4 = new DetailsData(c, new Text(clean));
		record.getChildren().addAll(label,d1,d2,d3,d4);
	}
}
