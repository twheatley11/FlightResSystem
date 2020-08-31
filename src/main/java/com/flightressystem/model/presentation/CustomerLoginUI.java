package com.flightressystem.model.presentation;

import com.flightressystem.model.business.CustomerLoginMgr;
import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.domain.CustomerLogin;
import com.flightressystem.model.exceptions.LoginNotFoundException;
import com.flightressystem.model.exceptions.ServiceLoadException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;

/**
 * @author Tasha Wheatley
 * @since 4/20/20
 */

public class CustomerLoginUI extends JInternalFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel usernameLbl = new JLabel("Username");
	private JLabel passwordLbl = new JLabel("Password");
	private JTextField usernameFld = new JTextField(10);
	private JPasswordField passwordFld = new JPasswordField(10);
	private JButton okayBtn = new JButton("Okay");
	private JButton cancelBtn = new JButton("Cancel");
	private JButton closeBtn = new JButton("Close");
	
	
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
				CustomerLoginUI frame = new CustomerLoginUI();
				frame.setVisible(true);  //makes the frame appear on the screen
				
				Customer customer = new Customer();
				customer.setLastName("Wheatley");
				customer.setFirstName("Tasha");
				customer.setUserName("twheatley");
				customer.setPassword("12345");
				customer.setEmailAddress("twheatley@regis.edu");
				customer.setAddress("1234 Main Street");
				customer.setCity("Denver");
				customer.setState("Colorado");
				customer.setZipCode(12345);
				customer.setCustID(11111);
				
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public CustomerLoginUI() throws HeadlessException {
		super();
		
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(500,250,200,120);  //sets the size and position of the frame
		setTitle("Customer Login");
		Container container = getContentPane();
		BorderLayout layout = new BorderLayout(5,5);
		
		container.setLayout(layout);
		JPanel panel1 = new JPanel();
		//panel1.setLayout(new GridLayout(2,1));
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));  //creates a box layout where the components are laid out vertically
		container.add(panel1, BorderLayout.WEST);  //Adds the new panel to the west layout constraint (left side of the container)
		
		

		panel1.add(usernameLbl);
		//creates an invisible component that the specified size 
		usernameLbl.setMaximumSize(new Dimension(usernameLbl.getMinimumSize().width, usernameLbl.getMinimumSize().height));
		panel1.add(passwordLbl);
		passwordLbl.setMaximumSize(new Dimension(passwordLbl.getMinimumSize().width, usernameLbl.getMinimumSize().height));
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS)); 
		container.add(panel2, BorderLayout.CENTER);   //Adds the new panel to the center layout constraint 
		panel2.add(usernameFld);
		usernameFld.setMaximumSize(new Dimension(100, usernameLbl.getMinimumSize().height));
		panel2.add(passwordFld);
		passwordFld.setMaximumSize(new Dimension(100, usernameLbl.getMinimumSize().height));
		
		
		JPanel panel3 = new JPanel();
		container.add(panel3, BorderLayout.SOUTH); //Adds the new panel to the south layout constraint (bottom of the container)
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));  //changes the layout of the south layout constraint to center the components
		panel3.setSize(getMaximumSize());
		panel3.add(okayBtn);
		panel3.add(cancelBtn);
		panel3.add(closeBtn);
		 
		okayBtn.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {	
				CustomerLogin custLogin = new CustomerLogin();
				custLogin.setUsername (usernameFld.getText());
				custLogin.setPassword (new String(passwordFld.getPassword()));
				CustomerLoginMgr custLoginMgr = new CustomerLoginMgr();
				try {
					custLoginMgr.create (custLogin);
					if(custLoginMgr.authenticate(custLogin)) {
						JOptionPane.showMessageDialog(null, "You have been authenticated");
					}
					else {
						System.out.println(custLogin.getUsername());
						JOptionPane.showMessageDialog(null, "Your login is incorrect");
					}
				} catch (ServiceLoadException | LoginNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			});
		
		//clears inputs from all of the fields
		cancelBtn.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				usernameFld.setText("");
				passwordFld.setText("");
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
