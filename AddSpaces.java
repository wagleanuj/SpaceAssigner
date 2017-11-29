package Scheduler;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JTextField;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JCheckBox;

public class AddSpaces {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSpaces window = new AddSpaces();
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
	public AddSpaces() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 741);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(109, 62, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Location");
		lblNewLabel.setBounds(41, 65, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 AM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM", "12 PM"}));
		comboBox.setBounds(109, 276, 57, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setBounds(41, 100, 56, 16);
		frame.getContentPane().add(lblSemester);  
		
		JRadioButton rdbtnSpring = new JRadioButton("Spring");
		rdbtnSpring.setBounds(109, 96, 127, 25);
		frame.getContentPane().add(rdbtnSpring);
		
		JRadioButton rdbtnWinter = new JRadioButton("Winter");
		rdbtnWinter.setBounds(240, 96, 127, 25);
		frame.getContentPane().add(rdbtnWinter);
		
		JRadioButton rdbtnFall = new JRadioButton("Fall");
		rdbtnFall.setBounds(371, 96, 127, 25);
		frame.getContentPane().add(rdbtnFall);
		
		ButtonGroup rgroup = new ButtonGroup();
		rgroup.add(rdbtnFall);
		rgroup.add(rdbtnWinter);
		rgroup.add(rdbtnSpring);
		
		JLabel lblStart = new JLabel("Start");
		lblStart.setBounds(41, 279, 56, 16);
		frame.getContentPane().add(lblStart);
		
		JLabel label = new JLabel("End");
		label.setBounds(200, 282, 56, 16);
		frame.getContentPane().add(label);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 AM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM", "12 PM"}));
		comboBox_2.setBounds(268, 279, 57, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel dayName = new JLabel("Days");
		dayName.setBounds(41, 306, 56, 16);
		frame.getContentPane().add(dayName);
		
		JCheckBox chckbcSunday = new JCheckBox("Sunday");
		chckbcSunday.setBounds(112, 310, 113, 25);
		frame.getContentPane().add(chckbcSunday);
		
		JCheckBox chckbxMonday = new JCheckBox("Monday");
		chckbxMonday.setBounds(112, 340, 113, 25);
		frame.getContentPane().add(chckbxMonday);
		
		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setBounds(112, 370, 113, 25);
		frame.getContentPane().add(chckbxTuesday);
		
		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(112, 400, 113, 25);
		frame.getContentPane().add(chckbxWednesday);
		
		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setBounds(112, 430, 113, 25);
		frame.getContentPane().add(chckbxThursday);
		
		JCheckBox chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(112, 460, 113, 25);
		frame.getContentPane().add(chckbxFriday);
		
		JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setBounds(112, 486, 113, 25);
		frame.getContentPane().add(chckbxSaturday);
		LinkedList<JCheckBox> dayBoxes= new LinkedList<JCheckBox>();
		dayBoxes.add(chckbcSunday);
		dayBoxes.add(chckbxMonday);
		dayBoxes.add(chckbxTuesday);
		dayBoxes.add(chckbxWednesday);
		dayBoxes.add(chckbxThursday);
		dayBoxes.add(chckbxFriday);
		dayBoxes.add(chckbxSaturday);
		JLabel lblAddASpace = new JLabel("Add A Space");
		lblAddASpace.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblAddASpace.setBounds(159, 13, 208, 36);
		frame.getContentPane().add(lblAddASpace);
		
		JCheckBox chckbxMay = new JCheckBox("May");
		chckbxMay.setBounds(109, 138, 113, 25);
		frame.getContentPane().add(chckbxMay);
		
		JCheckBox chckbxJun = new JCheckBox("Jun");
		chckbxJun.setBounds(109, 168, 113, 25);
		frame.getContentPane().add(chckbxJun);
		
		JCheckBox chckbxJul = new JCheckBox("Jul");
		chckbxJul.setBounds(109, 195, 113, 25);
		frame.getContentPane().add(chckbxJul);
		
		JCheckBox chckbxAug = new JCheckBox("Aug");
		chckbxAug.setBounds(109, 225, 113, 25);
		frame.getContentPane().add(chckbxAug);
		
		JCheckBox chckbxJan = new JCheckBox("Jan");
		chckbxJan.setBounds(234, 138, 113, 25);
		frame.getContentPane().add(chckbxJan);
		
		JCheckBox chckbxFeb = new JCheckBox("Feb");
		chckbxFeb.setBounds(234, 168, 113, 25);
		frame.getContentPane().add(chckbxFeb);
		
		JCheckBox chckbxMar = new JCheckBox("Mar");
		chckbxMar.setBounds(234, 195, 113, 25);
		frame.getContentPane().add(chckbxMar);
		
		JCheckBox chckbxApr = new JCheckBox("Apr");
		chckbxApr.setBounds(234, 225, 113, 25);
		frame.getContentPane().add(chckbxApr);
		
		JCheckBox chckbxSep = new JCheckBox("Sep");
		chckbxSep.setBounds(368, 138, 113, 25);
		frame.getContentPane().add(chckbxSep);
		
		JCheckBox chckbxOct = new JCheckBox("Oct");
		chckbxOct.setBounds(368, 168, 113, 25);
		frame.getContentPane().add(chckbxOct);
		
		JCheckBox chckbxNov = new JCheckBox("Nov");
		chckbxNov.setBounds(368, 195, 113, 25);
		frame.getContentPane().add(chckbxNov);
		
		JCheckBox chckbxDec = new JCheckBox("Dec");
		chckbxDec.setBounds(368, 225, 113, 25);
		frame.getContentPane().add(chckbxDec);
		LinkedList<JCheckBox> checkBoxesAll=new LinkedList<JCheckBox>();
		LinkedList<JCheckBox> checkboxesFall=new LinkedList<JCheckBox>();
		LinkedList<JCheckBox> checkboxesWinter=new LinkedList<JCheckBox>();
		
		checkBoxesAll.add(chckbxMay);
		checkBoxesAll.add(chckbxJun);
		checkBoxesAll.add(chckbxJul);
		checkBoxesAll.add(chckbxAug);
		
		checkBoxesAll.add(chckbxSep);
		checkBoxesAll.add(chckbxOct);
		checkBoxesAll.add(chckbxNov);
		checkBoxesAll.add(chckbxDec);
		
		checkBoxesAll.add(chckbxJan);
		checkBoxesAll.add(chckbxFeb);
		checkBoxesAll.add(chckbxMar);
		checkBoxesAll.add(chckbxApr);
		
		

		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(41, 532, 97, 25);
		frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String location = textField.getText();
				String start = comboBox.getSelectedItem().toString();
				String end = comboBox_2.getSelectedItem().toString();
				String semester = "";
				if (rdbtnWinter.isSelected()) { semester = "Winter"; }
				else if (rdbtnFall.isSelected()) { semester = "Fall"; }
				else if (rdbtnSpring.isSelected()){ semester = "Spring"; }
				IntervalMapper sched=new IntervalMapper();
				Interval time = new Interval(start, end);
				for(JCheckBox j :dayBoxes) {
					if(j.isSelected()) {
						sched.addInterval(Day.getDayEnum(j.getText()),time);
					}
					
				}
				LinkedList<String>availableMonths=new LinkedList<String>();
				for(JCheckBox jb:checkBoxesAll) {
					if(jb.isSelected()) {
						availableMonths.add(jb.getText());
									
					}
				}
				
				Space space = new Space(location, sched, semester);
				space.setAvailableMonths(availableMonths);
				Test.scheduler.addAvailableSpace(space);
				System.out.println(sched.toString());
				AdminPanel.main(null);
				
				
				frame.dispose();
			}
		});
		
		

		
		

		
		
		
		
	}
}
