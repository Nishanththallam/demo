package com.lti.jpademo.demo5jpabasics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")

public class Student {
	@Id
	@Column(name="stu_id")
	private int stuId;
	@Column(name="stu_name")
	private String stuName;
	@Column(name="score")
	private double score;

	public Student(int stuId, String stuName, double score) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.score = score;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", score=" + score + "]";
	}
	
}
