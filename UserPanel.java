package Scheduler;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPanel window = new UserPanel();
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
	public UserPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1010, 692);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);



		
		
		JLabel lblScheduleViewer = new JLabel("Manage Booking");
		lblScheduleViewer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblScheduleViewer.setBounds(387, 17, 264, 40);
		frame.getContentPane().add(lblScheduleViewer);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.BOLD, 18));
		list.setModel(new AbstractListModel() {
			public int getSize() {
				return Test.scheduler.getAvailableSpaces().size();
			}
			public Object getElementAt(int index) {
				if (Test.scheduler.getAvailableSpaces().size() != 0) {
				    return Test.scheduler.getAvailableSpaces().get(index).toString();
				}
				return null;
			}
		});
		list.setBounds(26, 211, 944, 198);
		frame.getContentPane().add(list);
		
		JLabel lblAvailableTimes = new JLabel("Available Slots");
		lblAvailableTimes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAvailableTimes.setBounds(379, 182, 147, 16);
		frame.getContentPane().add(lblAvailableTimes);
		
		JLabel lblSelectOneOr = new JLabel("Please select the slots you want to book.\r\n\r\n");
		lblSelectOneOr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectOneOr.setBounds(324, 70, 612, 62);
		frame.getContentPane().add(lblSelectOneOr);
		
		JButton btnBook = new JButton("Book");
		btnBook.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSpace.main(null);
			}
		});
		btnBook.setBounds(342, 432, 265, 72);
		frame.getContentPane().add(btnBook);
		
		JButton btnLogout = new JButton("Sign Out");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				frame.dispose();
			}
		});
		btnLogout.setBounds(865, 17, 122, 35);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblReminderPleaseReturn = new JLabel("Reminder: Please return again to check if your requests have been accepted or rejected.");
		lblReminderPleaseReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblReminderPleaseReturn.setBounds(12, 508, 720, 62);
		frame.getContentPane().add(lblReminderPleaseReturn);
		
		JButton btnCheckBookingStatus = new JButton("Check Booking Status");
		btnCheckBookingStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CheckAcceptance.main(null);
			}
		});
		btnCheckBookingStatus.setBounds(758, 528, 212, 25);
		frame.getContentPane().add(btnCheckBookingStatus);
	}
}
