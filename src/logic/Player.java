package logic;

import java.time.LocalDate;

public class Player extends Person {
	private double height;
	private String pos;
	private int number;
	private boolean isCap;
	private int goals;
	private int cleansheets;
	
	public Player() {
		super();
		this.setAge(calAge());
	}
	
	public Player(String f, String l, String n, LocalDate d) {
		super(f, l, n, d);
		this.height = 0;
		this.pos = "";
		this.number = 0;
		this.isCap = false;
		this.goals = 0;
		this.cleansheets = 0;
		this.setAge(calAge());
	}
	

	public Player(String f, String l, String n, LocalDate d,
			double h,String p,int no,boolean cap,int g,int c) {
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
	
	
	
	
}
