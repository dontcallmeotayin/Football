package application;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import logic.Stadium;

public class StadiumScreen extends Pane {
	private ImageView home;
	
	public StadiumScreen(ArrayList<Stadium> stArrayList) {
	
	Pane bg = new Pane();
	bg.setPrefSize(700, 675);
	bg.setStyle("-fx-background-color: #643D68;");
	
	VBox vpane = new VBox();
	vpane.setPrefSize(700, 675);
	vpane.setAlignment(Pos.TOP_CENTER);
	vpane.setPadding(new Insets(20, 30, 0, 30));
	vpane.setSpacing(5);

	for(Stadium std:stArrayList) {
		StadiumPane pane = new StadiumPane(std);
		vpane.getChildren().add(pane);
	}
	
	Btn b = new Btn();
	home = b.getHome();
	home.setLayoutX(635);
	home.setLayoutY(610);
	
	getChildren().addAll(bg,vpane,home);
}

public ImageView getHome() {
	return home;
}

}
