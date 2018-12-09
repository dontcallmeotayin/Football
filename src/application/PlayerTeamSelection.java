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

public class PlayerTeamSelection extends Pane {
	
	private ImageView arsenal;
	private ImageView chelsea;
	private ImageView spur;
	private ImageView mancity;
	private ImageView manu;
	private ImageView liverpool;
	private ImageView home;
	
	public PlayerTeamSelection() {

		arsenal = new ImageView(new Image(ClassLoader.getSystemResource("ars00.png").toString()));
		arsenal.setFitHeight(120); 
		arsenal.setFitWidth(120);
		arsenal.setPreserveRatio(true);
		chelsea = new ImageView(new Image(ClassLoader.getSystemResource("che00.png").toString()));
		chelsea.setFitHeight(120); 
		chelsea.setFitWidth(120);
		chelsea.setPreserveRatio(true);
		spur = new ImageView(new Image(ClassLoader.getSystemResource("tot00.png").toString()));
		spur.setFitHeight(120); 
		spur.setFitWidth(120);
		spur.setPreserveRatio(true);
		mancity = new ImageView(new Image(ClassLoader.getSystemResource("mci00.png").toString()));
		mancity.setFitHeight(120); 
		mancity.setFitWidth(120);
		mancity.setPreserveRatio(true);
		manu = new ImageView(new Image(ClassLoader.getSystemResource("mun00.png").toString()));
		manu.setFitHeight(120); 
		manu.setFitWidth(120);
		manu.setPreserveRatio(true);
		liverpool = new ImageView(new Image(ClassLoader.getSystemResource("liv00.png").toString()));
		liverpool.setFitHeight(120); 
		liverpool.setFitWidth(120);
		liverpool.setPreserveRatio(true);
		
		HBox h = new HBox();
		h.getChildren().addAll(arsenal, chelsea, spur);
		h.setAlignment(Pos.CENTER);
		h.setPrefWidth(700);
		h.setSpacing(100);
		
		HBox h2 = new HBox();
		h2.getChildren().addAll(manu, mancity, liverpool);
		h2.setAlignment(Pos.CENTER);
		h2.setPrefWidth(700);
		h2.setSpacing(100);
		
		VBox v = new VBox();
		v.getChildren().addAll(h, h2);
		v.setPrefSize(700, 675);
		v.setAlignment(Pos.TOP_CENTER);
		v.setSpacing(90);
		v.setPadding(new Insets(150,0,0,0));
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		
		this.setPadding(new Insets(10));
		getChildren().addAll(v,home);
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