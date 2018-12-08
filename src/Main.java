import java.time.LocalDate;

import application.MatchPane;
import application.Tables;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Pair;
import logic.Club;
import logic.Match;
import logic.Stadium;
import logic.Standings;

public class Main extends Application{

	private Standings data;
	
	@Override
	public void start(Stage stage) {
		VBox root = new VBox();
<<<<<<< HEAD
		root.setPrefSize(700, 675);
		
||||||| merged common ancestors
=======
		root.setPrefWidth(800);
		root.setPrefHeight(600);
>>>>>>> 7caaaaa124de6dfc1ecc5012b39a7fe2a065a954
//		Club ars = new Club("ARS");
//		Club che = new Club("CHE");
//		Pair<Club,Integer> a = new Pair<>(ars,1);
//		Pair<Club,Integer> c = new Pair<>(che,1);
//		Stadium stamford = new Stadium("stamford");
//		che.setStadium(stamford);
//		LocalDate date = LocalDate.now().get;
//		Match test = new Match(c,a,date);
//		MatchPane testpane = new MatchPane(test);
//		root.getChildren().add(testpane);
		
		
		Tables table = new Tables();
		
		root.getChildren().addAll(table);
		
		Media song = new Media(ClassLoader.getSystemResource("fifaSong.mp3").toString());
		MediaPlayer bgm = new MediaPlayer(song);
		bgm.setVolume(0.2);
		bgm.setAutoPlay(true);
		bgm.setCycleCount(MediaPlayer.INDEFINITE);
		
		root.setStyle("-fx-background-color: #CB918B;");
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}
	

}
