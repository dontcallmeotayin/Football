package logic;

import java.time.LocalDate;

public class Manager extends Person {
	private int seasons = 0;
	
	public Manager() {
		super();
		this.setAge(calAge());
	}
	
	public Manager(String f, String l, String n, LocalDate d) {
		super(f, l, n, d);
		this.setAge(calAge());
	}
	
	public Manager(String f, String l, String n, LocalDate d,int s) {
		super(f, l, n, d);
		this.setAge(calAge());
		this.seasons = s;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}


}
