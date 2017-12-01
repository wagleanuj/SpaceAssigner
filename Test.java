package Scheduler;

import java.beans.XMLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Test {
	public static Scheduler scheduler = readObjectFromFile();

	public static IntervalMapper im= new IntervalMapper();
	public static Interval interval= new Interval("5PM","6PM");
	
			
	public static void main(String args[]) {
		//im.addInterval(Day.MONDAY,interval);
		//Space sp=new Space("GYM",im,"Spring");
		//scheduler.addAvailableSpace(sp);
		Login.main(null);
	}
	public static void writeObjectToFile(Scheduler scheduler) {
		try {
		   FileOutputStream myFileOutputStream = new FileOutputStream(
				   new File("data.txt"));
		   ObjectOutputStream myObjectOutputStream = new ObjectOutputStream(myFileOutputStream);
		   myObjectOutputStream.writeObject(Test.scheduler);
		   myObjectOutputStream.close();
		}
		catch (Exception e) { System.out.println(e.toString()); }
	}
	
	public static Scheduler readObjectFromFile() {
		try {
		    FileInputStream myFileInputStream = new FileInputStream(
		    		new File("data.txt"));
		    ObjectInputStream myObjectInputStream = new ObjectInputStream(myFileInputStream);
		    Scheduler schedulerObj = (Scheduler) myObjectInputStream.readObject(); 
		    myObjectInputStream.close();
		    return schedulerObj;
		}
		catch (Exception e) { return new Scheduler(); }
	}
}


