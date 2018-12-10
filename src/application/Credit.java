package application;

import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Credit extends Pane {
	
	private ImageView home;
	private Text data;
	private Text data2;
	private Text data3;
	private Text data4;
	private Text data5;
	private Text data6;
	private Text data7;

	public Credit() {
		
		HBox pane = new HBox();
		pane.setPrefSize(700, 675);
		pane.setAlignment(Pos.CENTER);
		
		VBox v = new VBox();
		v.setAlignment(Pos.CENTER);
		v.setSpacing(10);
		
		VBox v1 = new VBox();
		v1.setAlignment(Pos.CENTER);
		v1.setSpacing(10);
		data = new Text("PART OF PROGRAMMING METHODLOGY\n");
		set(data,17);
		data.setLayoutX(40);
		data.setLayoutY(230);
		data2 = new Text("1/2017 FACULTY OF ENGINEERING, CHULALONGKORN UNIVERSITY\n");
		set(data2,15);
		v1.getChildren().addAll(data, data2);
		
		VBox v2 = new VBox();
		v2.setAlignment(Pos.CENTER);
		v2.setSpacing(10);
		data3 = new Text("DATA RESOURCES");
		data4 = new Text("WWW.PREMIERLEAGUE.COM\n");
		data5 = new Text("BY");
		data6 = new Text("6030079221 JINWARA JANEJANEPRASERT");
		data7 = new Text("6031034121 BOONYAWEE KIATSILP");
		set(data3,15);set(data4,13);set(data5,15);
		set(data6,12);set(data7,12);
		v2.getChildren().addAll(data3, data4, data5,data6,data7);
				
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		
		v.getChildren().addAll(v1,v2);
		v.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(v);
		
		getChildren().addAll(pane,home);
		setStyle("-fx-background-color: #643D68;");
	}

	public ImageView getGoHome() {
		return home;
	}
	
	public void set(Text dat, int inte) {
		dat.setFont(new Font(inte));
		dat.setFill(javafx.scene.paint.Color.WHITESMOKE);
	}
}
