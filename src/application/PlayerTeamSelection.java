package application;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import logic.Player;

public class PlayerTeamSelection extends HBox {
	
	private ImageView arsenal;
	private ImageView chelsea;
	private ImageView spur;
	private ImageView mancity;
	private ImageView manu;
	private ImageView liverpool;
	private ImageView home;
	
	public PlayerTeamSelection() {

		arsenal = new ImageView(new Image(ClassLoader.getSystemResource("ars00.png").toString()));
		arsenal.setFitHeight(85); 
		arsenal.setFitWidth(85);
		arsenal.setPreserveRatio(true);
		chelsea = new ImageView(new Image(ClassLoader.getSystemResource("che00.png").toString()));
		chelsea.setFitHeight(85); 
		chelsea.setFitWidth(85);
		chelsea.setPreserveRatio(true);
		spur = new ImageView(new Image(ClassLoader.getSystemResource("tot00.png").toString()));
		spur.setFitHeight(85); 
		spur.setFitWidth(85);
		spur.setPreserveRatio(true);
		mancity = new ImageView(new Image(ClassLoader.getSystemResource("mci00.png").toString()));
		mancity.setFitHeight(85); 
		mancity.setFitWidth(85);
		mancity.setPreserveRatio(true);
		manu = new ImageView(new Image(ClassLoader.getSystemResource("mun00.png").toString()));
		manu.setFitHeight(85); 
		manu.setFitWidth(85);
		manu.setPreserveRatio(true);
		liverpool = new ImageView(new Image(ClassLoader.getSystemResource("liv00.png").toString()));
		liverpool.setFitHeight(85); 
		liverpool.setFitWidth(85);
		liverpool.setPreserveRatio(true);
		
		Btn b = new Btn();
		home = b.getHome();

		VBox v = new VBox();
		v.getChildren().addAll(arsenal, chelsea, spur,manu, mancity, liverpool,home);
		v.setPrefSize(150, 675);
		v.setAlignment(Pos.TOP_CENTER);
		v.setSpacing(20);
				
		this.setPadding(new Insets(10));
		getChildren().addAll(v);
		setStyle("-fx-background-color: #754A79;");
		
	}

	public ImageView getArsenal() {
		return arsenal;
	}

	public ImageView getChelsea() {
		return chelsea;
	}

	public ImageView getSpur() {
		return spur;
	}

	public ImageView getMancity() {
		return mancity;
	}

	public ImageView getManu() {
		return manu;
	}

	public ImageView getLiverpool() {
		return liverpool;
	}
	
	public ImageView getHome() {
		return home;
	}

}