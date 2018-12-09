package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
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
	private Text data8;
	private Text data9;

	public Credit() {
		
		Pane p = new Pane();
		p.setPrefSize(750, 675);
		
		HBox pane = new HBox();
		pane.setStyle("-fx-background-color: #643D68;");
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
		data2 = new Text("1/2017 CHULALONGKORN\n");
		set(data2,15);
		v1.getChildren().addAll(data, data2);
		
		VBox v2 = new VBox();
		v2.setAlignment(Pos.CENTER);
		v2.setSpacing(10);
		data3 = new Text("DATA RESOURCES");
		data4 = new Text("WWW.PREMIERLEAGUE.COM\n");
		data5 = new Text("BY");
		set(data3,15);set(data4,13);set(data5,15);
		v2.getChildren().addAll(data3, data4, data5);
		
		HBox h = new HBox();
		h.setSpacing(50);
		h.setPadding(new Insets(0, 0, 0, 115));
		h.setAlignment(Pos.CENTER);
		
		VBox vv = new VBox();
		data6 = new Text("6030079221");
		data7 = new Text("6031034121");
		set(data6,13);set(data7,13);
		vv.setAlignment(Pos.CENTER_RIGHT);
		vv.getChildren().addAll(data6, data7);
		
		VBox vvv = new VBox();
		data8 = new Text("JINWARA   JANEJANEPRASERT");
		data9 = new Text("BOONYAWEE   KIATSILP");
		set(data8,13);set(data9,13);
		vvv.setAlignment(Pos.CENTER_LEFT);
		vvv.getChildren().addAll(data8, data9);
		
		h.getChildren().addAll(vv,vvv);
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		
		v.getChildren().addAll(v1,v2,h);
		pane.getChildren().addAll(v);
		
		p.getChildren().addAll(pane,home);
		
		getChildren().add(p);
	}

	public ImageView getHome() {
		return home;
	}
	
	public void set(Text dat, int inte) {
		dat.setFont(new Font(inte));
		dat.setFill(javafx.scene.paint.Color.WHITESMOKE);
	}
}
