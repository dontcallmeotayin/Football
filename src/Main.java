import application.About;
import application.Btn;
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
		root.setCursor(Cursor.DEFAULT);
		Media song = new Media(ClassLoader.getSystemResource("fifaSong.mp3").toString());
		MediaPlayer bgm = new MediaPlayer(song);
		bgm.setVolume(0.2);
		bgm.setAutoPlay(true);
		bgm.setCycleCount(MediaPlayer.INDEFINITE);
				
		PremierLeagueLogic logic = new PremierLeagueLogic();
		
		//Home
		Btn btn = new Btn();
		
				
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
		calendarBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		calendarBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView clubBtn =  btn.getClubBtn();
		clubBtn.setOnMouseClicked(e -> {
			root.getChildren().add(clubScreen);
			root.getChildren().remove(btn);
		});
		clubBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		clubBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView tableBtn =  btn.getTableBtn();
		tableBtn.setOnMouseClicked(e -> {
			root.getChildren().add(table);
			root.getChildren().remove(btn);
		});
		tableBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		tableBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView managerBtn =  btn.getManagerBtn();
		managerBtn.setOnMouseClicked(e -> {
			root.getChildren().add(managerscreen);
			root.getChildren().remove(btn);
		});
		managerBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		managerBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView playerBtn =  btn.getPlayerBtn();
		playerBtn.setOnMouseClicked(e -> {
		root.getChildren().add(playerTeamSelection);
		root.getChildren().remove(btn);
		});
		playerBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		playerBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
				
		ImageView aboutBtn =  btn.getAboutBtn();
		aboutBtn.setOnMouseClicked(e -> {
			root.getChildren().add(about);
			root.getChildren().remove(btn);
		});
		aboutBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		aboutBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView refreeBtn =  btn.getRefreeBtn();
		refreeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(refreeScreen);
			root.getChildren().remove(btn);
		});
		refreeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		refreeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView stadiumBtn =  btn.getStadiumBtn();
		stadiumBtn.setOnMouseClicked(e -> {
			root.getChildren().add(stadiumScreen);
			root.getChildren().remove(btn);
		});
		stadiumBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		stadiumBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView creditBtn =  btn.getCreditBtn();
		creditBtn.setOnMouseClicked(e -> {
			root.getChildren().add(credit);
			root.getChildren().remove(btn);
		});
		creditBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		creditBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
	//-------------------------------------------------------------
			// back home button
		
		ImageView cahomeBtn =  calendar.getGoHome();
		cahomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(calendar);
		});
		cahomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		cahomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView clhomeBtn =  clubScreen.getGoHome();
		clhomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(clubScreen);
		});
		clhomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		clhomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});

		ImageView thomeBtn =  table.getGoHome();
		thomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(table);
		});
		thomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		thomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView mhomeBtn =  managerscreen.getGoHome();
		mhomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(managerscreen);
		});
		mhomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		mhomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView phomeBtn =  playerTeamSelection.getHome();
		phomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(playerTeamSelection);
		});
		phomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		phomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
				
		ImageView ahomeBtn =  about.getGoHome();
		ahomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(about);
		});
		ahomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		ahomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView rhomeBtn =  refreeScreen.getHome();
		rhomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(refreeScreen);
		});
		rhomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		rhomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView shomeBtn =  stadiumScreen.getHome();
		shomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(stadiumScreen);
		});
		shomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		shomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
		ImageView crehomeBtn =  credit.getGoHome();
		crehomeBtn.setOnMouseClicked(e -> {
			root.getChildren().add(btn);
			root.getChildren().remove(credit);
		});
		crehomeBtn.setOnMouseEntered(e->{
			root.setCursor(javafx.scene.Cursor.HAND);
		});
		crehomeBtn.setOnMouseExited(e->{
			root.setCursor(javafx.scene.Cursor.DEFAULT);
		});
		
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
