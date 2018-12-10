package application;

import java.awt.Desktop;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import logic.Club;
import logic.PremierLeagueLogic;

public class ClubScreen  extends Pane{
		
	private String house;
	private ImageView stad;
	private ImageView stad2;
	private ImageView stad3;
	private ImageView stad4;
	private ImageView stad5;
	private ImageView stad6;
	private String fb;
	private String twt;
	private String you;
	private String ig;
	private ImageView home;

	public ClubScreen() {
		// for adding clubpanes

		PremierLeagueLogic logic = new PremierLeagueLogic();
		ArrayList<Club> clubs = logic.getClubs();
		ClubPane club1 = new ClubPane(clubs.get(0));
		ClubPane club2 = new ClubPane(clubs.get(1));
		ClubPane club3 = new ClubPane(clubs.get(2));
		ClubPane club4 = new ClubPane(clubs.get(3));
		ClubPane club5 = new ClubPane(clubs.get(4));
		ClubPane club6 = new ClubPane(clubs.get(5));
		
		// if wanna put more than image,name,stadium into each clubpane
		// just create here
		// ex: club1.getChildren().add(something)
		
		HBox h = new HBox();
		h.getChildren().addAll(club1,club2);
		h.setAlignment(Pos.CENTER_LEFT);
		h.setPadding(new Insets(0,0,0,30));
		h.setSpacing(50);
		
		HBox h2 = new HBox();
		h2.getChildren().addAll(club3,club4);
		h2.setAlignment(Pos.CENTER_LEFT);
		h2.setPadding(new Insets(0,0,0,30));
		h2.setSpacing(80);
		
		HBox h3 = new HBox();
		h3.getChildren().addAll(club5,club6);
		h3.setAlignment(Pos.CENTER_LEFT);
		h3.setPadding(new Insets(0,0,0,30));
		h3.setSpacing(50);
		
		VBox v = new VBox();
		v.getChildren().addAll(h,h2,h3);
		v.setPrefSize(700, 675);
		v.setAlignment(Pos.CENTER);
		v.setSpacing(70);
		
		Pane p = new Pane();
		stad = new ImageView(new Image(ClassLoader.getSystemResource("stad.png").toString()));
		setFit(stad,20);
		setLayoutXY(stad,172,115);
		stad2 = new ImageView(new Image(ClassLoader.getSystemResource("stad.png").toString()));
		setFit(stad2,20);
		setLayoutXY(stad2,502,115);
		stad3 = new ImageView(new Image(ClassLoader.getSystemResource("stad.png").toString()));
		setFit(stad3,20);
		setLayoutXY(stad3,174,305);
		stad4 = new ImageView(new Image(ClassLoader.getSystemResource("stad.png").toString()));
		setFit(stad4,20);
		setLayoutXY(stad4,469,305);
		stad5 = new ImageView(new Image(ClassLoader.getSystemResource("stad.png").toString()));
		setFit(stad5,20);
		setLayoutXY(stad5,174,495);
		stad6 = new ImageView(new Image(ClassLoader.getSystemResource("stad.png").toString()));
		setFit(stad6,20);
		setLayoutXY(stad6,493,495);
		
		house = "icon.png";
		Hyperlink home1 = goHome(house, "www.arsenal.com", "https://www.arsenal.com/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(home1,167,140);
		Hyperlink home2 = goHome(house, "www.mancity.com", "http://www.mancity.com/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(home2,497,140);
		Hyperlink home3 = goHome(house, "www.liverpoolfc.com", "http://www.liverpoolfc.com/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(home3,168,330);
		Hyperlink home4 = goHome(house, "www.tottenhamhotspur.com", "http://www.tottenhamhotspur.com/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(home4,464,330);
		Hyperlink home5 = goHome(house, "www.manutd.com", "http://www.manutd.com/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(home5,168,520);
		Hyperlink home6 = goHome(house, "www.chelseafc.com", "https://www.chelseafc.com/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(home6,488,520);
		
		fb = "fb.png";
		twt = "twt.png"; 
		you = "yb.png";
		ig = "ig.png";
		
		Hyperlink FB1 = goBrowser(fb, "https://www.facebook.com/arsenal/");
		setLinkLayoutXY(FB1,165,170);
		Hyperlink FB2 = goBrowser(fb, "http://www.facebook.com/mancity/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(FB2,495,170);
		Hyperlink FB3 = goBrowser(fb, "https://www.facebook.com/LiverpoolFC/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(FB3,166,360);
		Hyperlink FB4 = goBrowser(fb, "https://www.facebook.com/TottenhamHotspur/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(FB4,462,360);
		Hyperlink FB5 = goBrowser(fb, "https://www.facebook.com/manchesterunited/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(FB5,166,550);
		Hyperlink FB6 = goBrowser(fb, "https://www.facebook.com/ChelseaFC/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(FB6,486,550);
		
		Hyperlink TWT1 = goBrowser(twt, "https://twitter.com/Arsenal/");
		setLinkLayoutXY(TWT1,210,170);
		Hyperlink TWT2 = goBrowser(twt, "https://twitter.com/ManCity/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(TWT2,540,170);
		Hyperlink TWT3 = goBrowser(twt, "https://twitter.com/lfc/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(TWT3,211,360);
		Hyperlink TWT4 = goBrowser(twt, "https://twitter.com/SpursOfficial/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(TWT4,507,360);
		Hyperlink TWT5 = goBrowser(twt, "https://twitter.com/ManUtd/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(TWT5,211,550);
		Hyperlink TWT6 = goBrowser(twt, "https://twitter.com/chelseafc/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(TWT6,531,550);
		
		Hyperlink YOU1 = goBrowser(you, "https://www.youtube.com/arsenal/");
		setLinkLayoutXY(YOU1,255,170);
		Hyperlink YOU2 = goBrowser(you, "https://www.youtube.com/user/mcfcofficial/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(YOU2,585,170);
		Hyperlink YOU3 = goBrowser(you, "http://www.youtube.com/liverpoolfc/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(YOU3,256,360);
		Hyperlink YOU4 = goBrowser(you, "https://www.youtube.com/user/spursofficial/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(YOU4,552,360);
		Hyperlink YOU5 = goBrowser(you, "https://www.youtube.com/manutd/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(YOU5,256,550);
		Hyperlink YOU6 = goBrowser(you, "https://www.youtube.com/user/chelseafc/?utm_source=www.premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(YOU6,572,550);
			
		Hyperlink IG1 = goBrowser(ig, "http://instagram.com/arsenal/");
		setLinkLayoutXY(IG1,300,170);
		Hyperlink IG2 = goBrowser(ig, "http://instagram.com/mancity/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(IG2,630,170);
		Hyperlink IG3 = goBrowser(ig, "http://instagram.com/liverpoolfc/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(IG3,301,360);
		Hyperlink IG4 = goBrowser(ig, "https://instagram.com/spursofficial/?ref=badge/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(IG4,597,360);
		Hyperlink IG5 = goBrowser(ig, "http://instagram.com/manchesterunited/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(IG5,301,550);
		Hyperlink IG6 = goBrowser(ig, "https://instagram.com/chelseafc/?utm_source=premier-league-website&utm_campaign=website&utm_medium=link");
		setLinkLayoutXY(IG6,617,550);
		
		p.getChildren().addAll(stad, stad2, stad3, stad4, stad5, stad6,
				home1, home2, home3, home4, home5, home6,
				FB1, FB2, FB3, FB4, FB5, FB6,
				TWT1, TWT2, TWT3, TWT4, TWT5, TWT6,
				YOU1, YOU2, YOU3, YOU4, YOU5, YOU6,
				IG1, IG2, IG3, IG4, IG5, IG6);

		Menu b = new Menu();
		home = b.getHome();
		home.setLayoutX(635);
		home.setLayoutY(610);
		home.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		home.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		setStyle("-fx-background-color: #643D68;");
		
		Hyperlink link = new Hyperlink();
		link.setLayoutX(50);
		link.setLayoutY(100);
		
		getChildren().addAll(link, v, home, p);
	}

	public ImageView getGoHome() {
		return home;
	}
	
	public Hyperlink goBrowser(String name, String url) {
		ImageView img = new ImageView(new Image(ClassLoader.getSystemResource(name).toString()));
		setFit(img,28);
		Hyperlink link = new Hyperlink();
		link.setGraphic(img);
		link.setOnAction(e -> {
			if(Desktop.isDesktopSupported())
		    {
		        try {
		            Desktop.getDesktop().browse(new URI(url));
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        } catch (URISyntaxException e1) {
		            e1.printStackTrace();
		        }
		    }
		});
		return link;
	}
	
	public Hyperlink goHome(String house, String name ,String url) {
		ImageView img = new ImageView(new Image(ClassLoader.getSystemResource(house).toString()));
		setFit(img,20);
		Hyperlink link = new Hyperlink(name);
		link.setGraphic(img);
		link.setOnAction(e -> {
			if(Desktop.isDesktopSupported())
		    {
		        try {
		            Desktop.getDesktop().browse(new URI(url));
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        } catch (URISyntaxException e1) {
		            e1.printStackTrace();
		        }
		    }
		});
		return link;
	}
	
	public void setLayoutXY(ImageView img, int x, int y) {
		img.setLayoutX(x);
		img.setLayoutY(y);
	}
	
	public void setLinkLayoutXY(Hyperlink link, int x, int y) {
		link.setLayoutX(x);
		link.setLayoutY(y);
	}
	
	public void setFit(ImageView img, int size) {
		img.setFitHeight(size);
		img.setFitWidth(size);
	}
	
}
