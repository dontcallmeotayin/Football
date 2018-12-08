package application;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import logic.Match;

public class MatchPane extends HBox{
	private Label time;
	private Label place;
	private VBox teams;
	
	public MatchPane(Match match) {
		super(5);
		setPrefWidth(300);
		setPrefHeight(40);
		String startH = ""+match.getStartTime().getHour();
		String startM = ""+match.getStartTime().getMinute();
		String start = startH + ":" + startM;
		String hometeam = match.getHomeTeam().getKey().getName();
		String awayteam = match.getAwayTeam().getKey().getName();
		String stadium = match.getStadium().getName();
		
		time = new Label(start);
		place = new Label(stadium);
		
		teams = new VBox();
		teams.setPrefWidth(200);
		teams.setPrefHeight(40);
		Label home = new Label(hometeam);
		Label away = new Label(awayteam);
		teams.getChildren().addAll(home,away);
		
		getChildren().addAll(time,teams,place);
	}
}
