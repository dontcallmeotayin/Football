package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Refree extends Person implements CsvAvailable{
	private int matches = 0;
	private int red = 0;
	private int yellow = 0;
	
	public Refree() {
		super();
	}
	
	public Refree(String f, String l) {
		super(f, l);
	}
	
	public Refree(String f, String l, int m, int r, int y) {
		super(f, l);
		this.matches = m;
		this.red = r;
		this.yellow = y;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getYellow() {
		return yellow;
	}

	public void setYellow(int yellow) {
		this.yellow = yellow;
	}

	@Override
	public String getCsv() {
		return "refree.csv";
	}
	
	public ArrayList<Refree> makeList() {
		  BufferedReader br = null;
		  String line = "";
		  String cvsSplitBy = ",";
		  ArrayList<Refree> data = new ArrayList<Refree>();
		  try {
			  InputStream in = ClassLoader.getSystemResourceAsStream(this.getCsv());
		      br = new BufferedReader(new InputStreamReader(in));
		      while ((line = br.readLine()) != null) {
		          String[] csvdata = line.split(cvsSplitBy);
		          //----------------------
		    		  String first = csvdata[0];
		    		  String last = csvdata[1];
		    		  int g = Integer.parseInt(csvdata[2]);
		    		  int r = Integer.parseInt(csvdata[3]);
		    		  int y = Integer.parseInt(csvdata[4]);
		    		  Refree newdata = new Refree(first, last, g, r, y);
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
