package application;

import java.util.ArrayList;

import javafx.scene.layout.VBox;
import logic.Manager;
import logic.Refree;

public class RefreeScreen extends VBox{
	
	public RefreeScreen(ArrayList<Refree> refree) {
		super(20);
		for(Refree rf:refree) {
			RefreePane pane = new RefreePane(rf);
			getChildren().add(pane);
		}
	}


}
