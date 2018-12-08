package logic;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Club {
	private String name;
	private String code;
	//Stadium
	private ArrayList<Player> Players;
	private ArrayList<String> Colors;
	private Manager manager;
	private Image image;
	
	public Club(String code,ArrayList<Player> players,ArrayList<String> colors,
			Manager mng) {
		this.code = code;
		this.Players = players;
		this.Colors = colors;
		this.manager = mng;
		codeToName();
	}
	
	public void codeToName() {
		String c = this.code;
		if(c.equals("ARS")) name = "Arsenal";
		if(c.equals("MCI")) name = "Manchester City";
		if(c.equals("LVI")) name = "Liverpool";
		if(c.equals("TOT")) name = "Tottenham Hotspur";
		if(c.equals("MUN")) name = "Manchester United";
		if(c.equals("CHE")) name = "Chelsea";
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

}
