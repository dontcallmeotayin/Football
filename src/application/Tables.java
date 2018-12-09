package application;

import java.util.ArrayList;

import javafx.beans.Observable;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
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
import logic.Club;
import logic.Competition;
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
		v.setPadding(new Insets(-10, 22, 0, 22));
		v.setSpacing(10);
		v.setStyle("-fx-background-color: #5D3761;"); // 5A335D , 6E4B71 , 5D3761
		
		this.std = std;
		
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
		pointCol.setSortType(TableColumn.SortType.DESCENDING);

		table.setPrefHeight(550);
		table.getColumns().addAll(posCol, clubCol, gameCol, winCol, drawCol, loseCol,
				gfCol, gaCol, gdCol, pointCol);
//		table.setStyle("-fx-background-color: #EDEDED;");
		
		// try to sort
//		Callback<Standings,Observable[]> cb =(Standings stock) -> new Observable[]{
//		        stock.percentChangeProperty(),
//		    };
//		SortedList<Standings> sortedItems = new SortedList<>( getDate(), 
//	      (Standings stan1, Standings stan2) -> {
//	          if( stan1.getPoints() < stan2.getPoints() ) {
//	              return -1;
//	          } else if( stan1.getPoints() > stan2.getPoints() ) {
//	              return 1;
//	          } else {
//	              return 0;
//	          }
//	      });
//		table.setItems(sortedItems);
//		sortedItems.comparatorProperty().bind(table.comparatorProperty());
		
		table.setItems(getDate());

		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(640);
		home.setLayoutY(10);
		
		v.getChildren().addAll(topic, table);
		this.getChildren().addAll(v, cup, cup2, home);
		
		table.setEditable(false);
	
	}
	
	public ObservableList<Standings> getDate() {
		return this.std;
	}
	
	public ImageView getGoHome() {
		return home;
	}
	
//	public ObservableList<Standings> getOrder() {
//		ObservableList<> oder = FXCollections.observableArrayList(
//			1,2,3
//		);
//		return oder;
//	}

}
