package com.bean;

public class Participant {
	int participantID;
	String firstName;
	String lastName;
	String email;
	int batchID;
	
	public Participant() {
		super();
		
	}

	public Participant(int participantID, String firstName, String lastName, String email, int batchID) {
		super();
		this.participantID = participantID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.batchID = batchID;
	}

	public int getParticipantID() {
		return participantID;
	}

	public void setParticipantID(int participantID) {
		this.participantID = participantID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBatchID() {
		return batchID;
	}

	public void setBatchID(int batchID) {
		this.batchID = batchID;
	}
	
	
	
	

}
