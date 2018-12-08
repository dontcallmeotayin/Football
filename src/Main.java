import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import application.About;
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
		root.setPrefSize(700, 675);
		
//        String csvFile = "res/match.csv";
//        BufferedReader br = null;
//        String line = "";
//        String cvsSplitBy = ",";
//        
//    	ArrayList<Match> matches = new ArrayList<Match>();
//
//        try {
//            br = new BufferedReader(new FileReader(csvFile));
//            while ((line = br.readLine()) != null) {
//                String[] matchdata = line.split(cvsSplitBy);
//                Club h = new Club(matchdata[1]);
//                int hg = Integer.parseInt(matchdata[3]);
//                Pair<Club,Integer> home = new Pair<Club, Integer>(h, hg);
//                Club a = new Club(matchdata[2]);
//                Pair<Club,Integer> away = new Pair<Club, Integer>(h, Integer.valueOf(matchdata[4]));
//                String[] date = matchdata[0].split("/");
//                LocalDateTime start = LocalDateTime.of(Integer.valueOf(date[2]),Integer.valueOf(date[1]), Integer.valueOf(date[0]), 0, 0);
//                Match match = new Match(home, away, start);
//                matches.add(match);
//                System.out.println(match.getHomeTeam().getKey().getCode());
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        
//        for(int i=10;i<15;i++) {
//        	MatchPane matchpane = new MatchPane(matches.get(i));
//        	root.getChildren().add(matchpane);
//        }

		
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
		
		
//		Tables table = new Tables();
		About about = new About();
		
		root.getChildren().addAll(about);
		
		Media song = new Media(ClassLoader.getSystemResource("fifaSong.mp3").toString());
		MediaPlayer bgm = new MediaPlayer(song);
		bgm.setVolume(0.2);
		bgm.setAutoPlay(true);
		bgm.setCycleCount(MediaPlayer.INDEFINITE);
		
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
