package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import logic.Manager;

public class ManagerScreen extends Pane {
	
	private ImageView home;

	public ManagerScreen(ArrayList<Manager> managers) {
		
		Pane bg = new Pane();
		bg.setPrefSize(700, 675);
		bg.setStyle("-fx-background-color: #643D68;");
		
		VBox vpane = new VBox();
		vpane.setPrefSize(600, 675);
		vpane.setAlignment(Pos.TOP_CENTER);
		vpane.setPadding(new Insets(20, 0, 0, 100));
		vpane.setSpacing(5);
		for(Manager mng:managers) {
			ManagerPane pane = new ManagerPane(mng);
			vpane.getChildren().add(pane);
		}
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		
		getChildren().addAll(bg, vpane, home);
	}
	
	public ImageView getGoHome() {
		return home;
	}

}
