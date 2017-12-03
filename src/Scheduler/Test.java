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
	
	public static Scheduler scheduler = new Scheduler();

	public static IntervalMapper im= new IntervalMapper();
	public static Interval interval= new Interval("5PM","6PM");
	
			
	public static void main(String args[]) {
		try {
		    FileInputStream myFileInputStream = new FileInputStream(
		    		new File("schd.txt"));
		    ObjectInputStream myObjectInputStream = new ObjectInputStream(myFileInputStream);
		    scheduler = (Scheduler) myObjectInputStream.readObject(); 
		    myObjectInputStream.close();
		}
		catch(Exception e) {
			
		}
			
	
		Login.main(null);
	}
}

	



