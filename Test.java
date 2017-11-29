package Scheduler;

import java.util.LinkedList;

public class Test {
	public static Scheduler scheduler = new Scheduler();
	public static IntervalMapper im= new IntervalMapper();
	public static Interval interval= new Interval("5PM","6PM");
	
			
	public static void main(String args[]) {
		//im.addInterval(Day.MONDAY,interval);
		//Space sp=new Space("GYM",im,"Spring");
		//scheduler.addAvailableSpace(sp);
		Login.main(null);
	}
}
