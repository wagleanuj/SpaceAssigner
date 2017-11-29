
package Scheduler;
import java.awt.EventQueue;
import java.util.LinkedList;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel window = new AdminPanel();
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
	public AdminPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 981, 895);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblScheduleViewer = new JLabel("Administrator Panel");
		lblScheduleViewer.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblScheduleViewer.setBounds(351, 49, 262, 40);
		frame.getContentPane().add(lblScheduleViewer);
		JList list = new JList();
	    list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DefaultListModel dl= new DefaultListModel();
		list.setModel(dl);
		LinkedList<Booking> pending=Test.scheduler.getPendingBookings();
		for( Booking ii :pending) {
			dl.addElement(ii.toString());
		}
		list.setBounds(44, 470, 363, 295);
		frame.getContentPane().add(list);
		
		JLabel lblBookings = new JLabel(" Pending Requests");
		lblBookings.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBookings.setBounds(44, 425, 226, 32);
		frame.getContentPane().add(lblBookings);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] selected=list.getSelectedIndices();
				for(int i:selected) {					
					Test.scheduler.acceptBooking(Test.scheduler.getPendingBookings().get(i));
					dl.removeElementAt(i);

				}


			}
		});
		
		btnAccept.setBounds(54, 788, 97, 25);
		frame.getContentPane().add(btnAccept);
		
		JButton btnReject = new JButton("Reject");
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] selected=list.getSelectedIndices();
				for(int i:selected) {
					Test.scheduler.rejectBooking(Test.scheduler.getPendingBookings().get(i));
					dl.removeElementAt(i);
					
					
				}
			}
		});
		btnReject.setBounds(311, 788, 97, 25);
		frame.getContentPane().add(btnReject);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
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
		list_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		list_1.setBounds(443, 470, 479, 295);
		frame.getContentPane().add(list_1);
		
		JLabel lblAvailability = new JLabel("Slots Available");
		lblAvailability.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAvailability.setBounds(443, 433, 226, 16);
		frame.getContentPane().add(lblAvailability);
		
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSpaces.main(null);
				frame.dispose();
			}
		});
		button.setBounds(443, 788, 479, 25);
		frame.getContentPane().add(button);
		JButton btnLogout = new JButton("Sign Out");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				frame.dispose();
			}
		});
		btnLogout.setBounds(822, 57, 100, 25);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblViewSchedule = new JLabel("View Schedule");
		lblViewSchedule.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblViewSchedule.setBounds(371, 102, 162, 16);
		frame.getContentPane().add(lblViewSchedule);
		
		JButton btnGym = new JButton("GYM");
		btnGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<Space>spaces= Test.scheduler.getAvailableSpaces();
				boolean dou=false;

				for (Space c:spaces) {
					if(c.getLocation().equalsIgnoreCase("GYM")) {
					    JOptionPane.showMessageDialog(frame, c.getTime().toString());
					    dou=true;

					}
				}
				if(!dou) {
				    JOptionPane.showMessageDialog(frame,"No schedule has been set for this spot");

				}
			}
		});
		btnGym.setBounds(68, 159, 162, 110);
		frame.getContentPane().add(btnGym);
		
		JButton btnStudyRoom = new JButton("Study Room");
		btnStudyRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LinkedList<Space>spaces= Test.scheduler.getAvailableSpaces();
				boolean dou=false;
				for (Space c:spaces) {
					if(c.getLocation().equalsIgnoreCase("STUDY ROOM")) {
					    JOptionPane.showMessageDialog(frame, c.getTime().toString());
					    dou=true;
					}
					
				}
				if(!dou) {
				    JOptionPane.showMessageDialog(frame,"No schedule has been set for this spot");

				}
				
			}
		});
		btnStudyRoom.setBounds(760, 159, 162, 110);
		frame.getContentPane().add(btnStudyRoom);
	}
}
