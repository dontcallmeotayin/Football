package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javafx.util.Pair;

public class Player extends Person implements CsvAvailable {
//	private double height=0;
	private String pos="";
	private int number=0;
//	private boolean isCap=false;
//	private int goals=0;
//	private int cleansheets = 0;
//	private int appearance = 0;
//	private int assists = 0;
	private String team;
	
	public Player() {
		super();
//		this.setAge(calAge());
		setImagetoBasic();
	}
	
	public Player(String f, String l) {
		super(f, l);
//		this.setAge(calAge());
		setImagetoBasic();
	}
	
	public Player(String f,String l,int n,String t,String pos) {
		this.setFirstName(f);
		this.setLastName(l);
		this.number = n;
		this.team = t;
		this.pos = pos;
		try {
			setImage(team.toLowerCase()+number+".png");
		} catch (NullPointerException e) {
            setImagetoBasic();
		}
	}

//	public Player(String f, String l, String n, LocalDate d,
//			double h,String p,int no,boolean cap,int g,int c,int ap,int as,String t) {
//		this.setFirstName(f);
//		this.setLastName(l);
//		this.setNationality(n);
//		this.setBd(d);
//		this.setAge(calAge());
//		this.height = h;
//		this.number = no;
//		this.isCap = cap;
//		this.goals = g;
//		this.cleansheets = c;
//		this.appearance = ap;
//		this.assists = as;
//		this.team = t;
//		setImage(team.toLowerCase()+number+".png");
//	}

//	public double getHeight() {
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

//	public boolean isCap() {
//		return isCap;
//	}
//
//	public void setCap(boolean isCap) {
//		this.isCap = isCap;
//	}
//
//	public int getGoals() {
//		return goals;
//	}
//
//	public void setGoals(int goals) {
//		this.goals = goals;
//	}
//
//	public int getCleansheets() {
//		return cleansheets;
//	}
//
//	public void setCleansheets(int cleansheets) {
//		this.cleansheets = cleansheets;
//	}
//
//	public int getAppearance() {
//		return appearance;
//	}
//
//	public void setAppearance(int appearance) {
//		this.appearance = appearance;
//	}
//
//	public int getAssists() {
//		return assists;
//	}
//
//	public void setAssists(int assists) {
//		this.assists = assists;
//	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCsv() {
		return "res/Player.csv";
	}

	public ArrayList<Player> makeList() {
		  BufferedReader br = null;
		  String line = "";
		  String cvsSplitBy = ",";
		  ArrayList<Player> data = new ArrayList<Player>();
		  try {
		      br = new BufferedReader(new FileReader(this.getCsv()));
		      while ((line = br.readLine()) != null) {
		          String[] csvdata = line.split(cvsSplitBy);
		          //----------------------
		    		  int num = Integer.parseInt(csvdata[0]);
		    		  String pos = csvdata[1];
		    		  String first = csvdata[2];
		    		  String last = csvdata[3];
		    		  String team = csvdata[4];
		    		  Player newdata = new Player(first, last, num, team, pos);
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
