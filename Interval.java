package Scheduler;

import java.util.LinkedList;

public class Interval {
	private String start;
	private String end;
	private Boolean booked;
	private User bookedBy;
	private LinkedList<User> requestingUsers;
	public Interval(String s, String e) {
		this.start=s;
		this.end=e;	
		bookedBy=null;
		booked=false;
		requestingUsers=new LinkedList<User>();
		
		
	}
	
	
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String toString() {
		return " " + start + "-" + end;
	}
	public Boolean getBooked() {
		return booked;
	}
	public void setBookedBy(User u) {
		bookedBy=u;
	}
	public void addRequestingUser(User u) {
		requestingUsers.add(u);
	}
	public LinkedList<User> getRequestingUsers(){
		return requestingUsers;
	}
	
	

}
