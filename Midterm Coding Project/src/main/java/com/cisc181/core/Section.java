package com.cisc181.core;
import java.util.UUID;

public class Section extends Course{
	private UUID SectionID;
	private int RoomID;
	public void setSectionID(UUID sectionID){
		SectionID = sectionID;
	}
	public UUID getSectionID(){
		return SectionID;
	}
	public void setRoomID(int roomID){
		RoomID = roomID;
	}
	public int getRoomID(){
		return RoomID;
	}

}
