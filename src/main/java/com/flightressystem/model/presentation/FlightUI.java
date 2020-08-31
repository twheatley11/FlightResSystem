package com.flightressystem.model.presentation;

import java.awt.EventQueue;

import java.awt.HeadlessException;

//import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;

public class FlightUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	/*private JLabel flightNumLbl = new JLabel("Flight Number");  
	private JLabel dLocationLbl = new JLabel("Departure Location");  	  
	private JLabel dMonthLbl = new JLabel("Departure Month");   		 
	private JLabel dDayLbl = new JLabel("Departure Day");     
	private JLabel dYearLbl = new JLabel("Departure Year");    
	private JLabel dTimeLbl = new JLabel("Departure Time"); 
	private JLabel aLocationLbl = new JLabel("Arrival Location");  	  
	private JLabel aMonthLbl = new JLabel("Arrival Month");   		 
	private JLabel aDayLbl = new JLabel("Arrival Day");     
	private JLabel aYearLbl = new JLabel("Arrival Year");    
	private JLabel aTimeLbl = new JLabel("Arrival Time"); 
	private JLabel flightCostLbl = new JLabel("Flight Cost");
	
	private JTextField flightNumFld = new JTextField(3);  
	private JTextField dLocationFld = new JTextField(10);  	  
	private JTextField dMonthFld = new JTextField(10);   		 
	private JTextField dDayFld = new JTextField(10);     
	private JTextField dYearFld = new JTextField(10);    
	private JTextField dTimeFld = new JTextField(10);; 
	private JTextField aLocationFld = new JTextField(10);  	  
	private JTextField aMonthFld = new JTextField(10);   		 
	private JTextField aDayFld = new JTextField(10);     
	private JTextField aYearFld = new JTextField(10);    
	private JTextField aTimeFld = new JTextField(10); 
	private JTextField flightCostFld = new JTextField(10);
	  
	private JButton createFlightBtn = new JButton("Create Flight");
	private JButton resetBtn = new JButton("Reset");*/
 

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
				FlightUI frame = new FlightUI();
				frame.setVisible(true);
				
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}




	public FlightUI() throws HeadlessException {
		super();
		
	}
	

}
