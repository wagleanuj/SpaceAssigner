package Scheduler;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
public class Space implements Serializable {
	private String location;
	private String semester;
	private User user = null;
	private IntervalMapper im;
	private LinkedList<String> availableMonths;
	public Space(){
		
	}
	public Space(String l, IntervalMapper c, String s) {
		this.location=l;
		this.im=c;
		this.semester=s;
		this.availableMonths=new LinkedList<String>();
	}
	public LinkedList<String> getAvailableMonths() {
		return availableMonths;
	}
	public void addAvailableMonth(String month) {
		this.availableMonths.add(month);
	}
	public void setAvailableMonths(LinkedList<String> availableMonths) {
		this.availableMonths = availableMonths;
	}
	public boolean isAvailable() {
		return this.user == null;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public IntervalMapper getTime() {
		return im;
	}
	public void setTime(IntervalMapper time) {
		this.im = time;
	}
	public void setUser(User u) { this.user = u; }
	public User getUser() { return this.user; }
	
	public String getSemester() { return this.semester; }
	public void setSemester(String s) { this.semester = s; } 
	
	public String toString() {
		return location + ", " + semester + ", " + im.toString();
	}
}
