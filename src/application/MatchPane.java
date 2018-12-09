package application;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import logic.Match;

public class MatchPane extends HBox{
	private Label time;
	private Label place;
	private VBox teams;
	
	public MatchPane(Match match) {
		super(5);
		setPadding(new Insets(7));
		setStyle("-fx-background-color: #E4D7F0;");			// box color
		
		setBackground(new Background(new BackgroundFill(Color.BLANCHEDALMOND, CornerRadii.EMPTY, Insets.EMPTY)));
		setPrefWidth(610);
		setPrefHeight(53);
		setLayoutX(45);
		setLayoutY(172);
		
		if(!match.isDone()) {
			String startH = ""+match.getStartTime().getHour();
			String startM = ""+match.getStartTime().getMinute();
			String start = startH + ":" + startM;
			
			time = new Label("       "+start+"              ");
			time.setFont(new Font(15));
			
			getChildren().add(time);
		}
		else if(match.isDone()) {
			String hg = ""+match.getHomegoal();
			String ag = ""+match.getAwaygoal();
			
			VBox score = new VBox();
			score.setPrefWidth(200);
			score.setPrefHeight(40);

		}
		
		String hometeam = match.getHomeTeam().getName();  
		String awayteam = match.getAwayTeam().getName();
		String stadium = match.getStadium().getName();

		place = new Label("                              "+stadium);
		place.setFont(new Font(15));
		
		teams = new VBox();
		teams.setPrefWidth(200);
		teams.setPrefHeight(40);
		
		Label home = new Label(hometeam);
		home.setFont(new Font(15));
		Label away = new Label(awayteam);
		away.setFont(new Font(15));
		
		teams.getChildren().addAll(home,away);
//		teams.setStyle("-fx-background-color: #9273AD;");		// color in box of team
		
		getChildren().addAll(teams,place);
	}
}
