import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import application.About;
import application.Btn;
import application.Calendar;
import application.Day;
import application.MatchPane;
import application.PlayerPane;
import application.PlayerScreen;
import application.Tables;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Pair;
import logic.Club;
import logic.CsvAvailable;
import logic.Manager;
import logic.Match;
import logic.Person;
import logic.Player;
import logic.PremierLeagueLogic;
import logic.Refree;
import logic.Stadium;
import logic.Standings;

public class Main extends Application{

	private Standings data;
	private ArrayList<Day> days;
	private Club club;
	private Manager mng;
	private Player player;
	private Refree rf;
	
	@Override
	public void start(Stage stage) {
		VBox root = new VBox();
		root.setPrefSize(700, 675);
		
		Media song = new Media(ClassLoader.getSystemResource("fifaSong.mp3").toString());
		MediaPlayer bgm = new MediaPlayer(song);
		bgm.setVolume(0.2);
		bgm.setAutoPlay(true);
		bgm.setCycleCount(MediaPlayer.INDEFINITE);
				
//		Club ars = new Club("ARS");
//		Club che = new Club("CHE");
//		Pair<Club,Integer> a = new Pair<>(ars,1);
//		Pair<Club,Integer> c = new Pair<>(che,1);
//		Stadium stamford = new Stadium("stamford");
//		che.setStadium(stamford);
//		LocalDateTime date = LocalDateTime.now();
//		Match test = new Match(c,a,date);
//		MatchPane testpane = new MatchPane(test);
//		root.getChildren().add(testpane);

		/****************/
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
		PremierLeagueLogic logic = new PremierLeagueLogic();

		Tables table = new Tables(logic.getPml().getStandings());
		About about = new About();
		
		Btn btn = new Btn();

//		ArrayList<Player> players = new ArrayList<Player>();
//		Player p = new Player("Petr","Cech",1,"ARS","GOAL");
//		Player p2 = new Player("Hecter","Bellerin",2,"ARS","DEFENDER");
//		players.add(p); players.add(p2);
		PlayerScreen temp = new PlayerScreen(logic.getAllplayers());
				
		//-------------------------------------------------------------
		
		ImageView calendarBtn =  btn.getCalendarBtn();
		calendarBtn.setOnMouseClicked(e -> {
			root.getChildren().add(calendar);
			root.getChildren().remove(btn);
		});
		
		ImageView clubBtn =  btn.getClubBtn();
		clubBtn.setOnMouseClicked(e -> {
//			root.getChildren().add(clubS);
			root.getChildren().remove(btn);
		});
		
		ImageView tableBtn =  btn.getTableBtn();
		tableBtn.setOnMouseClicked(e -> {
			root.getChildren().add(table);
			root.getChildren().remove(btn);
		});
		
		ImageView managerBtn =  btn.getManagerBtn();
		managerBtn.setOnMouseClicked(e -> {
//			root.getChildren().add(manager);
			root.getChildren().remove(btn);
		});
		
		ImageView playerBtn =  btn.getPlayerBtn();
		playerBtn.setOnMouseClicked(e -> {
		/*******************************************/
			root.getChildren().add(temp);
			root.getChildren().remove(btn);
		});
		
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
		
//		ImageView mhomeBtn =  manager.getGoHome();
//		mhomeBtn.setOnMouseClicked(e -> {
//			root.getChildren().add(btn);
//			root.getChildren().remove(manager);
//		});
		
//		ImageView phomeBtn =  playerS.getGoHome();
//		phomeBtn.setOnMouseClicked(e -> {
//			root.getChildren().add(btn);
//			root.getChildren().remove(playerS);
//		});
		
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
