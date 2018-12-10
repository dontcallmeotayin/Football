package application;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.Refree;

public class RefreePane extends HBox {
	private VBox data;
	
	public RefreePane(Refree rf) {
		
		super(10);
		setAlignment(Pos.CENTER_LEFT);
		setMinWidth(400);
		setMaxWidth(400);
		setStyle("-fx-background-color: #ffffff");
		
		Label name = new Label(rf.getName());
		name.setFont(new Font(30));
		name.setMinWidth(250);
		
		Label match = new Label("Matches");
		Text m = new Text(String.valueOf(rf.getMatches()));
			DetailsData d1 = new DetailsData(match,m);
		Label red = new Label("Red cards");
		Text r = new Text(String.valueOf(rf.getRed()));
			DetailsData d2 = new DetailsData(red,r);
		Label yel = new Label("Yellow cards");
		Text y = new Text(String.valueOf(rf.getYellow()));
			DetailsData d3 = new DetailsData(yel,y);
		data = new VBox();
		data.getChildren().addAll(d1,d2,d3);
		
		getChildren().addAll(name,data);
	}

}
