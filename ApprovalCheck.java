package Scheduler;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ApprovalCheck {

	private JFrame frame;
	IntervalMapper im= new IntervalMapper();


	/**
	 * Launch the application.
	 */
	public static void main(String arg) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApprovalCheck window = new ApprovalCheck(arg);
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
	public ApprovalCheck(String location) {
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
		
		JList saturdayList = new JList();
		saturdayList.setModel(saturdayModel);
		saturdayList.setBounds(848, 197, 125, 316);
		frame.getContentPane().add(saturdayList);
		Space currentSpace=null;
		
		for(Space s : availableSpaces) {
			if(s.getLocation().equals(location)) {
				 im=s.getTime();
				 currentSpace=s;
								
			}
		}
		fillModel(sundayModel,im.getIntervals(Day.SUNDAY));
		fillModel(mondayModel,im.getIntervals(Day.MONDAY));
		fillModel(tuesdayModel,im.getIntervals(Day.TUESDAY));
		fillModel(wednesdayModel,im.getIntervals(Day.WEDNESDAY));
		fillModel(thursdayModel,im.getIntervals(Day.THURSDAY));
		fillModel(fridayModel,im.getIntervals(Day.FRIDAY));
		fillModel(saturdayModel,im.getIntervals(Day.SATURDAY));
		
		
		JLabel lblPleaseSelectAll = new JLabel("Please select all the slots that you want to accept or reject.");
		lblPleaseSelectAll.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPleaseSelectAll.setBounds(110, 138, 839, 22);
		frame.getContentPane().add(lblPleaseSelectAll);
		
		JLabel lblBookSlots = new JLabel("Approve Slots");
		lblBookSlots.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookSlots.setBounds(432, 64, 181, 26);
		frame.getContentPane().add(lblBookSlots);
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
		
		JButton btnRequest = new JButton("Accept");
		btnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get all selected items
				//set requesting users
				//done
				
				User u= new User(userName.getText(),Integer.parseInt(stdno.getText().toString()));
				fillIntervalRequesters(sundayList,im,Day.SUNDAY,u);
				fillIntervalRequesters(mondayList,im,Day.MONDAY,u);
				fillIntervalRequesters(tuesdayList,im,Day.TUESDAY,u);
				fillIntervalRequesters(wednesdayList,im,Day.WEDNESDAY,u);
				fillIntervalRequesters(thursdayList,im,Day.THURSDAY,u);
				fillIntervalRequesters(fridayList,im,Day.FRIDAY,u);
				fillIntervalRequesters(saturdayList,im,Day.SATURDAY,u);
				
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
		btnRequest.setBounds(31, 614, 125, 25);
		frame.getContentPane().add(btnRequest);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				frame.dispose();
			}
		});
		btnLogout.setBounds(852, 13, 97, 25);
		frame.getContentPane().add(btnLogout);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setBounds(168, 614, 125, 25);
		frame.getContentPane().add(btnReject);
		
		
	}
	public static void fillIntervalRequesters(JList jl,IntervalMapper im, Day day,User u) {
		int[] selected=jl.getSelectedIndices();
			
		LinkedList<Interval> sundayIntervals= im.getIntervals(day);

		for(int i:selected) {
			sundayIntervals.get(i).addRequestingUser(u);			
		}
		
		im.setIntervals(day, sundayIntervals);
		System.out.println(im.getRequesters(day));
	}
	public static void fillModel(DefaultListModel<String> dl,LinkedList<Interval>i) {
		for( Interval ii :i) {
			
			if(!ii.getRequestingUsers().isEmpty()) {
				for(User u :ii.getRequestingUsers()) {
					dl.addElement(ii.toString() +);
				}
			dl.addElement(ii.toString() +);
			}
		}
		
	}
	
}
