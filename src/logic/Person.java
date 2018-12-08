package logic;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import javafx.scene.image.Image;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate bd;
	private String nationality;
	private Image image;
	private int age;
	
	public Person() {
		this.firstName = "yin";
		this.lastName = "";
		this.nationality = "none";
		this.bd = LocalDate.of(1998, Month.OCTOBER, 22);
		this.age = calAge();
	}
	
	public Person(String f,String l,String n,LocalDate d) {
		this.firstName = f;
		this.lastName = l;
		this.nationality = n;
		this.bd = d;
	}
	
	protected int calAge() {
		LocalDate today = LocalDate.now();
		int age = (int) ChronoUnit.YEARS.between(today, getBd());
		return age;
	}
	
	public String getName() {
		return getFirstName()+" "+getLastName();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBd() {
		return bd;
	}

	public void setBd(LocalDate bd) {
		this.bd = bd;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
