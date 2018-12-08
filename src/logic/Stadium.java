package logic;

import javafx.scene.image.Image;
import javafx.util.Pair;

public class Stadium {
	private String name;
	private int cap;
	private Pair<Double,Double> size;
	private String address;
	private Image image;
	
	public Stadium(String name) {
		this.name = name;
	}
	
	public Stadium(String name,int cap,Pair<Double,Double> size,String address){
		this.name = name;
		this.cap = cap;
		this.size = size;
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

	public Pair<Double, Double> getSize() {
		return size;
	}

	public void setSize(Pair<Double, Double> size) {
		this.size = size;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
}
