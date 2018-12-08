import java.time.LocalDateTime;
import application.MatchPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Pair;
import logic.Club;
import logic.Match;
import logic.Stadium;

public class Main extends Application{

	@Override
	public void start(Stage stage) {
		VBox root = new VBox();
		root.setPrefWidth(800);
		root.setPrefHeight(600);
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
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String [] args) {
		launch(args);
	}
	

}
