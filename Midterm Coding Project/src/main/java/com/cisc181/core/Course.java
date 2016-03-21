package com.cisc181.core;
import java.util.UUID;

public class Course extends Semester{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	public void setCourseID(UUID courseID){
		CourseID = courseID;
	}
	public UUID getCourseID(){
		return CourseID;
	}
	public void setCourseName(String courseName){
		CourseName = courseName;
	}
	public String getCourseName(){
		return CourseName;
	}
	public void setGradePoint(int gradePoints){
		GradePoints = gradePoints;
	}
	public int getGradePoints(){
		return GradePoints;
	}

}
