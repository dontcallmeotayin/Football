package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
	
	public Match() {
		this.homeTeam = new Club("");
		this.awayTeam = new Club("");
		this.homegoal = -1;
		this.awaygoal = -1;
		this.startTime = LocalDateTime.now();
		this.stadium = new Stadium("");
	}
		
	public Match(Club home,int hg,Club away,int ag,LocalDateTime start,boolean isDone) {
		this.homeTeam = home;
		this.awayTeam = away;
		this.homegoal = hg;
		this.awaygoal = ag;
		this.startTime = start;
		this.stadium = home.getStadium();
		this.isDone = isDone;
		totalGoals();
	}
	
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
		return "res/matchthisweek.csv";
	}
	
	public ArrayList<Match> makeList() {
		  BufferedReader br = null;
		  String line = "";
		  String cvsSplitBy = ",";
		  ArrayList<Match> data = new ArrayList<Match>();
		  try {
		      br = new BufferedReader(new FileReader(this.getCsv()));
		      while ((line = br.readLine()) != null) {
		          String[] csvdata = line.split(cvsSplitBy);
		          //----------------------
	              Club h = new Club(csvdata[1]);
	              int hg = Integer.parseInt(csvdata[3]);
	              Club a = new Club(csvdata[2]);
	              int ag = Integer.parseInt(csvdata[4]);
	              String[] date = csvdata[0].split("/");
	              int check = Integer.parseInt(csvdata[5]);
	              boolean done = false;
	              LocalDateTime start = LocalDateTime.now();
	              if(check==1) {
	            	  done = true;
		              start = LocalDateTime.of(Integer.valueOf(date[2]),Integer.valueOf(date[1]), Integer.valueOf(date[0]), 0, 0);
	              }
	              else {
		              start = LocalDateTime.of(Integer.valueOf(date[2]),Integer.valueOf(date[1]), Integer.valueOf(date[0]), 3, 4);
		              hg = -1;
		              ag = -1;
	              }
	              Match newdata = new Match(h,hg,a,ag,start,done);
		          data.add(newdata);
		      }
		   } catch (FileNotFoundException e) {
			      e.printStackTrace();
		   } catch (IOException e) {
			      e.printStackTrace();
		   } finally {
			    if (br != null) {
			        try {
			            br.close();
			         } catch (IOException e) {
			            e.printStackTrace();
			         }
			    }
			 }
		  return data;
		}
	
}
