package application;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
		arsenal.setFitHeight(85); 
		arsenal.setFitWidth(85);
		arsenal.setPreserveRatio(true);
		arsenal.setOnMouseClicked(e->{
			ars.setVisible(true);
			che.setVisible(false);
			mci.setVisible(false);
			mun.setVisible(false);
			tot.setVisible(false);
			liv.setVisible(false);
		});
		chelsea = new ImageView(new Image(ClassLoader.getSystemResource("che00.png").toString()));
		chelsea.setFitHeight(85); 
		chelsea.setFitWidth(85);
		chelsea.setPreserveRatio(true);
		chelsea.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(true);
			mci.setVisible(false);
			mun.setVisible(false);
			tot.setVisible(false);
			liv.setVisible(false);
		});
		spur = new ImageView(new Image(ClassLoader.getSystemResource("tot00.png").toString()));
		spur.setFitHeight(85); 
		spur.setFitWidth(85);
		spur.setPreserveRatio(true);
		spur.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(false);
			mci.setVisible(false);
			mun.setVisible(false);
			tot.setVisible(true);
			liv.setVisible(false);
		});
		mancity = new ImageView(new Image(ClassLoader.getSystemResource("mci00.png").toString()));
		mancity.setFitHeight(85); 
		mancity.setFitWidth(85);
		mancity.setPreserveRatio(true);
		mancity.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(false);
			mci.setVisible(true);
			mun.setVisible(false);
			tot.setVisible(false);
			liv.setVisible(false);
		});
		manu = new ImageView(new Image(ClassLoader.getSystemResource("mun00.png").toString()));
		manu.setFitHeight(85); 
		manu.setFitWidth(85);
		manu.setPreserveRatio(true);
		manu.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(false);
			mci.setVisible(false);
			mun.setVisible(true);
			tot.setVisible(false);
			liv.setVisible(false);
		});
		liverpool = new ImageView(new Image(ClassLoader.getSystemResource("liv00.png").toString()));
		liverpool.setFitHeight(85); 
		liverpool.setFitWidth(85);
		liverpool.setPreserveRatio(true);
		liverpool.setOnMouseClicked(e->{
			ars.setVisible(false);
			che.setVisible(false);
			mci.setVisible(false);
			mun.setVisible(false);
			tot.setVisible(false);
			liv.setVisible(true);
		});
		
		Btn b = new Btn();
		home = b.getHome();

		VBox v = new VBox();
		v.getChildren().addAll(arsenal, chelsea, spur,manu, mancity, liverpool,home);
		v.setPrefSize(150, 675);
		v.setAlignment(Pos.TOP_CENTER);
		v.setSpacing(20);
						
		this.setPadding(new Insets(10));
		getChildren().addAll(v,pane);
		setStyle("-fx-background-color: #754A79;");
		
		
	}
	
	public ImageView getHome() {
		return home;
	}

}