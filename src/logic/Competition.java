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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Standings> getStandings() {
		return Std;
	}

	public void setStandings(ArrayList<Standings> std) {
		Std = std;
	}

	public ArrayList<Match> getMatches() {
		return Matches;
	}

	public void setMatches(ArrayList<Match> matches) {
		Matches = matches;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
