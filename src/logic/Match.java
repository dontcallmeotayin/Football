package logic;

import java.time.LocalDateTime;

import javafx.util.Pair;

public class Match implements CsvAvailable{
	private int totalGoals;
	private Club homeTeam;
	private Club awayTeam;
	private int homegoal;
	private int awaygoal;
	private LocalDateTime startTime;
	private Refree refree;
	private Stadium stadium;
	private boolean isDone;
	
	public Match(Club home,int hg,Club away,int ag,LocalDateTime start,Refree refree,boolean isDone) {
		this.homeTeam = home;
		this.awayTeam = away;
		this.homegoal = hg;
		this.awaygoal = ag;
		this.startTime = start;
		this.refree = refree;
		this.stadium = home.getStadium();
		this.isDone = isDone;
		totalGoals();
	}
	
	public Match(Club home,int hg,Club away,int ag,LocalDateTime start) {
		this.homeTeam = home;
		this.awayTeam = away;
		this.homegoal = hg;
		this.awaygoal = ag;
		this.startTime = start;
		this.stadium = home.getStadium();
		totalGoals();
	}
	
	public void totalGoals() {
		this.totalGoals = this.homegoal+this.awaygoal;
	}

	public int getTotalGoals() {
		return totalGoals;
	}

	public void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}

	public Club getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Club homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Club getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Club awayTeam) {
		this.awayTeam = awayTeam;
	}

	public int getHomegoal() {
		return homegoal;
	}

	public void setHomegoal(int homegoal) {
		this.homegoal = homegoal;
	}

	public int getAwaygoal() {
		return awaygoal;
	}

	public void setAwaygoal(int awaygoal) {
		this.awaygoal = awaygoal;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public Refree getRefree() {
		return refree;
	}

	public void setRefree(Refree refree) {
		this.refree = refree;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	@Override
	public String getCsv() {
		return "res/match.csv";
	}
	
}
