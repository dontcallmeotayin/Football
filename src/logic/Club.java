package logic;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Club {
	private String name;
	private String code;
	private Stadium stadium;
	private ArrayList<Player> Players;
	private ArrayList<String> Colors;
	private Manager manager;
	private Image image;
	
	public Club(String code,ArrayList<Player> players,ArrayList<String> colors,
			Manager mng,Stadium stadium) {
		this.code = code;
		this.Players = players;
		this.Colors = colors;
		this.manager = mng;
		codeToName();
		this.stadium = stadium;
	}
	
	public Club(String code) {
		this.code = code;
		codeToName();
	}
	
	public void codeToName() {
		String c = this.code;
		if(c.equals("ARS")) name = "Arsenal";
		if(c.equals("MCI")) name = "Manchester City";
		if(c.equals("LIV")) name = "Liverpool";
		if(c.equals("TOT")) name = "Tottenham Hotspur";
		if(c.equals("MUN")) name = "Manchester United";
		if(c.equals("CHE")) name = "Chelsea";
		if(c.equals("EVE")) name = "Everton";
		if(c.equals("BOU")) name = "Bournemouth";
		if(c.equals("LEI")) name = "Leicester City";
		if(c.equals("BHA")) name = "Brighton and Hove Albion";
		if(c.equals("WAT")) name = "Watford";
		if(c.equals("WOL")) name = "Wolverhampton Wanderers";
		if(c.equals("WHU")) name = "West Ham United";
		if(c.equals("NEW")) name = "Newcastle United";
		if(c.equals("CRY")) name = "Crystal Palace";
		if(c.equals("CAR")) name = "BCardeiff City";
		if(c.equals("HUD")) name = "Huddersfield Town";
		if(c.equals("SOU")) name = "Southampton";
		if(c.equals("BUR")) name = "Burnley";
		if(c.equals("FUL")) name = "Fulham";
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

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

}
