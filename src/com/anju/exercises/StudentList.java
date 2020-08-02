package com.anju.exercises;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentList {
	
	public static void main (String args[]) throws IOException{
		List <StudentClass> sl = new ArrayList<StudentClass>();
		StudentClass sc1 = new StudentClass(1000, "Anju", "IT" ,3);
		StudentClass sc2 = new StudentClass(1200, "Jiya", "Music" ,1);
		StudentClass sc3 = new StudentClass(1033, "Priya", "Literature" ,13);
		StudentClass sc4 = new StudentClass(1290, "Sam", "IT" ,30);

		sl.add(sc1);
		sl.add(sc2);
		sl.add(sc3);
		sl.add(sc4);
		
		for(StudentClass student : sl) {
			System.out.println("Student Id:"+student.getStudentId()+", Student Name:"+student.getStudentName()+
					", Department:"+student.getDepartment()+", Rank:"+student.getRank());
		}
	}
	
}
