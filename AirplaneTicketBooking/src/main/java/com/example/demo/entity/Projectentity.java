package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Projectentity {
	@Id
	private String airlineName;
	private String type;
	private String time;
	private String ArrivalTime;
	private String depactureTime;
	private int numberOfTickets;
	private int totalAmount;
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public String getDepactureTime() {
		return depactureTime;
	}
	public void setDepactureTime(String depactureTime) {
		this.depactureTime = depactureTime;
	}
	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Projectentity(String airlineName, String type, String time, String arrivalTime, String depactureTime,
			int numberOfTickets, int totalAmount) {
		super();
		this.airlineName = airlineName;
		this.type = type;
		this.time = time;
		ArrivalTime = arrivalTime;
		this.depactureTime = depactureTime;
		this.numberOfTickets = numberOfTickets;
		this.totalAmount = totalAmount;
	}
	public Projectentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
