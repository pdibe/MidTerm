package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {
	private UUID SemesterID;
	private Date StartDate; 
	private Date EndDate;
	
	public void setSemesterID(UUID semesterID){
		SemesterID = semesterID;
	}
	public UUID getSemesterID(){
		return SemesterID;
	}
	public void setStartDate(Date startDate){
		StartDate = startDate;
	}
	public Date getStartDate(){
		return StartDate;
	}
	public void setEndDate(Date endDate){
		EndDate = endDate;
	}
	public Date getEndDate(){
		return EndDate;
	}

}
