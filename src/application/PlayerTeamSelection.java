package application;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import logic.Player;

public class PlayerTeamSelection extends Pane {
	
	private ImageView arsenal;
	private ImageView chelsea;
	private ImageView spur;
	private ImageView mancity;
	private ImageView manu;
	private ImageView liverpool;
	private ImageView home;
	
	public PlayerTeamSelection() {
		
		StackPane pane = new StackPane();
		pane.setPrefWidth(550);
		pane.setStyle("-fx-background-color: #ffffff;");
		
		ArrayList<Player> a = (new Player("ARS")).makeList();
		ArrayList<Player> c = (new Player("CHE")).makeList();
		ArrayList<Player> mc = (new Player("MCI")).makeList();
		ArrayList<Player> mu = (new Player("MUN")).makeList();
		ArrayList<Player> s = (new Player("TOT")).makeList();
		ArrayList<Player> l = (new Player("LIV")).makeList();
		PlayerScreen ars = new PlayerScreen(a);
		PlayerScreen che = new PlayerScreen(c);
		PlayerScreen mci = new PlayerScreen(mc);
		PlayerScreen mun = new PlayerScreen(mu);
		PlayerScreen tot = new PlayerScreen(s);
		PlayerScreen liv = new PlayerScreen(l);
		
		pane.getChildren().addAll(ars,che,mci,mun,tot,liv);
		che.setVisible(false);
		mci.setVisible(false);
		mun.setVisible(false);
		tot.setVisible(false);
		liv.setVisible(false);

		arsenal = new ImageView(new Image(ClassLoader.getSystemResource("ars00.png").toString()));
		arsenal.setFitHeight(90); 
		arsenal.setFitWidth(90);
		arsenal.setPreserveRatio(true);
		arsenal.setOnMouseClicked(e->{
			ars.setVisible(true);
			che.setVisible(false);
			mci.setVisible(false);
			mun.setVisible(false);
			tot.setVisible(false);
			liv.setVisible(false);
		});
		arsenal.setOnMouseEntered(e->{
			setCursor(Cursor.HAND);
		});
		arsenal.setOnMouseExited(e->{
			setCursor(Cursor.DEFAULT);
		});
		
		chelsea = new ImageView(new Image(ClassLoader.getSystemResource("che00.png").toString()));
		chelsea.setFitHeight(90); 
		chelsea.setFitWidth(90);
		chelsea.setPreserveRatio(true);
		chelsea.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(true);
			mci.setVisible(false);
			mun.setVisible(false);
			tot.setVisible(false);
			liv.setVisible(false);
		});
		chelsea.setOnMouseEntered(e->{
			setCursor(Cursor.HAND);
		});
		chelsea.setOnMouseExited(e->{
			setCursor(Cursor.DEFAULT);
		});

		spur = new ImageView(new Image(ClassLoader.getSystemResource("tot00.png").toString()));
		spur.setFitHeight(90); 
		spur.setFitWidth(90);
		spur.setPreserveRatio(true);
		spur.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(false);
			mci.setVisible(false);
			mun.setVisible(false);
			tot.setVisible(true);
			liv.setVisible(false);
		});
		spur.setOnMouseEntered(e->{
			setCursor(Cursor.HAND);
		});
		spur.setOnMouseExited(e->{
			setCursor(Cursor.DEFAULT);
		});

		mancity = new ImageView(new Image(ClassLoader.getSystemResource("mci00.png").toString()));
		mancity.setFitHeight(90); 
		mancity.setFitWidth(90);
		mancity.setPreserveRatio(true);
		mancity.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(false);
			mci.setVisible(true);
			mun.setVisible(false);
			tot.setVisible(false);
			liv.setVisible(false);
		});
		mancity.setOnMouseEntered(e->{
			setCursor(Cursor.HAND);
		});
		mancity.setOnMouseExited(e->{
			setCursor(Cursor.DEFAULT);
		});
		manu = new ImageView(new Image(ClassLoader.getSystemResource("mun00.png").toString()));
		manu.setFitHeight(90); 
		manu.setFitWidth(90);
		manu.setPreserveRatio(true);
		manu.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(false);
			mci.setVisible(false);
			mun.setVisible(true);
			tot.setVisible(false);
			liv.setVisible(false);
		});
		manu.setOnMouseEntered(e->{
			setCursor(Cursor.HAND);
		});
		manu.setOnMouseExited(e->{
			setCursor(Cursor.DEFAULT);
		});

		liverpool = new ImageView(new Image(ClassLoader.getSystemResource("liv00.png").toString()));
		liverpool.setFitHeight(90); 
		liverpool.setFitWidth(90);
		liverpool.setPreserveRatio(true);
		liverpool.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(false);
			mci.setVisible(false);
			mun.setVisible(false);
			tot.setVisible(false);
			liv.setVisible(true);
		});
		liverpool.setOnMouseEntered(e->{
			setCursor(Cursor.HAND);
		});
		liverpool.setOnMouseExited(e->{
			setCursor(Cursor.DEFAULT);
		});

		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		home.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		home.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});

		
		HBox h =new HBox();
		
		VBox v = new VBox();
		v.getChildren().addAll(arsenal, chelsea, spur,manu, mancity, liverpool);
		v.setPrefSize(150, 675);
		v.setAlignment(Pos.TOP_CENTER);
		v.setSpacing(20);
		v.setPadding(new Insets(10));
						
		h.setPadding(new Insets(8,30,0,0));
		h.getChildren().addAll(v,pane);
		
		setStyle("-fx-background-color: #754A79;");
		getChildren().addAll(h,home);
		
		
	}
	
	public ImageView getHome() {
		return home;
	}

}