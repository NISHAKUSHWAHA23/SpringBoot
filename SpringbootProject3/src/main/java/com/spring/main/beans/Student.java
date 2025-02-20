package com.spring.main.beans;

public class Student {
	private String name;
	private int rollno;
	private float marks;
	public String getName() {
		return name;
	}
	public Student(String name,int rollno , float marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void displayDetails() {
		System.out.println("name : "+name);
		System.out.println("rollno : "+rollno);
		System.out.println("marks : "+marks);
	}
	

}
