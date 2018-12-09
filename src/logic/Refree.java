package logic;

import java.time.LocalDate;

public class Refree extends Person{
	private int matches = 0;
	private int red = 0;
	private int yellow = 0;
	
	public Refree() {
		super();
	}
	
	public Refree(String f, String l) {
		super(f, l);
	}
	
	public Refree(String f, String l, int m, int r, int y) {
		super(f, l);
		this.matches = m;
		this.red = r;
		this.yellow = y;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getYellow() {
		return yellow;
	}

	public void setYellow(int yellow) {
		this.yellow = yellow;
	}

}
