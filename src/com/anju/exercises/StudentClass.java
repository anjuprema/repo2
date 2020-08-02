package com.anju.exercises;

public class StudentClass {
	protected int studentId;
	protected String studentName;
	protected String department;
	protected int rank;
	
	public StudentClass() {};
	
	public StudentClass(int id, String name, String dep, int rank) {
		this.studentId = id;
		this.studentName = name;
		this.department = dep;
		this.rank =rank;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
