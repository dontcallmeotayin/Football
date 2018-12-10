package main;
import application.About;
import application.Menu;
import application.Calendar;
import application.ClubScreen;
import application.Credit;
import application.ManagerScreen;
import application.PlayerTeamSelection;
import application.RefreeScreen;
import application.StadiumScreen;
import application.Tables;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene  .media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import logic.PremierLeagueLogic;

public class Main extends Application{

	@Override
	public void start(Stage stage) {
		VBox root = new VBox();
		root.setPrefSize(700, 675);
		
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				Media song = new Media(ClassLoader.getSystemResource("fifaSong.mp3").toString());
				MediaPlayer bgm = new MediaPlayer(song);
				bgm.setVolume(0.2);
				bgm.setAutoPlay(true);
				bgm.setCycleCount(MediaPlayer.INDEFINITE);
			}
		});
		t.start();
				
		PremierLeagueLogic logic = new PremierLeagueLogic();
		
		//Home
		Menu btn = new Menu();
		
		//Calendar
		Calendar calendar = new Calendar(logic.getDays());
		
		// Tables
		Tables table = new Tables(logic.getPml().getStandings());
		
		// About
		About about = new About();
		
		// Club
		ClubScreen clubScreen = new ClubScreen();
		
		// Player
		PlayerTeamSelection playerTeamSelection = new PlayerTeamSelection();
		
		// Manager
		ManagerScreen managerscreen = new ManagerScreen(logic.getAllmng());
		
		// Stadium
		StadiumScreen stadiumScreen = new StadiumScreen(logic.getStadiums());
		
		//Credit
		Credit credit = new Credit();
		
		// Refree
		RefreeScreen refreeScreen = new RefreeScreen(logic.getRefree());
		
		//-------------------------------------------------------------
		
		ImageView calendarBtn =  btn.getCalendarBtn();
		calendarBtn.setOnMouseClicked(e -> {
			root.getChildren().add(calendar);
			root.getChildren().remove(btn);
		});
		
		ImageView clubBtn =  btn.getClubBtn();
		clubBtn.setOnMouseClicked(e -> {
			root.getChildren().add(clubScreen);
			root.getChildren().remove(btn);
		});
		
		ImageView tableBtn =  btn.getTableBtn();
		tableBtn.setOnMouseClicked(e -> {
			root.getChildren().add(table);
			root.getChildren().remove(btn);
		});
		
		ImageView managerBtn =  btn.getManagerBtn();
		managerBtn.setOnMouseClicked(e -> {
			root.getChildren().add(managerscreen);
			root.getChildren().remove(btn);
		});
		
		ImageView playerBtn =  btn.getPlayerBtn();
		playerBtn.setOnMouseClicked(e -> {
		root.getChildren().add(playerTeamSelection);
		root.getChildren().remove(btn);
		});
				
		ImageView aboutBtn =  btn.getAboutBtn();
		aboutBtn.setOnMouseClicked(e -> {
			root.getChildren().add(about);
			root.getChildren().remove(btn);
		});
		
		ImageView refreeBtn =  btn.getRefreeBtn();
		refreeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(refreeScreen);
			root.getChildren().remove(btn);
		});
		
		ImageView stadiumBtn =  btn.getStadiumBtn();
		stadiumBtn.setOnMouseClicked(e -> {
			root.getChildren().add(stadiumScreen);
			root.getChildren().remove(btn);
		});
		
		ImageView creditBtn =  btn.getCreditBtn();
		creditBtn.setOnMouseClicked(e -> {
			root.getChildren().add(credit);
			root.getChildren().remove(btn);
		});
		
	//-------------------------------------------------------------
			// back home button
		
		ImageView cahomeBtn =  calendar.getGoHome();
		cahomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(calendar);
		});

		ImageView clhomeBtn =  clubScreen.getGoHome();
		clhomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(clubScreen);
		});
		
		ImageView thomeBtn =  table.getGoHome();
		thomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(table);
		});

		ImageView mhomeBtn =  managerscreen.getGoHome();
		mhomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(managerscreen);
		});
	
		ImageView phomeBtn =  playerTeamSelection.getHome();
		phomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(playerTeamSelection);
		});
		
		ImageView ahomeBtn =  about.getGoHome();
		ahomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(about);
		});

		ImageView rhomeBtn =  refreeScreen.getHome();
		rhomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(refreeScreen);
		});
		
		ImageView shomeBtn =  stadiumScreen.getHome();
		shomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(stadiumScreen);
		});
		
		ImageView crehomeBtn =  credit.getGoHome();
		crehomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(credit);
		});
		
	//-------------------------------------------------------------
						
		root.getChildren().addAll(btn);
		
		root.setStyle("-fx-background-color: #EDEDED;");
		
		stage.getIcons().add(new Image(ClassLoader.getSystemResource("football.png").toString()));
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("ESSKEETIT Little Lion");
		stage.show();
	}
		
	public static void main(String [] args) {
		launch(args);
	}
	
}
