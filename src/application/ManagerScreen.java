package application;

import java.util.ArrayList;


import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import logic.Manager;

public class ManagerScreen extends Pane {
	
	public ManagerScreen(ArrayList<Manager> managers) {
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPrefSize(700, 675);

		VBox vpane = new VBox();

		for(Manager mng:managers) {
			ManagerPane pane = new ManagerPane(mng);
			vpane.getChildren().add(pane);
		}
		scrollPane.setContent(vpane);
		getChildren().add(scrollPane);
	}

}
