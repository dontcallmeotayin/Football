package application;

import java.util.ArrayList;

import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Calendar extends VBox {
	
	public Calendar(ArrayList<Day> days) {
		for(Day day:days) {
			getChildren().addAll(day);
		}
	}

	public ImageView getGoHome() {
		// TODO Auto-generated method stub
		return null;
	}
}
