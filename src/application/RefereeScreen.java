package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import logic.Referee;

public class RefereeScreen extends Pane{
	
	private ImageView home;

	public RefereeScreen(ArrayList<Referee> refree) {
				
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPrefSize(700, 675);
		
		VBox v = new VBox(5);
		v.setMinWidth(682);
		v.setMaxWidth(682);
		v.setAlignment(Pos.CENTER);
		v.setPadding(new Insets(20));
		v.setSpacing(10);
		v.setStyle("-fx-background-color: #643D68;");
		for(Referee rf:refree) {
			RefereePane pane = new RefereePane(rf);
			v.getChildren().add(pane);
		}
		
		scrollPane.setContent(v);
		
		Menu b = new Menu();
		home = b.getHome();
		home.setLayoutX(622);
		home.setLayoutY(615);
		home.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		home.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});

		
		getChildren().addAll(scrollPane, home);
	}
	
	public ImageView getHome() {
		return home;
	}

}
