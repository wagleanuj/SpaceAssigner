package Scheduler;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserSelection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSelection window = new UserSelection();
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
	public UserSelection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGym = new JButton("GYM");
		btnGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserBooking.main("GYM");
			}
		});
		btnGym.setBounds(12, 92, 145, 112);
		frame.getContentPane().add(btnGym);
		
		JButton btnStudyRoom = new JButton("STUDY ROOM");
		btnStudyRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserBooking.main("STUDY ROOM");

				
			}
		});
		btnStudyRoom.setBounds(275, 92, 145, 112);
		frame.getContentPane().add(btnStudyRoom);
		
		JButton btnCheckBookings = new JButton("Check Bookings");
		btnCheckBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckAcceptance.main(null);
				
			}
		});
		btnCheckBookings.setBounds(275, 24, 128, 25);
		frame.getContentPane().add(btnCheckBookings);
	}

}
