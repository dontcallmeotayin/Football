package logic;

import javafx.scene.image.Image;
import javafx.util.Pair;

public class Stadium {
	private String name;
	private int cap;
	private String address;
	private String team;
	
	public Stadium(String name) {
		this.name = name;
		this.cap = 0;
		this.address = "MARS";
		this.team = "";

	}
	
	public Stadium(String name,int cap,String address){
		this.name = name;
		this.cap = cap;
		this.address = address;
		this.team = "";
	}
	
	public Stadium(String name,int cap,String address,String team){
		this.name = name;
		this.cap = cap;
		this.address = address;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
}
