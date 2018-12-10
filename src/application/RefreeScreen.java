package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import logic.Refree;

public class RefreeScreen extends Pane{
	
	public RefreeScreen(ArrayList<Refree> refree) {
				
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPrefSize(700, 675);
		
		VBox v = new VBox(5);
		v.setMinWidth(400);
		v.setMaxWidth(400);
		v.setAlignment(Pos.CENTER);
		v.setStyle("-fx-background-color: #643D68;");
		for(Refree rf:refree) {
			RefreePane pane = new RefreePane(rf);
			v.getChildren().add(pane);
		}
		
		scrollPane.setContent(v);
		v.setLayoutX(175);
		getChildren().addAll(scrollPane);
		setPadding(new Insets(5));
	}


}
