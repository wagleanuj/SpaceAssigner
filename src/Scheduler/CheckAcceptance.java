package Scheduler;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

public class CheckAcceptance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckAcceptance window = new CheckAcceptance();
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
	public CheckAcceptance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 795, 772);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Accepted Requests");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(22, 60, 160, 30);
		frame.getContentPane().add(label);
		
		JList acceptedList = new JList();
		DefaultListModel dl= new DefaultListModel();
		DefaultListModel dll= new DefaultListModel();
		acceptedList.setModel(dl);
		for(Booking b : Test.scheduler.getAcceptedBookings()) {
			dl.addElement(b.toString());
			
		}
		
			
		acceptedList.setBounds(22, 92, 339, 633);
		frame.getContentPane().add(acceptedList);
		
		JLabel label_1 = new JLabel("Rejected Requests");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(385, 59, 199, 33);
		frame.getContentPane().add(label_1);
		
		JList rejectedList = new JList();
		rejectedList.setModel(dll);
		for(Booking bb : Test.scheduler.getRejectedBookings()) {
			dll.addElement(bb.toString());
			
		}
		
		rejectedList.setBounds(385, 92, 359, 633);
		frame.getContentPane().add(rejectedList);
		
		JLabel lblCheckBookingStatus = new JLabel("Check Booking Status");
		lblCheckBookingStatus.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCheckBookingStatus.setBounds(257, 13, 296, 33);
		frame.getContentPane().add(lblCheckBookingStatus);
	}
}
