package application;

import java.util.ArrayList;

import javafx.scene.layout.VBox;
import logic.Manager;

public class ManagerScreen extends VBox {
	
	public ManagerScreen(ArrayList<Manager> managers) {
		super(20);
		for(Manager mng:managers) {
			ManagerPane pane = new ManagerPane(mng);
			getChildren().add(pane);
		}
	}

}
