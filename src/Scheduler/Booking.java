package Scheduler;

import java.util.LinkedList;

public class Booking {
	private User user;
	private Space sp;
	private Interval i;
	private LinkedList<Space> spaces = new LinkedList<>();
	private Space approved = null;
	private Day day;
	public Booking() {
		this.user = null; }
	
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public Booking(User u) {
		this.user = u;
	}
	public Space getSpace() {
		return sp;
	}
	public void setSpace(Space sp) {
		this.sp = sp;
	}
	public Interval getInterval() {
		return i;
	}
	public void setInterval(Interval i) {
		this.i = i;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LinkedList<Space> getSpaces() {
		return spaces;
	}
	public void addSpace(Space space) {
		this.spaces.add(space);
	}
	public void setSpaces(LinkedList<Space> spaces) { this.spaces = spaces; }
	
	public boolean isApproved() {
		return approved != null;
	}
	public void setApproved(Space approved) {
		this.approved = approved;
	}
	public Space getApproved() {
		return this.approved;
	}
	public String toString() {
		return sp.getLocation()+","+day.toString()+","+i.toString()+" - "+user.toString();
	}
}
