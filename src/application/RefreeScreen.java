package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import logic.Refree;

public class RefreeScreen extends Pane{
	
	private ImageView home;

	public RefreeScreen(ArrayList<Refree> refree) {
				
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPrefSize(700, 675);
		
		VBox v = new VBox(5);
		v.setMinWidth(682);
		v.setMaxWidth(682);
		v.setAlignment(Pos.CENTER);
		v.setPadding(new Insets(20));
		v.setSpacing(10);
		v.setStyle("-fx-background-color: #643D68;");
		for(Refree rf:refree) {
			RefreePane pane = new RefreePane(rf);
			v.getChildren().add(pane);
		}
		
		scrollPane.setContent(v);
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(622);
		home.setLayoutY(615);
		
		getChildren().addAll(scrollPane, home);
	}
	
	public ImageView getHome() {
		return home;
	}

}
