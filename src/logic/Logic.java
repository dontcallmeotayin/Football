package logic;

import java.util.ArrayList;

public class Logic {
	public static Logic instance = new Logic();
	private ArrayList<Competition> competitions;	
	
	public Logic() {
		competitions = new ArrayList<Competition>();
		Club ars = new Club("ARS");
		Club liv = new Club("LIV");
		Club mci = new Club("MCI");
		Club tot = new Club("TOT");
		Club mun = new Club("MUN");
		Club che = new Club("CHE");
//		Competition premierleague = new Competition("Premier League", Std, Matches, startDate, endDate)
	}
}
