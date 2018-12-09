import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import application.About;
import application.Btn;
import application.Calendar;
import application.ClubScreen;
import application.Day;
import application.ManagerScreen;
import application.MatchPane;
import application.PlayerScreen;
import application.PlayerTeamSelection;
import application.StadiumScreen;
import application.Tables;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene  .media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import logic.Club;
import logic.Match;
import logic.Player;
import logic.PremierLeagueLogic;
import logic.Stadium;

public class Main extends Application{
	
	@Override
	public void start(Stage stage) {
		VBox root = new VBox();
		root.setPrefSize(700, 675);
		
		Media song = new Media(ClassLoader.getSystemResource("fifaSong.mp3").toString());
		MediaPlayer bgm = new MediaPlayer(song);
		bgm.setVolume(0.2);
		bgm.setAutoPlay(true);
		bgm.setCycleCount(MediaPlayer.INDEFINITE);
				
		PremierLeagueLogic logic = new PremierLeagueLogic();
		
		//Home
		Btn btn = new Btn();
		
		//Calendar
		Club c7 = new Club("EVE"); 
		Club c8 = new Club("BOU"); 
		Match match = new Match(c7,2, c8, 0, LocalDateTime.now());
		match.setStadium(new Stadium("Langear"));
		System.out.println(match.getStadium().getName());
		MatchPane m1 = new MatchPane(match);
		ArrayList<MatchPane> matches = new ArrayList<MatchPane>();
		matches.add(m1);
		Day day = new Day(LocalDate.now(), matches);
		ArrayList<Day> days = new ArrayList<Day>();
		days.add(day);
		Calendar calendar = new Calendar(days);
		/****************/
		
		// Tables
		Tables table = new Tables(logic.getPml().getStandings());
		About about = new About();
		
		//Club
		ClubScreen clubScreen = new ClubScreen();
		
		//Player
		PlayerTeamSelection playerTeamSelection = new PlayerTeamSelection();
		
		//Manager
		ManagerScreen managerscreen = new ManagerScreen(logic.getAllmng());
		
		//Stadium
		StadiumScreen stadiumScreen = new StadiumScreen(logic.getStadiums());
				
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
		
		//.......................................................//
		ImageView ars = playerTeamSelection.getArsenal();
		ars.setOnMouseClicked(e -> {
			ArrayList<Player> p = (new Player("ARS")).makeList();
			PlayerScreen ps = new PlayerScreen(p);
			root.getChildren().add(ps);
			root.getChildren().remove(playerTeamSelection);
		});
		ImageView che = playerTeamSelection.getChelsea();
		che.setOnMouseClicked(e -> {
			ArrayList<Player> p = (new Player("CHE")).makeList();
			PlayerScreen ps = new PlayerScreen(p);
			root.getChildren().add(ps);
			root.getChildren().remove(playerTeamSelection);
		});		
		ImageView spur = playerTeamSelection.getSpur();
		spur.setOnMouseClicked(e -> {
			ArrayList<Player> p = (new Player("TOT")).makeList();
			PlayerScreen ps = new PlayerScreen(p);
			root.getChildren().add(ps);
			root.getChildren().remove(playerTeamSelection);
		});		
		ImageView mci = playerTeamSelection.getMancity();
		mci.setOnMouseClicked(e -> {
			ArrayList<Player> p = (new Player("MCI")).makeList();
			PlayerScreen ps = new PlayerScreen(p);
			root.getChildren().add(ps);
			root.getChildren().remove(playerTeamSelection);
		});		
		ImageView mun = playerTeamSelection.getManu();
		mun.setOnMouseClicked(e -> {
			ArrayList<Player> p = (new Player("MUN")).makeList();
			PlayerScreen ps = new PlayerScreen(p);
			root.getChildren().add(ps);
			root.getChildren().remove(playerTeamSelection);
		});		
		ImageView liv = playerTeamSelection.getLiverpool();
		liv.setOnMouseClicked(e -> {
			ArrayList<Player> p = (new Player("LIV")).makeList();
			PlayerScreen ps = new PlayerScreen(p);
			root.getChildren().add(ps);
			root.getChildren().remove(playerTeamSelection);
		});
		//.......................................................//
		
		ImageView aboutBtn =  btn.getAboutBtn();
		aboutBtn.setOnMouseClicked(e -> {
			root.getChildren().add(about);
			root.getChildren().remove(btn);
		});
		
		ImageView refreeBtn =  btn.getRefreeBtn();
		refreeBtn.setOnMouseClicked(e -> {
//			root.getChildren().add(refree);
			root.getChildren().remove(btn);
		});
		
		ImageView stadiumBtn =  btn.getStadiumBtn();
		stadiumBtn.setOnMouseClicked(e -> {
			root.getChildren().add(stadiumScreen);
			root.getChildren().remove(btn);
		});
		
	//-------------------------------------------------------------
			// back home button
		
		ImageView cahomeBtn =  calendar.getGoHome();
		cahomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(calendar);
		});
		
//		ImageView clhomeBtn =  clubS.getGoHome();
//		clhomeBtn.setOnMouseClicked(e -> {
//			root.getChildren().add(btn);
//			root.getChildren().remove(clubS);
//		});
		
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
		
//		ImageView rhomeBtn =  refree.getGoHome();
//		rhomeBtn.setOnMouseClicked(e -> {
//			root.getChildren().add(btn);
//			root.getChildren().remove(refree);
//		});
		
//		ImageView shomeBtn =  stadium.getGoHome();
//		shomeBtn.setOnMouseClicked(e -> {
//			root.getChildren().add(btn);
//			root.getChildren().remove(stadium);
//		});
		
	//-------------------------------------------------------------
		
		root.getChildren().addAll(btn);
		
		root.setStyle("-fx-background-color: #EDEDED;");
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}
	

}
