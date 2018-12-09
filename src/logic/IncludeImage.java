package logic;

import javafx.scene.image.Image;

public class IncludeImage {
	private String imagename = "NoImageAvailable.png";
	private Image image;
	
	public IncludeImage() {
		setImage(this.imagename);
	}
	
	public IncludeImage(String name) {
		this.imagename = name;
		setImage(this.imagename);
	}
	
	public String getImagePath() {
		return imagename;
	}

	public void setImagePath(String imagename) {
		this.imagename = imagename;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(String imagename) {
		this.imagename = imagename;
		this.image = new Image(ClassLoader.getSystemResource(imagename).toString());
	}
	
}
