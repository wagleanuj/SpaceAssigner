package Scheduler;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Scheduler.AdminPanel;
import Scheduler.UserPanel;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserSelection.main(null);
				frame.dispose();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(379, 135, 97, 25);
		frame.getContentPane().add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 214, 671, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblSchedulingSystem = new JLabel("Scheduling System ");
		lblSchedulingSystem.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSchedulingSystem.setBounds(197, 18, 347, 56);
		frame.getContentPane().add(lblSchedulingSystem);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 87, 671, 9);
		frame.getContentPane().add(separator_1);
		
		JLabel lblLoginAsAdministrator = new JLabel("Login as Administrator");
		lblLoginAsAdministrator.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLoginAsAdministrator.setBounds(75, 229, 289, 28);
		frame.getContentPane().add(lblLoginAsAdministrator);
		
		JButton adminLoginbutton = new JButton("Login");
		adminLoginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminPanel.main(null);
				frame.dispose();
				
			}
		});
		adminLoginbutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		adminLoginbutton.setBounds(379, 231, 97, 25);
		frame.getContentPane().add(adminLoginbutton);
		
		JLabel lblLoginAsStudent = new JLabel("Login as Student\r\n");
		lblLoginAsStudent.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLoginAsStudent.setBounds(75, 133, 289, 28);
		frame.getContentPane().add(lblLoginAsStudent);
	}
}
