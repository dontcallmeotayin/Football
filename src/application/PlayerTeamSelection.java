package application;


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

public class PlayerTeamSelection extends VBox {
	
	private ImageView arsenal;
	private ImageView chelsea;
	private ImageView spur;
	private ImageView mancity;
	private ImageView manu;
	private ImageView liverpool;
	private ImageView home;
	
	public PlayerTeamSelection() {
		super(10);
		arsenal = new ImageView(new Image(ClassLoader.getSystemResource("ars00.png").toString()));
		arsenal.setFitHeight(100); 
		arsenal.setFitWidth(100);
		arsenal.setPreserveRatio(true);
		chelsea = new ImageView(new Image(ClassLoader.getSystemResource("che00.png").toString()));
		chelsea.setFitHeight(100); 
		chelsea.setFitWidth(100);
		chelsea.setPreserveRatio(true);
		spur = new ImageView(new Image(ClassLoader.getSystemResource("tot00.png").toString()));
		spur.setFitHeight(100); 
		spur.setFitWidth(100);
		spur.setPreserveRatio(true);
		mancity = new ImageView(new Image(ClassLoader.getSystemResource("mci00.png").toString()));
		mancity.setFitHeight(100); 
		mancity.setFitWidth(100);
		mancity.setPreserveRatio(true);
		manu = new ImageView(new Image(ClassLoader.getSystemResource("mun00.png").toString()));
		manu.setFitHeight(100); 
		manu.setFitWidth(100);
		manu.setPreserveRatio(true);
		liverpool = new ImageView(new Image(ClassLoader.getSystemResource("liv00.png").toString()));
		liverpool.setFitHeight(100); 
		liverpool.setFitWidth(100);
		liverpool.setPreserveRatio(true);
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(650);
		home.setLayoutY(610);
		
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(12));
		getChildren().addAll(arsenal,chelsea,spur,mancity,manu,liverpool,home);
		
		
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
