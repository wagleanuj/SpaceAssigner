package Scheduler;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class IntervalMapper {
	private HashMap<String,LinkedList<Interval>> schedule= new HashMap<String, LinkedList<Interval>>();
	

	public IntervalMapper() {
		this.schedule.put("Sunday", new LinkedList<Interval>());
		this.schedule.put("Monday", new LinkedList<Interval>());
		this.schedule.put("Tuesday", new LinkedList<Interval>());
		this.schedule.put("Wednesday", new LinkedList<Interval>());
		this.schedule.put("Thursday", new LinkedList<Interval>());
		this.schedule.put("Friday", new LinkedList<Interval>());
		this.schedule.put("Saturday", new LinkedList<Interval>());		
		
	}
	public void addInterval(Day day,Interval i)
	{
		LinkedList<Interval> old=schedule.get(day.toString());
		old.add(i);
		schedule.put(day.toString(), old);		
	}
	public LinkedList<Interval> getIntervals(Day day){
		return schedule.get(day.toString());
	}
	public void setIntervals(Day day, LinkedList<Interval>  l) {
		schedule.put(day.toString(), l);
	}
	public String toString() {
		String toreturn= "";
		for (Map.Entry<String, LinkedList<Interval>> entry : schedule.entrySet())
		{
		    if(!entry.getValue().isEmpty()) {
			  toreturn +=entry.getKey() + ":";

		    
		    for(Interval i :entry.getValue()) {
		    	
		    	toreturn+=i.toString();
		    	
		    }
		    }
		    toreturn+="\n";
		}
		return toreturn;
	}
	public void clearInterval(Day day) {
		schedule.put(day.toString(),new LinkedList<Interval>());
	}
	public String getRequesters(Day day) {
		LinkedList<Interval> intervals=getIntervals(day);
		String uu="";
		for (Interval i: intervals) {
			for (User u :i.getRequestingUsers()) {
				System.out.println(u.toString());
				uu+=uu.toString()+"\n";
			}
		}
		return uu;
				
	}


}
