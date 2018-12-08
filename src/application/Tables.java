package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import logic.Club;
import logic.Standings;

public class Tables extends Pane {
	
	private Label topic;
//	private Club club = new Club("ARS");
//	private Standings team = new Standings(club);
	private TableView<Standings> table;
	private ImageView cup;
	private ImageView cup2;
	
	public Tables() {
		VBox v = new VBox();
		v.setAlignment(Pos.CENTER);
		v.setPadding(new Insets(15, 22, 0, 22));
		v.setSpacing(10);
		
		cup = new ImageView(new Image(ClassLoader.getSystemResource("cup.png").toString()));
		cup.setFitHeight(50);
		cup.setFitWidth(50);
		cup.setLayoutX(180);
		cup.setLayoutY(20);
		
		cup2 = new ImageView(new Image(ClassLoader.getSystemResource("cup.png").toString()));
		cup2.setFitHeight(50);
		cup2.setFitWidth(50);
		cup2.setLayoutX(470);
		cup2.setLayoutY(20);
		
		topic = new Label("RANKING");
		topic.setFont(new Font(50));
		topic.setAlignment(Pos.TOP_LEFT);
		
		table = new TableView<Standings>();

		TableColumn posCol = new TableColumn("Pos");
		posCol.setPrefWidth(40);
		posCol.setSortType(TableColumn.SortType.ASCENDING);
		
		TableColumn<Standings, String> clubCol = new TableColumn("Club");
		clubCol.setPrefWidth(200);
		clubCol.setCellValueFactory(new PropertyValueFactory<>("team"));
		
		TableColumn<Standings, String> gameCol = new TableColumn("Pid");
		gameCol.setPrefWidth(50);
		gameCol.setCellValueFactory(new PropertyValueFactory<>("playedGames"));
		
		TableColumn<Standings, String> winCol = new TableColumn("W");
		winCol.setPrefWidth(50);
		winCol.setCellValueFactory(new PropertyValueFactory<>("win"));
		
		TableColumn<Standings, String> drawCol = new TableColumn("D");
		drawCol.setPrefWidth(50);
		drawCol.setCellValueFactory(new PropertyValueFactory<>("draw"));
		
		TableColumn<Standings, String> loseCol = new TableColumn("L");
		loseCol.setPrefWidth(50);
		loseCol.setCellValueFactory(new PropertyValueFactory<>("lose"));
		
		TableColumn<Standings, String> gfCol = new TableColumn("GF");
		gfCol.setPrefWidth(50);
		gfCol.setCellValueFactory(new PropertyValueFactory<>("gf"));
		
		TableColumn<Standings, String> gaCol = new TableColumn("GA");
		gaCol.setPrefWidth(50);
		gaCol.setCellValueFactory(new PropertyValueFactory<>("ga"));
		
		TableColumn<Standings, String> gdCol = new TableColumn("GD");
		gdCol.setPrefWidth(50);
		gdCol.setCellValueFactory(new PropertyValueFactory<>("gd"));
		
		TableColumn<Standings, String> pointCol = new TableColumn("Points");
		pointCol.setPrefWidth(64);
		pointCol.setCellValueFactory(new PropertyValueFactory<>("points"));
		pointCol.setSortType(TableColumn.SortType.DESCENDING);

		table.setItems(getDate());
		table.setPrefHeight(560);
		table.getColumns().addAll(posCol, clubCol, gameCol, winCol, drawCol, loseCol,
				gfCol, gaCol, gdCol, pointCol);
		
		v.getChildren().addAll(topic, table);
		this.getChildren().addAll(v, cup, cup2);
	
	}
	
	public ObservableList<Standings> getDate() {
		ObservableList<Standings> data = FXCollections.observableArrayList(
				new Standings(new Club("ARS"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("MCI"), 1, 2, 1, 1, 1, 1),
				new Standings(new Club("LIV"), 1, 1, 3, 1, 1, 1),
				new Standings(new Club("TOT"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("MUN"), 1, 1, 9, 1, 1, 1),
				new Standings(new Club("CHE"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("EVE"), 1, 4, 1, 1, 1, 1),
				new Standings(new Club("BOU"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("LEI"), 1, 3, 1, 1, 1, 1),
				new Standings(new Club("BHA"), 1, 3, 1, 1, 1, 1),
				new Standings(new Club("WAT"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("WOL"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("WHU"), 1, 4, 3, 1, 1, 1),
				new Standings(new Club("NEW"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("CRY"), 1, 8, 1, 1, 1, 1),
				new Standings(new Club("CAR"), 1, 1, 6, 1, 1, 1),
				new Standings(new Club("HUD"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("SOU"), 1, 2, 5, 1, 1, 1),
				new Standings(new Club("BUR"), 1, 1, 1, 1, 1, 1),
				new Standings(new Club("FUL"), 1, 1, 1, 1, 1, 1)
		);
		return data;
	}
	
//	public ObservableList<Standings> getOrder() {
//		ObservableList<> oder = FXCollections.observableArrayList(
//			1,2,3
//		);
//		return oder;
//	}

}
