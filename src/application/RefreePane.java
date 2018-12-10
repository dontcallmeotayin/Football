package application;

import javafx.geometry.Insets;
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
		setAlignment(Pos.CENTER);
		setMinSize(520, 70);
		setMaxSize(520, 70);
		setStyle("-fx-background-color: #F3F3F3;");
		
		Label name = new Label(rf.getName());
		name.setFont(new Font(27));
		name.setMinWidth(250);
		
		Label match = new Label("Matches			");
		match.setFont(new Font(13));
		Text m = new Text(String.valueOf(rf.getMatches()));
			DetailsData d1 = new DetailsData(match,m);
		Label red = new Label("Red cards			");
		red.setFont(new Font(13));
		Text r = new Text(String.valueOf(rf.getRed()));
			DetailsData d2 = new DetailsData(red,r);
		Label yel = new Label("Yellow cards		");
		yel.setFont(new Font(13));
		Text y = new Text(String.valueOf(rf.getYellow()));
			DetailsData d3 = new DetailsData(yel,y);
			
		data = new VBox();
		data.getChildren().addAll(d1,d2,d3);
		
		getChildren().addAll(name,data);
		setSpacing(10);
		setPadding(new Insets(10));
	}

}
