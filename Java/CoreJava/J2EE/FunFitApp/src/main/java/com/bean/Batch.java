package com.bean;

public class Batch {
	private int batchId;
    private String batchName;
    private TimeSlot timeSlot; // Use TimeSlot enum as the type for timeSlot

    // Constructor
    public Batch(int batchId, String batchName, TimeSlot timeSlot) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.timeSlot = timeSlot;
    }

    // Getters and Setters
    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }
}

