package application;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class DetailsData extends HBox{
	public DetailsData(Label l,Text t) {
		getChildren().addAll(l,t);
	}
}
