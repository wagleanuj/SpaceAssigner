package Scheduler;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Arrays;
import java.util.LinkedList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class UserBooking {

	private JFrame frame;
	private JTextField userName;
	private JTextField stdno;
	IntervalMapper im= new IntervalMapper();
	Space currentSpace=null;
	private JTextField startTime;
	private JTextField endTime;



	/**
	 * Launch the application.
	 */
	public static void main(String arg) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserBooking window = new UserBooking(arg);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserBooking(String location) {
		initialize(location);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String location) {
		frame = new JFrame();
		frame.setBounds(100, 100, 991, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		LinkedList<Space> availableSpaces=Test.scheduler.getAvailableSpaces();
		String b=Test.interval.getEnd();
		//LinkedList<Integer> aa=new LinkedList<Integer>();
		//LinkedList<Integer> bb=new LinkedList<Integer>();
		//int i=Integer.parseInt("a");
       // int j=Integer.parseInt("b");
       
		
		
		
		JList sundayList = new JList();
		DefaultListModel<String> sundayModel= new DefaultListModel<>();
		DefaultListModel<String> mondayModel= new DefaultListModel<>();
		DefaultListModel<String> tuesdayModel= new DefaultListModel<>();
		DefaultListModel<String> wednesdayModel= new DefaultListModel<>();
		DefaultListModel<String> thursdayModel= new DefaultListModel<>();
		DefaultListModel<String> fridayModel= new DefaultListModel<>();
		DefaultListModel<String> saturdayModel= new DefaultListModel<>();
		sundayList.setModel(sundayModel);
		
		sundayList.setBounds(31, 197, 125, 316);
		frame.getContentPane().add(sundayList);
		
		JList mondayList = new JList();
		mondayList.setModel(mondayModel);
		mondayList.setBounds(168, 197, 125, 316);
		frame.getContentPane().add(mondayList);
		
		JList wednesdayList = new JList();
		wednesdayList.setModel(wednesdayModel);
		wednesdayList.setBounds(442, 197, 125, 316);
		frame.getContentPane().add(wednesdayList);
		
		JList tuesdayList = new JList();
		tuesdayList.setModel(tuesdayModel);
		tuesdayList.setBounds(305, 197, 125, 316);
		frame.getContentPane().add(tuesdayList);
		
		JList fridayList = new JList();
		fridayList.setModel(fridayModel);
		fridayList.setBounds(716, 197, 125, 316);
		frame.getContentPane().add(fridayList);
		
		JList thursdayList = new JList();
		thursdayList.setModel(thursdayModel);
		thursdayList.setBounds(579, 197, 125, 316);
		
		frame.getContentPane().add(thursdayList);
		
		JLabel lblStartTime = new JLabel("Start Time");
		lblStartTime.setBounds(41, 526, 64, 16);
		frame.getContentPane().add(lblStartTime);
		
		JLabel lblEndTime = new JLabel("End Time");
		lblEndTime.setBounds(284, 526, 63, 16);
		frame.getContentPane().add(lblEndTime);
		
		JList saturdayList = new JList();
		saturdayList.setModel(saturdayModel);
		saturdayList.setBounds(848, 197, 125, 316);
		frame.getContentPane().add(saturdayList);
		LinkedList<String> hoursAllowed= new LinkedList<String>(Arrays.asList("1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 AM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM", "12 PM"));
		LinkedList<String>allowedStart= new LinkedList<String>();
		LinkedList<String>allowedEnd= new LinkedList<String>();
		
		for(Space s : availableSpaces) {
			if(s.getLocation().equals(location)) {
				 im=s.getTime();
				 currentSpace=s;
								
			}
		}
		IntervalMapper a=currentSpace.getTime();
		LinkedList<String>allowedEntries=new LinkedList<String>();

		if(a.getOneInterval()!=null)
		{
		String s1 = a.getOneInterval().getStart();
		String s2= a.getOneInterval().getEnd();
		System.out.println(s1);

		
		int st=hoursAllowed.indexOf(s1);
		int end =hoursAllowed.indexOf(s2);
		
		for (int j=st;j<=end;j++){
			allowedEntries.add(hoursAllowed.get(j));
		}
		String[] ss= new String[hoursAllowed.size()];
		
		}
		String[] ss= new String[hoursAllowed.size()];

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(allowedEntries.toArray(ss)));
		//"1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 AM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM", "12 PM"}));
		comboBox.setBounds(116, 525, 52, 27);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(allowedEntries.toArray(ss)));//"1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 AM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM", "12 PM"}));
		comboBox_1.setBounds(351, 522, 52, 27);
		frame.getContentPane().add(comboBox_1);
		

		fillModel(sundayModel,im.getIntervals(Day.SUNDAY),currentSpace);
		fillModel(mondayModel,im.getIntervals(Day.MONDAY),currentSpace);
		fillModel(tuesdayModel,im.getIntervals(Day.TUESDAY),currentSpace);
		fillModel(wednesdayModel,im.getIntervals(Day.WEDNESDAY),currentSpace);
		fillModel(thursdayModel,im.getIntervals(Day.THURSDAY),currentSpace);
		fillModel(fridayModel,im.getIntervals(Day.FRIDAY),currentSpace);
		fillModel(saturdayModel,im.getIntervals(Day.SATURDAY),currentSpace);
		
		
		
		
		
		JLabel lblPleaseSelectAll = new JLabel("Please select all the slots that you can take. The principal will choose which slot you will get.");
		lblPleaseSelectAll.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPleaseSelectAll.setBounds(110, 138, 839, 22);
		frame.getContentPane().add(lblPleaseSelectAll);
		
		JLabel lblBookSlots = new JLabel("Book Slots");
		lblBookSlots.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookSlots.setBounds(432, 64, 111, 16);
		frame.getContentPane().add(lblBookSlots);
		
		userName = new JTextField();
		userName.setBounds(106, 558, 116, 22);
		frame.getContentPane().add(userName);
		userName.setColumns(10);
		
		JLabel lblUsername = new JLabel("Name");
		lblUsername.setBounds(42, 561, 63, 16);
		frame.getContentPane().add(lblUsername);
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblLocation.setBounds(341, 103, 145, 32);
		frame.getContentPane().add(lblLocation);
		
		JLabel lblNewLabel = new JLabel(location);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(512, 103, 192, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(168, 93, 623, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Sunday");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(31, 168, 97, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMonday.setBounds(168, 168, 97, 16);
		frame.getContentPane().add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTuesday.setBounds(306, 168, 97, 16);
		frame.getContentPane().add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWednesday.setBounds(442, 168, 97, 16);
		frame.getContentPane().add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblThursday.setBounds(579, 169, 97, 16);
		frame.getContentPane().add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFriday.setBounds(716, 169, 97, 16);
		frame.getContentPane().add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSaturday.setBounds(852, 169, 97, 16);
		frame.getContentPane().add(lblSaturday);
		
		JLabel std = new JLabel("Student Number");
		std.setBounds(245, 561, 102, 16);
		frame.getContentPane().add(std);
		
		stdno = new JTextField();
		stdno.setBounds(359, 558, 116, 22);
		frame.getContentPane().add(stdno);
		stdno.setColumns(10);
		
		JButton btnRequest = new JButton("Request");
		btnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get all selected items
				//set requesting users
				//done
				String start = comboBox.getSelectedItem().toString();
				String end = comboBox_1.getSelectedItem().toString();
				Interval timerequested=new Interval(start,end);
				User u= new User(userName.getText(),Integer.parseInt(stdno.getText().toString()));
				fillIntervalRequesters(sundayList,im,Day.SUNDAY,u,currentSpace,timerequested);
				fillIntervalRequesters(mondayList,im,Day.MONDAY,u,currentSpace,timerequested);
				fillIntervalRequesters(tuesdayList,im,Day.TUESDAY,u,currentSpace,timerequested);
				fillIntervalRequesters(wednesdayList,im,Day.WEDNESDAY,u,currentSpace,timerequested);
				fillIntervalRequesters(thursdayList,im,Day.THURSDAY,u,currentSpace,timerequested);
				fillIntervalRequesters(fridayList,im,Day.FRIDAY,u,currentSpace,timerequested);
				fillIntervalRequesters(saturdayList,im,Day.SATURDAY,u,currentSpace,timerequested);
				
				int index=-1;
				for (int i=0;i<availableSpaces.size();i++) {
					if(availableSpaces.get(i).getLocation().equals(location)) {
						index=i;
					}
				}
				availableSpaces.get(index).setTime(im);;
				Test.scheduler.setAvailableSpaces(availableSpaces);
				
				
			

				
			}				
				
		});
		btnRequest.setBounds(31, 614, 97, 25);
		frame.getContentPane().add(btnRequest);
		
		JButton logout = new JButton("Logout");
		logout.setBounds(848, 24, 97, 25);
		frame.getContentPane().add(logout);
		
		
		
		
		
		JButton btnLogout = new JButton("Logout");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				frame.dispose();
			}
		});
				
	}
	public static void fillIntervalRequesters(JList jl,IntervalMapper im, Day day,User u,Space location, Interval ii) {
		int[] selected=jl.getSelectedIndices();
		LinkedList<Interval> sundayIntervals= im.getIntervals(day);
		for(int i:selected) {
			Booking b=new Booking(u);
			b.setInterval(sundayIntervals.get(i));
			b.setDay(day);
			b.setSpace(location);
			b.setInterval(ii);
			Test.scheduler.submitBookingForReview(b);
			sundayIntervals.get(i).addRequestingUser(u);			
		}
		
		im.setIntervals(day, sundayIntervals);
		System.out.println(im.getRequesters(day));
	}
	public static void fillModel(DefaultListModel<String> dl,LinkedList<Interval>i,Space sp) {
		LinkedList<String> availableMonths=sp.getAvailableMonths();
		String months=", ";
		for (String a:availableMonths) {
			months+=a+ " ";
		}
		
		for( Interval ii :i) {
			
			dl.addElement(ii.toString()+months);
		}
		
	}
}
