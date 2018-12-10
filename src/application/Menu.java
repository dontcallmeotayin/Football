package application;

import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Menu extends Pane {
	
	private ImageView calendarBtn;
	private ImageView clubBtn;
	private ImageView tableBtn;
	private ImageView managerBtn;
	private ImageView aboutBtn;
	private ImageView playerBtn;
	private ImageView refreeBtn;
	private ImageView stadiumBtn;
	private ImageView home;
	private Label name;
	private ImageView box;
	private ImageView rec;
	private ImageView creditBtn;
	
	public Menu() {
		
		calendarBtn = new ImageView(new Image(ClassLoader.getSystemResource("calendar.png").toString()));
		clubBtn = new ImageView(new Image(ClassLoader.getSystemResource("liverpool.png").toString()));
		tableBtn = new ImageView(new Image(ClassLoader.getSystemResource("ranking.png").toString()));
		managerBtn = new ImageView(new Image(ClassLoader.getSystemResource("manager.png").toString()));
		aboutBtn = new ImageView(new Image(ClassLoader.getSystemResource("premier.png").toString()));
		playerBtn = new ImageView(new Image(ClassLoader.getSystemResource("football-player.png").toString()));
		refreeBtn = new ImageView(new Image(ClassLoader.getSystemResource("whistle.png").toString()));
		stadiumBtn = new ImageView(new Image(ClassLoader.getSystemResource("stadium.png").toString()));
		creditBtn = new ImageView(new Image(ClassLoader.getSystemResource("laptop.png").toString()));
		calendarBtn.setOnMouseEntered(e->{
			setCursor(Cursor.HAND);
		});
		calendarBtn.setOnMouseExited(e->{
			setCursor(Cursor.DEFAULT);
		});
		clubBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		clubBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		tableBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		tableBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		managerBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		managerBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		playerBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		playerBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		aboutBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		aboutBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		aboutBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		aboutBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		refreeBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		refreeBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		stadiumBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		stadiumBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});
		creditBtn.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		creditBtn.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});		
		
		calendarBtn.setFitHeight(80);
		calendarBtn.setFitWidth(80);
		calendarBtn.setLayoutX(130);
		calendarBtn.setLayoutY(208);
		
		clubBtn.setFitHeight(80);
		clubBtn.setFitWidth(80);
		clubBtn.setLayoutX(308);
		clubBtn.setLayoutY(208);
		
		tableBtn.setFitHeight(80);
		tableBtn.setFitWidth(80);
		tableBtn.setLayoutX(480);
		tableBtn.setLayoutY(208);
		
		managerBtn.setFitHeight(80);
		managerBtn.setFitWidth(80);
		managerBtn.setLayoutX(130);
		managerBtn.setLayoutY(355);
		
		playerBtn.setFitHeight(80);
		playerBtn.setFitWidth(80);
		playerBtn.setLayoutX(308);
		playerBtn.setLayoutY(355);
		
		refreeBtn.setFitHeight(80);
		refreeBtn.setFitWidth(80);
		refreeBtn.setLayoutX(480);
		refreeBtn.setLayoutY(355);
		
		aboutBtn.setFitHeight(130);
		aboutBtn.setFitWidth(130);
		aboutBtn.setLayoutX(105);
		aboutBtn.setLayoutY(480);
		
		stadiumBtn.setFitHeight(80);
		stadiumBtn.setFitWidth(80);
		stadiumBtn.setLayoutX(308);
		stadiumBtn.setLayoutY(508);
		
		creditBtn.setFitHeight(80);
		creditBtn.setFitWidth(80);
		creditBtn.setLayoutX(480);
		creditBtn.setLayoutY(508);
		
		home = new ImageView(new Image(ClassLoader.getSystemResource("ball.png").toString()));
		home.setFitHeight(50);
		home.setFitWidth(50);
				
		name = new Label("LITTLE  LION");
		name.setFont(new Font(70));
		name.setTextFill(Color.WHITESMOKE);
		name.setLayoutX(132);
		name.setLayoutY(35);
		
		box = new ImageView(new Image(ClassLoader.getSystemResource("box.png").toString()));
		box.setFitHeight(150);
		box. setScaleX(700);
		box.setLayoutY(3);
		
		rec = new ImageView(new Image(ClassLoader.getSystemResource("rectangle.png").toString()));
		rec.setFitHeight(650);
		rec.setFitWidth(530);
		rec.setLayoutX(80);
		rec.setLayoutY(74.5);
		
		this.getChildren().addAll(box, rec, name, calendarBtn, clubBtn, tableBtn, managerBtn, 
				aboutBtn, playerBtn, refreeBtn, stadiumBtn, creditBtn);
		
	}

	public ImageView getCalendarBtn() {
		return calendarBtn;
	}

	public ImageView getClubBtn() {
		return clubBtn;
	}

	public ImageView getTableBtn() {
		return tableBtn;
	}

	public ImageView getManagerBtn() {
		return managerBtn;
	}

	public ImageView getAboutBtn() {
		return aboutBtn;
	}

	public ImageView getPlayerBtn() {
		return playerBtn;
	}

	public ImageView getRefreeBtn() {
		return refreeBtn;
	}

	public ImageView getStadiumBtn() {
		return stadiumBtn;
	}

	public ImageView getHome() {
		return home;
	}

	public ImageView getCreditBtn() {
		return creditBtn;
	}
	
}
