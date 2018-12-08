package logic;

import java.time.LocalDate;

public class Player extends Person {
	private double height=0;
	private String pos="";
	private int number=0;
	private boolean isCap=false;
	private int goals=0;
	private int cleansheets = 0;
	private int appearance = 0;
	private int assists = 0;
	
	public Player() {
		super();
		this.setAge(calAge());
	}
	
	public Player(String f, String l, String n, LocalDate d) {
		super(f, l, n, d);
		this.setAge(calAge());
	}
	

	public Player(String f, String l, String n, LocalDate d,
			double h,String p,int no,boolean cap,int g,int c,int ap,int as) {
		this.setFirstName(f);
		this.setLastName(l);
		this.setNationality(n);
		this.setBd(d);
		this.setAge(calAge());
		this.height = h;
		this.number = no;
		this.isCap = cap;
		this.goals = g;
		this.cleansheets = c;
		this.appearance = ap;
		this.assists = as;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

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

	public boolean isCap() {
		return isCap;
	}

	public void setCap(boolean isCap) {
		this.isCap = isCap;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getCleansheets() {
		return cleansheets;
	}

	public void setCleansheets(int cleansheets) {
		this.cleansheets = cleansheets;
	}

	public int getAppearance() {
		return appearance;
	}

	public void setAppearance(int appearance) {
		this.appearance = appearance;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}
	
}
