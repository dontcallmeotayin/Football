package application;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import logic.Manager;
import logic.Person;
import logic.Player;
import logic.Refree;

public class PersonalDetails extends VBox{
	
	private HBox head;
	private VBox data;
	
	public PersonalDetails(Person p) {
		ImageView img = new ImageView(p.getImage());
		Label name = new Label(p.getName());
		head = new HBox();
		head.getChildren().addAll(img,name);
		
		if(p instanceof Player || p instanceof Manager) {
			Label nation = new Label("Nationality");
			Text na = new Text(p.getNationality());
			DetailsData d1 = new DetailsData(nation, na);
			Label bd = new Label("Date of Birth");
			Text bday = new Text(p.getBd().toString());
			DetailsData d2 = new DetailsData(bd,bday);
			Label age = new Label("Age");
			Text a = new Text(String.valueOf(p.getAge()));
			DetailsData d3 = new DetailsData(age, a);
			data = new VBox();
			data.getChildren().addAll(d1,d2,d3);
		}
		else if(p instanceof Refree) {
			Label match = new Label("Matches");
			Text m = new Text(String.valueOf(((Refree) p).getMatches()));
			DetailsData d1 = new DetailsData(match,m);
			Label red = new Label("Red cards");
			Text r = new Text(String.valueOf(((Refree) p).getRed()));
			DetailsData d2 = new DetailsData(red,r);
			Label yel = new Label("Yellow cards");
			Text y = new Text(String.valueOf(((Refree) p).getYellow()));
			DetailsData d3 = new DetailsData(red,r);
			data.getChildren().addAll(d1,d2,d3);
		}
		
		if(p instanceof Player) {
			Player player = (Player)p;
			Label number = new Label(String.valueOf(player.getNumber()));
			head.getChildren().add(0,number);
			
			Label height = new Label("Height");
			Text h = new Text(String.valueOf(player.getHeight()));
			DetailsData d4 = new DetailsData(height, h);
			data.getChildren().add(d4);
		}
		
		if(p instanceof Manager) {
			Manager mng = (Manager)p;
			Label season = new Label("Seasons");
			Text s = new Text(String.valueOf(mng.getSeasons()));
			DetailsData d4 = new DetailsData(season, s);
			data.getChildren().add(d4);
		}

	}
}
