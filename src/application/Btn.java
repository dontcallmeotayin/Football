package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Btn extends Pane {
	
	private ImageView calendarBtn;
	private ImageView clubBtn;
	private ImageView tableBtn;
	private ImageView managerBtn;
	private ImageView aboutBtn;
	private ImageView playerBtn;
	private ImageView refreeBtn;
	private ImageView home;
	
	public Btn() {
		
		calendarBtn = new ImageView(new Image(ClassLoader.getSystemResource("calendar.png").toString()));
		clubBtn = new ImageView(new Image(ClassLoader.getSystemResource("liverpool.png").toString()));
		tableBtn = new ImageView(new Image(ClassLoader.getSystemResource("ranking.png").toString()));
		managerBtn = new ImageView(new Image(ClassLoader.getSystemResource("manager.png").toString()));
		aboutBtn = new ImageView(new Image(ClassLoader.getSystemResource("premier.png").toString()));
		playerBtn = new ImageView(new Image(ClassLoader.getSystemResource("football-player.png").toString()));
		refreeBtn = new ImageView(new Image(ClassLoader.getSystemResource("whistle.png").toString()));
		
		calendarBtn.setFitHeight(80);
		calendarBtn.setFitWidth(80);
		calendarBtn.setLayoutX(130);
		calendarBtn.setLayoutY(180);
		
		clubBtn.setFitHeight(80);
		clubBtn.setFitWidth(80);
		clubBtn.setLayoutX(297);
		clubBtn.setLayoutY(180);
		
		tableBtn.setFitHeight(80);
		tableBtn.setFitWidth(80);
		tableBtn.setLayoutX(457);
		tableBtn.setLayoutY(180);
		
		managerBtn.setFitHeight(80);
		managerBtn.setFitWidth(80);
		managerBtn.setLayoutX(130);
		managerBtn.setLayoutY(340);
		
		playerBtn.setFitHeight(80);
		playerBtn.setFitWidth(80);
		playerBtn.setLayoutX(297);
		playerBtn.setLayoutY(340);
		
		aboutBtn.setFitHeight(130);
		aboutBtn.setFitWidth(130);
		aboutBtn.setLayoutX(432);
		aboutBtn.setLayoutY(315);
		
		refreeBtn.setFitHeight(80);
		refreeBtn.setFitWidth(80);
		refreeBtn.setLayoutX(130);
		refreeBtn.setLayoutY(500);
		
		home = new ImageView(new Image(ClassLoader.getSystemResource("ball.png").toString()));
		home.setFitHeight(50);
		home.setFitWidth(50);
		
		this.getChildren().addAll(calendarBtn, clubBtn, tableBtn, managerBtn, aboutBtn, playerBtn, refreeBtn);
		
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

	public ImageView getHome() {
		return home;
	}
	
}
