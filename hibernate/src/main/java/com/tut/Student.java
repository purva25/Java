package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Student_Info")
public class Student {
	
	@Id
	private int stud_id;
	private String firstname;
	private String Surname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public Student(int stud_id, String firstname, String surname) {
		super();
		this.stud_id = stud_id;
		this.firstname = firstname;
		Surname = surname;
	}
	
	
}
