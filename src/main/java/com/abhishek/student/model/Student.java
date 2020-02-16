package com.abhishek.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

//@Data
@Entity
public class Student {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id    
	Long Id;
	String name;
	String course;
	
	public Student() {
		super();
	}
	public Student(Long id, String name, String course) {
		super();
		Id = id;
		this.name = name;
		this.course = course;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
