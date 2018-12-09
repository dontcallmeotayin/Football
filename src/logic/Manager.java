package logic;

import java.time.LocalDate;

public class Manager extends Person implements CsvAvailable {
	private int seasons = 0;
	private String team;
	
	public Manager() {
		super();
//		this.setAge(calAge());
	}
	
	public Manager(String f, String l) {
		super(f, l);
//		this.setAge(calAge());
	}
	
	public Manager(String f, String l,String t,int s) {
		super(f, l);
//		this.setAge(calAge());
		this.seasons = s;
		this.team = t;
		setImage(team.toLowerCase()+"0m.png");
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	@Override
	public String getCsv() {
		return "res/Manager.csv";
	}


}
