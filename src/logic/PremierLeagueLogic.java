package logic;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PremierLeagueLogic {
	private Competition pml;
	private ArrayList<Club> clubs;
	private ArrayList<Player> allplayers;
	private ArrayList<Manager> allmng;
	private ArrayList<Refree> refree;
	private ArrayList<Stadium> stadiums;
	
	public PremierLeagueLogic() {
		
		allmng =  (new Manager()).makeList();
		ArrayList<Match> matches = (new Match()).makeList();
		
		//Stadium
		Stadium em = new Stadium("Emirates Stadium",60260,"Highbury House, 75 Drayton Park, London, N5 1BU","ARS");
		Stadium stf = new Stadium("Stamford Bridge",40853,"Stamford Bridge, Fulham Road, London, SW6 1HS","CHE");
		Stadium a = new Stadium("Anfield",53394,"Anfield, Anfield Road, Liverpool, L4 0TH","LIV");
		Stadium o = new Stadium("Old Trafford",74879,"Sir Matt Busby Way, Old Trafford, Manchester, M16 0RA","MUN");
		Stadium w = new Stadium("Wembley Stadium", 90000,"Wembley Stadium, Wembley, London, HA9 0WS","TOT");
		Stadium et = new Stadium("Etihad Stadium",55017,"Etihad Stadium, Etihad Campus, Manchester, M11 3FF","MCI");
		stadiums = new ArrayList<Stadium>();
		stadiums.add(em);
		stadiums.add(et);
		stadiums.add(a);
		stadiums.add(w);
		stadiums.add(o);
		stadiums.add(stf);
		
		//Club
		clubs = new ArrayList<Club>();
		Club c1 = new Club("ARS",allmng.get(0),em); clubs.add(c1);
		Club c2 = new Club("MCI",allmng.get(3),et); clubs.add(c2); 
		Club c3 = new Club("LIV",allmng.get(5),a); clubs.add(c3);
		Club c4 = new Club("TOT",allmng.get(2),w); clubs.add(c4);
		Club c5 = new Club("MUN",allmng.get(4),o); clubs.add(c5);
		Club c6 = new Club("CHE",allmng.get(1),stf); clubs.add(c6);
		//-----------------------------------------
		Club c7 = new Club("EVE"); clubs.add(c7);
		Club c8 = new Club("BOU"); clubs.add(c8);
		Club c9 = new Club("LEI"); clubs.add(c9);
		Club c10 = new Club("BHA"); clubs.add(c10);
		Club c11 = new Club("WAT"); clubs.add(c11);
		Club c12 = new Club("WOL"); clubs.add(c12);
		Club c13 = new Club("WHU"); clubs.add(c13);
		Club c14 = new Club("NEW"); clubs.add(c14);
		Club c15 = new Club("CRY"); clubs.add(c15);
		Club c16 = new Club("CAR"); clubs.add(c16);
		Club c17 = new Club("HUD"); clubs.add(c17);
		Club c18 = new Club("SOU"); clubs.add(c18);
		Club c19 = new Club("BUR"); clubs.add(c19);
		Club c20 = new Club("FUL"); clubs.add(c20);
		
		//Standings
		ObservableList<Standings> std = FXCollections.observableArrayList(
				new Standings(c1, 16,10,4,2,35,20),
				new Standings(c2, 16,13,2,1,45,9),
				new Standings(c3, 16,13,3,0,34,6),
				new Standings(c4, 16,12,0,4,30,16),
				new Standings(c5, 16,7,5,4,28,26),
				new Standings(c6, 16,10,4,2,33,13),
				new Standings(c7, 15,6,5,4,21,17),
				new Standings(c8, 16,7,2,7,25,26),
				new Standings(c9, 16,6,4,6,21,20),
				new Standings(c10, 16,7,2,7,25,26),
				new Standings(c11, 15,6,2,7,18,21),
				new Standings(c12, 15,5,4,6,15,18),
				new Standings(c13, 16,6,3,7,23,25),
				new Standings(c14, 15,3,4,8,12,20),
				new Standings(c15, 16,3,3,10,13,23),
				new Standings(c16, 16,4,2,10,15,30),
				new Standings(c17, 16,2,4,10,10,27),
				new Standings(c18, 16,1,6,9,13,30),
				new Standings(c19, 16,3,3,10,15,32),
				new Standings(c20, 16,2,3,11,16,40)
		);
				
		LocalDate start = LocalDate.of(2018, 8, 10);
		LocalDate end = LocalDate.of(2019,5,14);
		this.pml = new Competition("Premier League",std,matches,start,end);
	}

	public ArrayList<Club> getClubs() {
		return clubs;
	}

	public Competition getPml() {
		return pml;
	}

	public ArrayList<Player> getAllplayers() {
		allplayers = (new Player()).makeList();
		return allplayers;
	}

	public ArrayList<Manager> getAllmng() {  
		return allmng;
	}

	public ArrayList<Refree> getRefree() {
		refree = (new Refree()).makeList();
		return refree;
	}	
	
	public ArrayList<Player> getPlayers(Club c) {
		String team = c.getCode();
		ArrayList<Player> players = (new Player(team)).makeList();
		return players;
	}

	public ArrayList<Stadium> getStadiums() {
		return stadiums;
	}
	
}
