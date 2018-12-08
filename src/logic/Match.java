package logic;

import java.time.LocalDateTime;

import javafx.util.Pair;

public class Match {
	private String id;
	private int totalGoals;
	private Pair<Club,Integer> homeTeam;
	private Pair<Club,Integer> awayTeam;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private Refree refree;
	private Stadium stadium;
	private boolean isDone;
	
	public Match(String id,Pair<Club,Integer> home,Pair<Club,Integer> away,LocalDateTime start,LocalDateTime end,Refree refree,boolean isDone) {
		this.id = id;
		this.homeTeam = home;
		this.awayTeam = away;
		this.startTime = start;
		this.endTime = end;
		this.refree = refree;
		this.stadium = home.getKey().getStadium();
		this.isDone = isDone;
		totalGoals();
	}
	
	public Match(Pair<Club,Integer> home,Pair<Club,Integer> away,LocalDateTime start) {
		this.homeTeam = home;
		this.awayTeam = away;
		this.startTime = start;
		this.stadium = home.getKey().getStadium();
	}
	
	public void totalGoals() {
		this.totalGoals = this.homeTeam.getValue() + this.awayTeam.getValue();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTotalGoals() {
		return totalGoals;
	}

	public void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}

	public Pair<Club, Integer> getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Pair<Club, Integer> homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Pair<Club, Integer> getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Pair<Club, Integer> awayTeam) {
		this.awayTeam = awayTeam;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
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
	
}
