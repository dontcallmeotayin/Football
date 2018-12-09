package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Person implements CsvAvailable {
	private int seasons = 0;
	private String team;
	
	public Manager() {
		super();
//		this.setAge(calAge());
	}
	
	public Manager(String f, String l) {
		super(f, l);
//		this.setAge(calAge());
	}
	
	public Manager(String f, String l,String t,int s) {
		super(f, l);
//		this.setAge(calAge());
		this.seasons = s;
		this.team = t;
		setImage(team.toLowerCase()+"0m.png");
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getCsv() {
		return "res/Manager.csv";
	}
	
	public ArrayList<Manager> makeList() {
		  BufferedReader br = null;
		  String line = "";
		  String cvsSplitBy = ",";
		  ArrayList<Manager> data = new ArrayList<Manager>();
		  try {
		      br = new BufferedReader(new FileReader(this.getCsv()));
		      while ((line = br.readLine()) != null) {
		          String[] csvdata = line.split(cvsSplitBy);
		          String first = csvdata[0];
	    		  String last = csvdata[1];
	    		  String team = csvdata[2];
	    		  String s = csvdata[3];
	    		  int seasons = Integer.valueOf(s);
	    		  Manager newdata = new Manager(first,last,team,seasons);
	    		  data.add(newdata);
		      }
		   } catch (FileNotFoundException e) {
			      e.printStackTrace();
		   } catch (IOException e) {
			      e.printStackTrace();
		   } finally {
			    if (br != null) {
			        try {
			            br.close();
			         } catch (IOException e) {
			            e.printStackTrace();
			         }
			    }
			 }
		  return data;
		}



}
