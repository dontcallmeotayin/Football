package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Credit extends Pane {
	private Text data;
	private ImageView home;

	public Credit() {
		
		Pane pane = new Pane();
		pane.setStyle("-fx-background-color: #35073A;");
		pane.setPrefSize(750, 675);
		
		VBox v = new VBox();
		v.setAlignment(Pos.CENTER);
		
		data = new Text("PART OF PROGRAMMING METHODLOGY 1/2017 CHULALONGGONE\n"
					  + "DATA RESOURCES FROM WWW.PREMIERLEAGUE.COM\n\n"
					  + "BY\n"
					  + "6030079221\n"
					  + "BOONYAWEE KIATSILP 6031034121");
		data.setFont(new Font(20));
		data.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data.setLayoutX(40);
		data.setLayoutY(230);
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(600);
		home.setLayoutY(600);
		
		v.getChildren().add(data);
		pane.getChildren().addAll(data,home);
		
		getChildren().add(pane);
	}

	public ImageView getHome() {
		return home;
	}
}
