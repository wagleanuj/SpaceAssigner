package Scheduler;

import java.awt.EventQueue;

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
		frame.setBounds(100, 100, 795, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Accepted Requests");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(22, 60, 160, 30);
		frame.getContentPane().add(label);
		
		JList list = new JList();
		list.setBounds(22, 92, 321, 198);
		frame.getContentPane().add(list);
		
		JLabel label_1 = new JLabel("Rejected Requests");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(385, 59, 199, 33);
		frame.getContentPane().add(label_1);
		
		JList list_1 = new JList();
		list_1.setBounds(385, 92, 359, 198);
		frame.getContentPane().add(list_1);
		
		JLabel lblCheckBookingStatus = new JLabel("Check Booking Status");
		lblCheckBookingStatus.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCheckBookingStatus.setBounds(257, 13, 296, 33);
		frame.getContentPane().add(lblCheckBookingStatus);
	}
}
