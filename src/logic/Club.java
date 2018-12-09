package logic;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Club extends IncludeImage {
	private String name ;
	private String code;
	private Stadium stadium;
	private ArrayList<Player> Players;
	private ArrayList<String> Colors;
	private Manager manager;
	
	public Club(String code,ArrayList<Player> players,ArrayList<String> colors,
			Manager mng,Stadium stadium) {
		this.code = code.toUpperCase();
		this.Players = players;
		this.Colors = colors;
		this.manager = mng;
		this.stadium = stadium;
		codeToName();
	}
	
	public Club(String code) {
		this.code = code.toUpperCase().trim();
		codeToName();
	}

	
	public Club(String code,Manager mng,Stadium stadium) {
		this.code = code.toUpperCase();
		this.manager = mng;
		this.stadium = stadium;
		codeToName();
	}
	
	
	public void codeToName() {
		String c = this.code;
		if(c.equals("ARS") || c.equals("MCI") || c.equals("TOT") ||
		   c.equals("MUN") || c.equals("LIV") || c.equals("CHE")) {
			this.setImage(code.toLowerCase()+"00.png");
		}
		if(c.equals("ARS")) name = "Arsenal";
		else if(c.equals("MCI")) name = "Manchester City";
		else if(c.equals("LIV")) name = "Liverpool";
		else if(c.equals("TOT")) name = "Tottenham Hotspur";
		else if(c.equals("MUN")) name = "Manchester United";
		else if(c.equals("CHE")) name = "Chelsea";
		else if(c.equals("EVE")) name = "Everton";
		else if(c.equals("BOU")) name = "Bournemouth";
		else if(c.equals("LEI")) name = "Leicester City";
		else if(c.equals("BHA")) name = "Brighton and Hove Albion";
		else if(c.equals("WAT")) name = "Watford";
		else if(c.equals("WOL")) name = "Wolverhampton Wanderers";
		else if(c.equals("WHU")) name = "West Ham United";
		else if(c.equals("NEW")) name = "Newcastle United";
		else if(c.equals("CRY")) name = "Crystal Palace";
		else if(c.equals("CAR")) name = "BCardeiff City";
		else if(c.equals("HUD")) name = "Huddersfield Town";
		else if(c.equals("SOU")) name = "Southampton";
		else if(c.equals("BUR")) name = "Burnley";
		else if(c.equals("FUL")) name = "Fulham";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<Player> getPlayers() {
		return Players;
	}

	public void setPlayers(ArrayList<Player> players) {
		Players = players;
	}

	public ArrayList<String> getColors() {
		return Colors;
	}

	public void setColors(ArrayList<String> colors) {
		Colors = colors;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	@Override
	public String toString() {
		return name;
	}
	

}
