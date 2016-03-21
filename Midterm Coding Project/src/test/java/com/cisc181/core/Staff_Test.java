package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import Exceptions.PersonException;

public class Staff_Test {
	
	static Staff Perfect;
	static Staff InvalidDOB;
	static Staff WrongNumber;
	static Staff StaffMember1;
	static Staff StaffMember2;
	static ArrayList<Staff> staff;

	@BeforeClass
	public static void setup() {
		staff = new ArrayList<Staff>();
		Perfect = new Staff("First", "Middle", "Last", new Date(), "Address", "(302)-312-9475", "1010", "staff@gmail.com", 0, 90000, null, eTitle.MR);
		InvalidDOB = new Staff("First", "Middle", "Last", new Date(), "Address", "(302)-312-9475", "1010", "staff@gmail.com", 0, 20000, null, null);
		WrongNumber = new Staff("First", "Middle", "Last", new Date(), "Address", "(302)-312-9475", "1010", "staff@gmail.com", 0, 120000, null, null);
		StaffMember1 = new Staff("First", "Middle", "Last", new Date(), "Address", "(302)-312-9475", "1010", "staff@gmail.com", 0, 68000, null, null);
		StaffMember2 = new Staff("First", "Middle", "Last", new Date(), "Address", "(302)-312-9475", "1010", "staff@gmail.com", 0, 47000, null, null);
		staff.add(Perfect);
		staff.add(InvalidDOB);
		staff.add(WrongNumber);
		staff.add(StaffMember1);
		staff.add(StaffMember2);
	}
	@Test
	public void CorrectNumberTest() throws PersonException{
		WrongNumber.setPhone("(302)-312-9475");
	}
	
	@Test
	(expected = PersonException.class)
	public void WrongNumberTest() throws PersonException{
		WrongNumber.setPhone("(312)-302-5749");
	}
	@Test
	public void SalaryTest() {
		double AverageSalary = ((90000 + 20000 +120000 + 68000 + 47000)/5);
		double total = 0;
		for (Staff s: staff)
			total += s.getSalary();
		double actualAverage = total/staff.size();
		assertEquals(AverageSalary,actualAverage, .1);
	}	
	
	@Test
	(expected = PersonException.class)
	public void invalidAgeTest() throws PersonException{
		Calendar newCal =  Calendar.getInstance();
		newCal.set(Calendar.YEAR, 1776);
		Date newDate = newCal.getTime();
		
		InvalidDOB.setDOB(newDate);
	}
	
	

}