package com.exterro.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int studId;
	private String studName;
	private char studSection;
	private String result;
	public Student() {
		super();
	}
	
	public Student(int studId, String studName, char studSection) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studSection = studSection;
		
	}

	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public char getStudSection() {
		return studSection;
	}
	public void setStudSection(char studSection) {
		this.studSection = studSection;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studSection=" + studSection + ", result="
				+ result + "]";
	}
}
