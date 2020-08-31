package com.flightressystem.model.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JDesktopPane theDesktop = new JDesktopPane();
	
	public static void main(String[] args) {
		new MainUI();
		
	}
	
	public MainUI() {
		super("Flight Reservation System");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBounds(500,250,0,0);  //sets the size and position of the frame
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().add(theDesktop);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu loginMenu = new JMenu("Customer Login");
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				}
			});
		JMenuItem loginItem = new JMenuItem("Login");
		loginItem.setMnemonic(KeyEvent.VK_1);
		loginItem.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				CustomerLoginUI custLoginUI = new CustomerLoginUI();
				custLoginUI.setVisible(true);
				theDesktop.add(custLoginUI);
				custLoginUI.toFront();
				
				}
			});
		loginMenu.add(loginItem );
		menuBar.add(loginMenu);
		loginMenu.add(exitItem);
		menuBar.add(loginMenu);
		
		JMenu cAccountMenu = new JMenu("Customer Account");
		JMenuItem cAccountItem = new JMenuItem("Create Account");
		cAccountItem.setMnemonic(KeyEvent.VK_1);
		cAccountItem.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				CustomerUI custUI = new CustomerUI();
				custUI.setVisible(true);
				theDesktop.add(custUI);
				custUI.toFront();
				}
			});
		JMenuItem ccItem = new JMenuItem("Credit Card");
		ccItem.setMnemonic(KeyEvent.VK_2);
		ccItem.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				CreditCardUI ccUI = new CreditCardUI();
				ccUI.setVisible(true);
				theDesktop.add(ccUI);
				ccUI.toFront();
				}
			});
		cAccountMenu.add(cAccountItem );
		cAccountMenu.add(ccItem );
		menuBar.add(cAccountMenu);
		
		JMenu travItinMenu = new JMenu("Travel Itinerary");
		JMenuItem travItinItem = new JMenuItem("Create Itinerary");
		travItinItem.setMnemonic(KeyEvent.VK_1);
		travItinItem.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				TravelItineraryUI travItinUI = new TravelItineraryUI();
				travItinUI.setVisible(true);
				theDesktop.add(travItinUI);
				travItinUI.toFront();
				}
			});
		travItinMenu.add(travItinItem );
		menuBar.add(travItinMenu);
		
		//pack();
		setVisible(true);
	}

	
	
}
