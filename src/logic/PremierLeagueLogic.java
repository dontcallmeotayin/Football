package logic;

import java.util.ArrayList;

import javafx.util.Pair;

public class PremierLeagueLogic {
	private Competition pml;
	private ArrayList<Club> clubs;
	private ArrayList<CsvAvailable> allplayers;
	private ArrayList<CsvAvailable> allmng;
	private ArrayList<Match> matches;
	private ArrayList<Standings> standings;
	
	public PremierLeagueLogic() {
//		CsvBuilder csvplayer = new CsvBuilder(new Player());
		allplayers = new CsvBuilder(new Player()).makeList();
		
//		CsvBuilder csvmng = new CsvBuilder(new Manager());
		allmng =  new CsvBuilder(new Manager()).makeList();
		
		Stadium em = new Stadium("Emirates Stadium",60260,"Highbury House, 75 Drayton Park, London, N5 1BU");
		Stadium stf = new Stadium("Stamford Bridge",40853,"Stamford Bridge, Fulham Road, London, SW6 1HS");
		Stadium a = new Stadium("Anfield",53394,"Anfield, Anfield Road, Liverpool, L4 0TH");
		Stadium o = new Stadium("Old Trafford",74879,"Sir Matt Busby Way, Old Trafford, Manchester, M16 0RA");
		Stadium w = new Stadium("Wembley Stadium", 90000,"Wembley Stadium, Wembley, London, HA9 0WS");
		Stadium et = new Stadium("Etihad Stadium",55017,"Etihad Stadium, Etihad Campus, Manchester, M11 3FF");
		
		clubs = new ArrayList<Club>();
		Club c1 = new Club("ARS",(Manager)(allmng.get(0)),em); clubs.add(c1);
		Club c2 = new Club("MCI",(Manager)(allmng.get(3)),et); clubs.add(c2); 
		Club c3 = new Club("LIV",(Manager)(allmng.get(5)),a); clubs.add(c3);
		Club c4 = new Club("TOT",(Manager)(allmng.get(2)),w); clubs.add(c4);
		Club c5 = new Club("MUN",(Manager)(allmng.get(4)),o); clubs.add(c5);
		Club c6 = new Club("CHE",(Manager)(allmng.get(1)),stf); clubs.add(c6);
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
		
	}

	public ArrayList<CsvAvailable> getAllplayers() {
		return allplayers;
	}

	public ArrayList<Club> getClubs() {
		return clubs;
	}

	public ArrayList<CsvAvailable> getAllmng() {
		return allmng;
	}
	
	
}
