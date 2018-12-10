package application;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
		
		Menu b = new Menu();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		home.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		home.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		getChildren().addAll(bg, vpane, home);
	}
	
	public ImageView getGoHome() {
		return home;
	}

}
