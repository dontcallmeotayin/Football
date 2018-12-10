package logic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person extends IncludeImage {
	private String firstName;
	private String lastName;
	private LocalDate bd;
	private int age;
	
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.bd = LocalDate.now();
		this.age = calAge();
	}
		
	public Person(String f,String l) {
		this.firstName = f;
		this.lastName = l;
		this.bd = LocalDate.now();
		this.age = calAge();
	}
	
	public Person(String f,String l,LocalDate bd) {
		this.firstName = "";
		this.lastName = "";
		this.bd = bd;
		this.age = calAge();
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	

}
