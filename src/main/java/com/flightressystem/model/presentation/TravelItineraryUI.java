package com.flightressystem.model.presentation;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.flightressystem.model.business.TravelItineraryMgr;
import com.flightressystem.model.domain.TravelItinerary;
import com.flightressystem.model.exceptions.InvalidItineraryException;
import com.flightressystem.model.exceptions.ServiceLoadException;

public class TravelItineraryUI extends JInternalFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JLabel passNumLbl = new JLabel("Number of Passengers");
	private JLabel departureLbl = new JLabel("DEPARTURE:");
	private JLabel dLocationLbl = new JLabel("Location");
	private JLabel dMonthLbl = new JLabel("Month");
	private JLabel dDayLbl = new JLabel("Day");
	private JLabel dYearLbl = new JLabel("Year");
	private JLabel dTimeLbl = new JLabel("Time");
	private JLabel arrivalLbl = new JLabel("ARRIVAL:");
	private JLabel aLocationLbl = new JLabel("Location");
	private JLabel aMonthLbl = new JLabel("Month");
	private JLabel aDayLbl = new JLabel("Day");
	private JLabel aYearLbl = new JLabel("Year");
	private JLabel aTimeLbl = new JLabel("Time");
	
	private Integer passNum []= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private JComboBox<?> passNumFld = new JComboBox<Object>(passNum);
	private JRadioButton oneWayFld = new JRadioButton();
	private JRadioButton roundTripFld = new JRadioButton();
	private ButtonGroup G1 = new ButtonGroup();  // Declaration of object of ButtonGroup class. 
	private JTextField dLocationFld = new JTextField(10);
	private JTextField dMonthFld = new JTextField(10);
	private JTextField dDayFld = new JTextField(10);
	private JTextField dYearFld = new JTextField(10);
	private JTextField dTimeFld = new JTextField(10);
	private JTextField aLocationFld = new JTextField(10);
	private JTextField aMonthFld = new JTextField(10);
	private JTextField aDayFld = new JTextField(10);
	private JTextField aYearFld = new JTextField(10);
	private JTextField aTimeFld = new JTextField(10);
	
	private JButton searchBtn = new JButton("Search");
	private JButton resetBtn = new JButton("Reset");
	private JButton closeBtn = new JButton("Close");
	
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
				TravelItineraryUI frame = new TravelItineraryUI();
				frame.setVisible(true);  //makes the frame appear on the screen				
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public TravelItineraryUI() throws HeadlessException {
		super();
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(250,150,200,120);  //sets the size and position of the frame
		setTitle("Travel Itinerary");
		Container container = getContentPane();
		BorderLayout layout = new BorderLayout(5,5);
		
		container.setLayout(layout);
		JPanel panel1 = new JPanel();
		container.add(panel1, BorderLayout.NORTH); //Adds the new panel to the south layout constraint (bottom of the container)
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));  //changes the layout of the south layout constraint to center the components
		panel1.setSize(getMaximumSize());
		oneWayFld.setText("One-way");
		roundTripFld.setText("Roundtrip");
		panel1.add(oneWayFld);
		panel1.add(roundTripFld);
		G1.add(oneWayFld);
		G1.add(roundTripFld);
		panel1.add(Box.createRigidArea(new Dimension(120, 0))); //creates an invisible component that the specified size
		panel1.add(passNumLbl);
		panel1.add(passNumFld);
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));  //creates a box layout where the components are laid out vertically
		container.add(panel2, BorderLayout.WEST);  //Adds the new panel to the west layout constraint (left side of the container)
		
		int verticalSpace = 20;
		panel2.add(Box.createRigidArea(new Dimension(0, verticalSpace))); //creates an invisible component that the specified size
		
		JPanel panelD = new JPanel();
		panelD.setLayout(new FlowLayout(FlowLayout.LEFT));  //creates a box layout where the components are laid out vertically
		panel2.add(panelD);  //Adds the new panel to the west layout constraint(left side of the container) that has a vertical box layout
		panelD.add(departureLbl);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));  //creates a box layout where the components are laid out vertically
		panel2.add(panel3);  //Adds the new panel to the west layout constraint(left side of the container) that has a vertical box layout
		panel3.add(dLocationLbl);
		panel3.add(dLocationFld);
		panel3.add(dMonthLbl);
		panel3.add(dMonthFld);
		panel3.add(dDayLbl);
		panel3.add(dDayFld);
		panel3.add(dYearLbl);
		panel3.add(dYearFld);
		panel3.add(dTimeLbl);
		panel3.add(dTimeFld);
		
		panel2.add(Box.createRigidArea(new Dimension(0, verticalSpace))); //creates an invisible component that the specified size
		
		JPanel panelA = new JPanel();
		panelA.setLayout(new FlowLayout(FlowLayout.LEFT));  //creates a box layout where the components are laid out vertically
		panel2.add(panelA);  //Adds the new panel to the west layout constraint(left side of the container) that has a vertical box layout
		panelA.add(arrivalLbl);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.LEFT));  //creates a box layout where the components are laid out vertically
		panel2.add(panel4);  //Adds the new panel to the west layout constraint(left side of the container) that has a vertical box layout
		panel4.add(aLocationLbl);
		panel4.add(aLocationFld);
		panel4.add(aMonthLbl);
		panel4.add(aMonthFld);
		panel4.add(aDayLbl);
		panel4.add(aDayFld);
		panel4.add(aYearLbl);
		panel4.add(aYearFld);
		panel4.add(aTimeLbl);
		panel4.add(aTimeFld);
		
		panel2.add(Box.createRigidArea(new Dimension(0, 50))); //creates an invisible component that the specified size
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new FlowLayout(FlowLayout.CENTER));  //creates a box layout where the components are laid out vertically
		panel2.add(panel5);  //Adds the new panel to the west layout constraint(left side of the container) that has a vertical box layout
		panel5.add(searchBtn);
		panel5.add(resetBtn);
		panel5.add(closeBtn);
		
		searchBtn.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				if(dLocationFld.getText().contentEquals("") ||
						dMonthFld.getText().contentEquals("") ||
						dDayFld.getText().contentEquals("") ||
						dYearFld.getText().contentEquals("") ||
						dTimeFld.getText().contentEquals("") ||
						aLocationFld.getText().contentEquals("") ||
						aMonthFld.getText().contentEquals("") ||
						aDayFld.getText().contentEquals("") ||
						aYearFld.getText().contentEquals("") ||
						aTimeFld.getText().contentEquals("")||
						G1.isSelected(null)) {
					//displays the following message if any of the fields are empty
					JOptionPane.showMessageDialog(null, "Please enter the required information");
				}
				else {
				TravelItinerary custItin = new TravelItinerary();
				custItin.setOneWayTrip(oneWayFld.isSelected());
				custItin.setRoundTrip(roundTripFld.isSelected());
				custItin.setNumPassengers((Integer)passNumFld.getSelectedItem());
				custItin.setDepartureLocation(dLocationFld.getText());  //gets item from drop down list and converts it to a string
				custItin.setDepartureMonth(dMonthFld.getText());
				custItin.setDepartureDay(dDayFld.getText());
				custItin.setDepartureYear(dYearFld.getText());
				custItin.setDepartureTime(dTimeFld.getText());
				custItin.setArrivalLocation(aLocationFld.getText());  //gets item from drop down list and converts it to a string
				custItin.setArrivalMonth(aMonthFld.getText());
				custItin.setArrivalDay(aDayFld.getText());
				custItin.setArrivalYear(aYearFld.getText());
				custItin.setArrivalTime(aTimeFld.getText());
				
				TravelItineraryMgr travItinMgr = new TravelItineraryMgr();	
							
				try {
					travItinMgr.create(custItin);
					JOptionPane.showMessageDialog(null, "There are no available flights that match your search");	
				} catch (ServiceLoadException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidItineraryException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
			});
			
		//clears inputs from all of the fields
		resetBtn.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				G1.clearSelection();
				passNumFld.setSelectedIndex(0);
				dLocationFld.setText("");
				dMonthFld.setText("");
				dDayFld.setText("");
				dYearFld.setText("");
				dTimeFld.setText("");
				aLocationFld.setText("");
				aMonthFld.setText("");
				aDayFld.setText("");
				aYearFld.setText("");
				aTimeFld.setText("");
				
				}
			});
		
		
		closeBtn.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				setVisible(false);
				}
			});
		
		pack();
		setVisible(true);
	}
	

	
	

}
