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
	private int gd = 0;
	
	public Standings(Club team) {
		this.team = team;
	}
	
	public Standings(Club team,int pg,int w,int l,int d,
			int gf, int ga) {
		this.team = team;
		this.playedGames = pg;
		this.win = w;
		this.lose = l;
		this.draw = d;
		this.gf = gf;
		this.ga = ga;
		this.gd = gf - ga;
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

	public void setPoints(int points) {
		this.points = points;
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

	public int getGd() {
		return gd;
	}

	public void setGd(int gd) {
		this.gd = gd;
	}

}
