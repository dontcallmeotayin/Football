package logic;

public class Standings {
	private Club team;
	private int playedGames = 0;
	private int win = 0;
	private int draw = 0;
	private int lose = 0;
	private int points = 0;
	private int gf = 0;
	private int ga = 0;
	private String gd = "";
	
	public Standings(Club team) {
		this.team = team;
	}
	
	public Standings(Club team,int pg,int w,int d,int l,int gf, int ga) {
		this.team = team;
		this.playedGames = pg;
		this.win = w;
		this.lose = l;
		this.draw = d;
		this.gf = gf;
		this.ga = ga;
		int diff = gf - ga;
		if(diff<0) {
			this.gd = String.valueOf(diff);
		}else {
			this.gd = "+"+String.valueOf(diff);
		}
		this.points = win*3 + draw;
	}

	public Club getTeam() {
		return team;
	}

	public void setTeam(Club team) {
		this.team = team;
	}

	public int getPlayedGames() {
		return playedGames;
	}

	public void setPlayedGames(int playedGames) {
		this.playedGames = playedGames;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getPoints() {
		return points;
	}

	public int getGf() {
		return gf;
	}

	public void setGf(int gf) {
		this.gf = gf;
	}

	public int getGa() {
		return ga;
	}

	public void setGa(int ga) {
		this.ga = ga;
	}

	public String getGd() {
		return gd;
	}

}
