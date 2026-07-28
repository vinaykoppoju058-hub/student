package com.student;

public class student {
	int ID;
	String name;
	String course;
	
	public student(int Id,String name,String course) {
		this.ID=Id;
		this.name = name;
		this.course=course;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	@Override
	public String toString() {
		return "student ID=" + ID +"\n"+ "name=" + name +"\n"+ "course=" + course + " ";
	}	
}

	

