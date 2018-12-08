package logic;

import javafx.scene.image.Image;

public class IncludeImage {
	private String imagename;
	public static final String IMGTYPE = ".png";
	private Image image;
	
	public IncludeImage() {
		this.imagename = "NoImageAvailable";
		setImage();
	}
	
	public IncludeImage(String name) {
		this.imagename = name;
		setImage();
	}
	
	public String ImagePath() {
		return imagename+IMGTYPE;
	}

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public Image getImage() {
		return image;
	}

	public void setImage() {
		this.image = new Image(ClassLoader.getSystemResource(ImagePath()).toString());
	}
	
}
