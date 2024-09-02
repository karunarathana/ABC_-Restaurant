package com.abcrestaurent.model;

public class ReservationModel {
	private String branch;
	private String noOfGuest;
	private String date;
	private String time;
	private String nic;
	private String fName;
	private String pNumber;
	
	
	
	public ReservationModel(String branch, String noOfGuest, String date, String time, String nic, String fName,
			String pNumber) {
		super();
		this.branch = branch;
		this.noOfGuest = noOfGuest;
		this.date = date;
		this.time = time;
		this.nic = nic;
		this.fName = fName;
		this.pNumber = pNumber;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getNoOfGuest() {
		return String.valueOf(noOfGuest);
	}
	public void setNoOfGuest(String noOfGuest) {
		this.noOfGuest = noOfGuest;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
}
