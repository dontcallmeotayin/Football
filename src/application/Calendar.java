package application;

import java.util.ArrayList;

import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Calendar extends VBox {
	
	private ImageView home;

	public Calendar(ArrayList<Day> days) {
		
		for(Day day:days) {
			getChildren().addAll(day);
		}
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(615);
		home.setLayoutY(2210);
		
		this.getChildren().add(home);
	}
	
	public ImageView getGoHome() {
		return home;
	}
	
}
