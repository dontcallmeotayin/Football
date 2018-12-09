package application;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class About extends Pane{

	private ImageView lion;
	private Text head;
	private Text data;
	private Text data2;
	private Text data3;
	private ImageView photo1;
	private Text data4;
	private Text data5;
	private Text head2;
	private Text data6;
	private Text data7;
	private Text data8;
	private Text data9;
	private Text data10;
	private Text data11;
	private Text data12;
	private Text data13;
	private Text data14;
	private ImageView photo2;
	private Text data15;
	private Text data16;
	private Text data17;
	private Text data18;
	private ImageView home;
	private ImageView logo;
	private ImageView fb;
	private ImageView tw;
	private ImageView in;
	
	public About() {
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPrefSize(700, 675);
		
		Pane pane = new Pane();
		pane.setStyle("-fx-background-color: #35073A;");
		
		VBox v = new VBox();
		v.setAlignment(Pos.TOP_CENTER);
		v.setPadding(new Insets(-30,0,0,22));
		
		VBox vv = new VBox();
		vv.setAlignment(Pos.TOP_CENTER);
		vv.setStyle("-fx-background-color: #EDEDED;");
		vv.setPrefWidth(682);
		vv.setPrefHeight(140);
		
		lion = new ImageView(new Image(ClassLoader.getSystemResource("pl-large.png").toString()));
		lion.setFitHeight(200);
		lion.setFitWidth(530);
		
		head = new Text("Discover the origins and history of the top tier of English football");
		head.setFont(new Font(20));
		head.setFill(javafx.scene.paint.Color.WHITESMOKE);
		head.setLayoutX(50);
		head.setLayoutY(190);
		
		data = new Text("The 2017/18 season marked the 26th of the Premier League after its formation in 1992.");
		data.setFont(new Font(13));
		data.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data.setLayoutX(23);
		data.setLayoutY(230);
		
		data2 = new Text("After numerous discussions with football authorities, players and television broadcasters,\n"
				+ "the First Division clubs resigned from the Football League in May 1992 and the Premier League\n"
				+ "was formed with the inaugural campaign starting on Saturday 15 August of that year.");
		data2.setFont(new Font(13));
		data2.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data2.setLayoutX(23);
		data2.setLayoutY(259);
		
		data3 = new Text("Below, each of the 26 seasons has been charted with the story of how the titles were won\n"
				+ "and the players who starred. From 2011/12's incredible finale, to Arsenal's \"Invincibles\",\n"
				+ "as well as each of Manchester United's record 13 triumphs, find out more about the rich history\n"
				+ "of the Premier League.");
		data3.setFont(new Font(13));
		data3.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data3.setLayoutX(23);
		data3.setLayoutY(320);
		
		photo1 = new ImageView(new Image(ClassLoader.getSystemResource("pre-1.jpg").toString()));
		photo1.setFitHeight(300);
		photo1.setFitWidth(430);
		photo1.setLayoutX(130);
		photo1.setLayoutY(391);
		
		data4 = new Text("In the opening season of 1992/93, 22 clubs competed in the competition, with Brian Deane\n"
				+ "of Sheffield United scoring the first goal in what was known at the time as the FA Premier League.\n");
		data4.setFont(new Font(13));
		data4.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data4.setLayoutX(23);
		data4.setLayoutY(725);
		
		data5 = new Text("The inaugural members of the Premier League were: Arsenal, Aston Villa, Blackburn Rovers,\n"
				+ "Chelsea, Coventry City, Crystal Palace, Everton, Ipswich Town, Leeds United, Liverpool,\n"
				+ "Manchester City, Manchester United, Middlesbrough, Norwich City, Nottingham Forest,\n"
				+ "Oldham Athletic, Queens Park Rangers, Sheffield Utd, Sheffield Wednesday, Southampton,\n"
				+ "Tottenham Hotspur, and Wimbledon.");
		data5.setFont(new Font(13));
		data5.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data5.setLayoutX(23);
		data5.setLayoutY(772);
		
		head2 = new Text("Premier League Roll of Honour");
		head2.setFont(new Font(20));
		head2.setFill(javafx.scene.paint.Color.WHITESMOKE);
		head2.setLayoutX(50);
		head2.setLayoutY(890);
		
		data6 = new Text("A total of 49 clubs have played in the Premier League since its inception, with Arsenal, Chelsea, \n"
				+ "Everton, Liverpool, Man Utd, and Spurs participating in every campaign to date. Brighton & Hove Albion\n"
				+ "and Huddersfield Town are the most recent clubs to have played in the league.\n");
		data6.setFont(new Font(13));
		data6.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data6.setLayoutX(23);
		data6.setLayoutY(925);
		
		data7 = new Text("At the end of each season, the bottom three clubs are relegated, with three promoted clubs\n"
				+ "from the Football League's Championship replacing them. The only exception to this was in \n"
				+ "the 1994/95 season when the League decided to reduce the number of clubs to 20. As a result,\n"
				+ "Crystal Palace joined Norwich, Leicester City and Ipswich in being relegated from the Premier League\n"
				+ "at the end of the 1994/95 season, with only two clubs replacing them from Division One, \n"
				+ "as the Championship was known then.\n");
		data7.setFont(new Font(13));
		data7.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data7.setLayoutX(23);
		data7.setLayoutY(986);
		
		data8 = new Text("Apart from the opening campaign in 1992/93, every season of the Premier League has had a title  \n"
				+ "sponsor. From the 1993/94 season, England’s top flight was known as the FA Carling Premiership,\n"
				+ "before the sponsorship changed in 2001 to Barclaycard until 2004.\n");
		data8.setFont(new Font(13));
		data8.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data8.setLayoutX(23);
		data8.setLayoutY(1093);
		
		data9 = new Text("The title of the competition then changed to the FA Barclays Premiership, with this being amended to\n"
				+ "Barclays Premier League ahead of the 2007/08 campaign.\n");
		data9.setFont(new Font(13));
		data9.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data9.setLayoutX(23);
		data9.setLayoutY(1156);
		
		data10 = new Text("Season 2015/16 marked the final campaign of a title sponsor arrangement, with the competition name \n"
				+ "becoming Premier League from 2016/17.\n");
		data10.setFont(new Font(13));
		data10.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data10.setLayoutX(23);
		data10.setLayoutY(1205);
		
		data11 = new Text("Manchester United were the first winners of the competition, finishing 10 points clear of Aston Villa,\n"
				+ "and have been PL champions on 13 occasions in total. Blackburn won the title once, in 1994/95, while\n"
				+ "Arsenal triumphed in 1997/98, 2001/02 and 2003/04.\n");
		data11.setFont(new Font(13));
		data11.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data11.setLayoutX(23);
		data11.setLayoutY(1253);
		
		data12 = new Text("Chelsea became the fourth club to win the PL, in 2004/05, and have since gone on to claim the title \n"
				+ "four more times, 2005/06, 2009/10, 2014/15 and the most recent in 2016/17. Man City have won the title\n"
				+ "twice, securing the trophy in dramatic fashion in 2011/12 with a goal in stoppage time of the final day, \n"
				+ "and again in 2013/14.\n");
		data12.setFont(new Font(13));
		data12.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data12.setLayoutX(23);
		data12.setLayoutY(1317);
		
		data13 = new Text("Leicester are the latest and sixth club to win the Premier League, completing a remarkable title triumph\n"
				+ "a year after a successful battle against relegation.\n");
		data13.setFont(new Font(13));
		data13.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data13.setLayoutX(23);
		data13.setLayoutY(1395);
		
		data14 = new Text("The most successful manager in the competition is Sir Alex Ferguson who has guided Manchester United \n"
				+ "to all their Premier League successes. He also holds the record for being the longest serving manager\n"
				+ "in the Premier League, spending 21 years at Old Trafford since its inception in 1992 before retiring at the \n"
				+ "end of the 2012/13 season.\n");
		data14.setFont(new Font(13));
		data14.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data14.setLayoutX(23);
		data14.setLayoutY(1446);
		
		photo2 = new ImageView(new Image(ClassLoader.getSystemResource("pre-2.jpg").toString()));
		photo2.setFitHeight(300);
		photo2.setFitWidth(520);
		photo2.setLayoutX(80);
		photo2.setLayoutY(1520);
		
		data15 = new Text("Ryan Giggs participated in every title-winning year for Manchester United and the Welshman amassed\n"
				+ "to all their Premier League successes. He also holds the record for being the longest serving manager\n"
				+ "in the Premier League, spending 21 years at Old Trafford since its inception in 1992 before retiring at \n"
				+ "the end of the 2012/13 season.\n");
		data15.setFont(new Font(13));
		data15.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data15.setLayoutX(23);
		data15.setLayoutY(1857);
		
		data16 = new Text("Former Newcastle United, Blackburn Rovers and Southampton forward Alan Shearer is the Premier \n"
				+ "League top scorer with 260 goals and is one of only two players to surpass the 200 mark - along with \n"
				+ "Wayne Rooney.\n");
		data16.setFont(new Font(13));
		data16.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data16.setLayoutX(23);
		data16.setLayoutY(1935);
		
		data17 = new Text("From the 2001/02 season, clubs who finish in the top four places qualify for the UEFA Champions\n"
				+ "League, while the team ending the campaign in fifth get to play in the UEFA Europa League. Further\n"
				+ "places can become available to teams in sixth and seventh depending on whether teams in the top five\n"
				+ "win the League Cup or FA Cup.\n");
		data17.setFont(new Font(13));
		data17.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data17.setLayoutX(23);
		data17.setLayoutY(1997);
		
		data18 = new Text("There has been an increase in English representation in Europe since the start of the Premier League,\n"
				+ "when, in the opening season, only the champions qualified for the UEFA Champions League, with the \n"
				+ "second and third-placed clubs entering the UEFA Cup, as the UEFA Europa League was then known.\n"
				+ "\n\n\n\n\n\n\n\n\n\n");
		data18.setFont(new Font(13));
		data18.setFill(javafx.scene.paint.Color.WHITESMOKE);
		data18.setLayoutX(23);
		data18.setLayoutY(2074);
		
		this.setPrefSize(700, 675);
		
		logo = new ImageView(new Image(ClassLoader.getSystemResource("premier-logo.png").toString()));
		logo.setFitHeight(40);
		logo.setFitWidth(110);
		
		Hyperlink linklogo = new Hyperlink();
		linklogo.setGraphic(logo);
		linklogo.setOnAction(e -> {
			if(Desktop.isDesktopSupported())
		    {
		        try {
		            Desktop.getDesktop().browse(new URI("https://www.premierleague.com"));
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        } catch (URISyntaxException e1) {
		            e1.printStackTrace();
		        }
		    }
		});
		linklogo.setLayoutX(50);
		linklogo.setLayoutY(2210);
		
		fb = new ImageView(new Image(ClassLoader.getSystemResource("facebook.png").toString()));
		fb.setFitHeight(30);
		fb.setFitWidth(30);
		
		Hyperlink linkface = new Hyperlink();
		linkface.setGraphic(fb);
		linkface.setOnAction(e -> {
			if(Desktop.isDesktopSupported())
		    {
		        try {
		            Desktop.getDesktop().browse(new URI("https://www.facebook.com/premierleague"));
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        } catch (URISyntaxException e1) {
		            e1.printStackTrace();
		        }
		    }
		});
		linkface.setLayoutX(185);
		linkface.setLayoutY(2213);
		
		tw = new ImageView(new Image(ClassLoader.getSystemResource("twitter.png").toString()));
		tw.setFitHeight(30);
		tw.setFitWidth(30);
		
		Hyperlink linktwit = new Hyperlink();
		linktwit.setGraphic(tw);
		linktwit.setOnAction(e -> {
			if(Desktop.isDesktopSupported())
		    {
		        try {
		            Desktop.getDesktop().browse(new URI("https://twitter.com/premierleague"));
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        } catch (URISyntaxException e1) {
		            e1.printStackTrace();
		        }
		    }
		});
		linktwit.setLayoutX(250);
		linktwit.setLayoutY(2213);
		
		in = new ImageView(new Image(ClassLoader.getSystemResource("in.png").toString()));
		in.setFitHeight(30);
		in.setFitWidth(30);
		
		Hyperlink linkin = new Hyperlink();
		linkin.setGraphic(in);
		linkin.setOnAction(e -> {
			if(Desktop.isDesktopSupported())
		    {
		        try {
		            Desktop.getDesktop().browse(new URI("https://www.instagram.com/premierleague"));
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        } catch (URISyntaxException e1) {
		            e1.printStackTrace();
		        }
		    }
		});
		linkin.setLayoutX(318);
		linkin.setLayoutY(2213);
		
		Btn b = new Btn();
		home = b.getHome();
		home.setLayoutX(612);
		home.setLayoutY(2215);
		
		v.getChildren().addAll(lion);
		pane.getChildren().addAll(vv, v, head, data, data2, data3, photo1, data4, data5,
				head2, data6, data7, data8, data9, data10, data11, data12, data13, data14,
				photo2, data15, data16, data17, data18, home, linklogo, linkface, linktwit, linkin);
		scrollPane.setContent(pane);
		this.getChildren().addAll(scrollPane);
		// .addAll(vv, v, head, data, data2, data3, photo1;
		
	}
	
	public ImageView getGoHome() {
		return home;
	}
	
    private void openBrowser(final String url) {
//        getHostServices().showDocument(url);
    }
	
}
