package application;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.Manager;
import logic.Person;
import logic.Player;
import logic.Refree;

public class PlayerPane extends VBox{
	
	private HBox head;
	private VBox data;
	
	public PlayerPane(Player p) {
		ImageView club = new ImageView(p.getTeam()+"00.png");
		club.setFitHeight(50); 
		club.setFitWidth(50);
		club.setPreserveRatio(true);
		ImageView img = new ImageView(p.getImage());
		img.setFitHeight(150); 
		img.setFitWidth(150);
		img.setPreserveRatio(true);
		Label number = new Label(String.valueOf(p.getNumber()));
		number.setFont(new Font(30));
		Label name = new Label(p.getName());
		name.setFont(new Font(30));
		head = new HBox(30);
		head.setAlignment(Pos.CENTER_LEFT);
		head.setMinWidth(650);
		head.setPrefHeight(200);
		head.getChildren().addAll(club,img,number,name);
		head.setStyle("-fx-background-color: #ffffff");
		
//		if(p instanceof Player || p instanceof Manager) {
//			Label nation = new Label("Nationality");
//			Text na = new Text(p.getNationality());
//			DetailsData d1 = new DetailsData(nation, na);
//			Label bd = new Label("Date of Birth");
//			Text bday = new Text(p.getBd().toString());
//			DetailsData d2 = new DetailsData(bd,bday);
//			Label age = new Label("Age");
//			Text a = new Text(String.valueOf(p.getAge()));
//			DetailsData d3 = new DetailsData(age, a);
//			data = new VBox();
//			data.getChildren().addAll(d1,d2,d3);
//		}
//		else if(p instanceof Refree) {
//			Label match = new Label("Matches");
//			Text m = new Text(String.valueOf(((Refree) p).getMatches()));
//			DetailsData d1 = new DetailsData(match,m);
//			Label red = new Label("Red cards");
//			Text r = new Text(String.valueOf(((Refree) p).getRed()));
//			DetailsData d2 = new DetailsData(red,r);
//			Label yel = new Label("Yellow cards");
//			Text y = new Text(String.valueOf(((Refree) p).getYellow()));
//			DetailsData d3 = new DetailsData(red,r);
//			data.getChildren().addAll(d1,d2,d3);
//		}
//		
//		if(p instanceof Player) {
//			Player player = (Player)p;
			
			
//			Label height = new Label("Height");
//			Text h = new Text(String.valueOf(p.getHeight()));
//			DetailsData d4 = new DetailsData(height, h);
//			data.getChildren().add(d4);
//		}
//		
//		if(p instanceof Manager) {
//			Manager mng = (Manager)p;
//			Label season = new Label("Seasons");
//			Text s = new Text(String.valueOf(mng.getSeasons()));
//			DetailsData d4 = new DetailsData(season, s);
//			data.getChildren().add(d4);
//		}
		
		getChildren().add(head);
	}
}
