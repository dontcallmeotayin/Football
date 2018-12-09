package logic;

import javafx.scene.image.Image;
import javafx.util.Pair;

public class Stadium {
	private String name;
	private int cap;
	private String address;
	
	public Stadium(String name) {
		this.name = name;
	}
	
	public Stadium(String name,int cap,String address){
		this.name = name;
		this.cap = cap;
		this.address = address;
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
	
}
