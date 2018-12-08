package logic;

import java.time.LocalDate;
import java.util.ArrayList;

public class Competition {
	private String name;
	private ArrayList<Standings> Std;
	private ArrayList<Match> Matches;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Competition(String name,ArrayList<Standings> Std,ArrayList<Match> Matches,LocalDate startDate,LocalDate endDate) {
		this.name = name;
		this.Std =  Std;
		this.Matches = Matches;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
