package logic;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javafx.util.Pair;

public class CsvBuilder {
	private ArrayList<CsvAvailable> data;
	private String csvFile;
	private CsvAvailable type;
	
	public CsvBuilder(CsvAvailable type) {
		this.csvFile = type.getCsv();
		data = new ArrayList<CsvAvailable>();
	}
	
	public ArrayList<CsvAvailable> makeList() {
	  BufferedReader br = null;
	  String line = "";
	  String cvsSplitBy = ",";
	
	  try {
	      br = new BufferedReader(new FileReader(this.csvFile));
	      while ((line = br.readLine()) != null) {
	          String[] csvdata = line.split(cvsSplitBy);
	          //----------------------
	          if(type instanceof Player) {
	    		  int num = Integer.parseInt(csvdata[0]);
	    		  String pos = csvdata[1];
	    		  String first = csvdata[2];
	    		  String last = csvdata[3];
	    		  String team = csvdata[4];
//	            String[] date = split[0].split("/");
//	            LocalDateTime start = LocalDateTime.of(Integer.valueOf(date[2]),Integer.valueOf(date[1]), Integer.valueOf(date[0]), 0, 0);
	    		  Player newdata = new Player(first, last, num, team, pos);
		          data.add(newdata);
	          }
	          if(type instanceof Match) {
	              Club h = new Club(csvdata[1]);
	              int hg = Integer.parseInt(csvdata[3]);
	              Club a = new Club(csvdata[2]);
	              int ag = Integer.parseInt(csvdata[4]);
	              String[] date = csvdata[0].split("/");
	              LocalDateTime start = LocalDateTime.of(Integer.valueOf(date[2]),Integer.valueOf(date[1]), Integer.valueOf(date[0]), 0, 0);
	              Match newdata = new Match(h,hg,a,ag,start);
		          data.add(newdata);
	          }
	          if(type instanceof Manager) {
	    		  String first = csvdata[0];
	    		  String last = csvdata[1];
	    		  String team = csvdata[2];
	    		  String s = csvdata[3];
	    		  int seasons = Integer.valueOf(s);
	    		  Manager newdata = new Manager(first,last,team,seasons);
	    		  data.add(newdata);
	          }
	          //----------------------
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
	  return this.data;
	}
	
}
