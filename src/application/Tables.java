package application;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Callback;
import logic.Standings;

public class Tables extends Pane {
	
	private Label topic;
//	private Club club = new Club("ARS");
//	private Standings team = new Standings(club);
	private TableView<Standings> table;
	private ImageView cup;
	private ImageView cup2;
	private ImageView home;
	private ObservableList<Standings> std;
	
	public Tables(ObservableList<Standings> std) {
		VBox v = new VBox();
		v.setPrefSize(700, 675);
		v.setAlignment(Pos.CENTER);
		v.setPadding(new Insets(-15, 22, 0, 22));
		v.setSpacing(10);
		v.setStyle("-fx-background-color: #643D68;"); // 5A335D , 6E4B71 , 5D3761
		
		this.std = std;
		
		cup = new ImageView(new Image(ClassLoader.getSystemResource("cup.png").toString()));
		cup.setFitHeight(50);
		cup.setFitWidth(50);
		cup.setLayoutX(180);
		cup.setLayoutY(22);
		
		cup2 = new ImageView(new Image(ClassLoader.getSystemResource("cup.png").toString()));
		cup2.setFitHeight(50);
		cup2.setFitWidth(50);
		cup2.setLayoutX(470);
		cup2.setLayoutY(22);
		
		topic = new Label("RANKING");
		topic.setFont(new Font(50));
		topic.setAlignment(Pos.TOP_LEFT);
		topic.setTextFill(Color.WHITE);
		
		table = new TableView<Standings>();

		TableColumn posCol = new TableColumn("Pos");
		posCol.setPrefWidth(40);
		// numbered row
		posCol.setCellValueFactory(new Callback<CellDataFeatures<Standings, Standings>, ObservableValue<Standings>>() {
            @Override public ObservableValue<Standings> call(CellDataFeatures<Standings, Standings> p) {
                return new ReadOnlyObjectWrapper(p.getValue());
            }
        });

        posCol.setCellFactory(new Callback<TableColumn<Standings, Standings>, TableCell<Standings, Standings>>() {
            @Override public TableCell<Standings, Standings> call(TableColumn<Standings, Standings> param) {
                return new TableCell<Standings, Standings>() {
                    @Override protected void updateItem(Standings item, boolean empty) {
                        super.updateItem(item, empty);

                        if (this.getTableRow() != null && item != null) {
                            setText(this.getTableRow().getIndex()+1+"");
                        } else {
                            setText("");
                        }
                    }
                };
            }
        });
        posCol.setSortable(false);
		
		
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
		pointCol.setSortable(true);
		pointCol.setSortType(TableColumn.SortType.DESCENDING);

		table.setPrefHeight(550);
		table.getColumns().addAll(posCol, clubCol, gameCol, winCol, drawCol, loseCol,
				gfCol, gaCol, gdCol, pointCol);
		table.getSortOrder().add(pointCol);
		
		table.setItems(getDate());

		Menu b = new Menu();
		home = b.getHome();
		home.setLayoutX(640);
		home.setLayoutY(615);
		home.setOnMouseEntered(e->{
			setCursor(javafx.scene.Cursor.HAND);
		});
		home.setOnMouseExited(e->{
			setCursor(javafx.scene.Cursor.DEFAULT);
		});

		
		v.getChildren().addAll(topic, table);
		this.getChildren().addAll(v, cup, cup2, home);
		
		table.setEditable(false);
	
	}
	
	public ObservableList<Standings> getDate() {
		return this.std;
//		table.sort();
	}
	
	public ImageView getGoHome() {
		return home;
	}
	
	public TableView<Standings> getTable() {
		return table;
	}
	
}

//	new Standings(new Club("LIV"), 16, 13, 3, 0, 34, 6),
//	new Standings(new Club("MCI"), 16, 13, 2, 1, 45, 9),
//	new Standings(new Club("TOT"), 16, 12, 0, 4, 30, 16),
//	new Standings(new Club("CHE"), 16, 10, 4, 2, 33, 13),
//	new Standings(new Club("ARS"), 16, 10, 4, 2, 35, 20),
//	new Standings(new Club("MUN"), 16, 7, 5, 4, 28, 26),
//	new Standings(new Club("EVE"), 15, 6, 5, 4, 21, 17),
//	new Standings(new Club("BOU"), 16, 7, 2, 7, 25, 26),
//	new Standings(new Club("LEI"), 16, 6, 4, 6, 21, 20),
//	new Standings(new Club("WHU"), 16, 6, 3, 7, 23, 25),
//	new Standings(new Club("BHA"), 16, 6, 3, 7, 19, 22),
//	new Standings(new Club("WAT"), 15, 6, 2, 7, 18, 21),
//	new Standings(new Club("WOL"), 15, 5, 4, 6, 15, 18),
//	new Standings(new Club("CAR"), 16, 4, 2, 10, 15, 30),
//	new Standings(new Club("NEW"), 15, 3, 4, 8, 12, 20),
//	new Standings(new Club("CRY"), 16, 3, 3, 10, 13, 23),
//	new Standings(new Club("BUR"), 16, 3, 3, 10, 15, 32),
//	new Standings(new Club("HUD"), 16, 2, 4, 10, 10, 27),
//	new Standings(new Club("SOU"), 16, 1, 6, 9, 13, 30),
//	new Standings(new Club("FUL"), 16, 2, 3, 11, 16, 40)
