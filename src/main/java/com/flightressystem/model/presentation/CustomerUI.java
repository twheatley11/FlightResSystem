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
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.flightressystem.model.business.CustomerMgr;
import com.flightressystem.model.domain.Customer;
import com.flightressystem.model.exceptions.InvalidCustomerException;
import com.flightressystem.model.exceptions.ServiceLoadException;

/**
 * @author Tasha Wheatley
 * @since 4/17/20
 */

public class CustomerUI extends JInternalFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel fNameLbl = new JLabel("First Name");
	private JLabel lNameLbl = new JLabel("Last Name");
	private JLabel usernameLbl = new JLabel("Username");
	private JLabel passwordLbl = new JLabel("Password");
	private JLabel addressLbl = new JLabel("Address");
	private JLabel cityLbl = new JLabel("City");
	private JLabel stateLbl = new JLabel("State");
	private JLabel zipcodeLbl = new JLabel("Zipcode");
	private JLabel emailLbl = new JLabel("Email");
	
	private JTextField fNameFld = new JTextField(10);
	private JTextField lNameFld = new JTextField(10);
	private JTextField usernameFld = new JTextField(10);
	private JPasswordField passwordFld = new JPasswordField(10);
	private JTextField addressFld = new JTextField(10);
	private JTextField cityFld = new JTextField(10);
	private JTextField stateFld = new JTextField(10);
	private JTextField zipcodeFld = new JTextField(10);
	private JTextField emailFld = new JTextField(10);
	
	private JButton createAccountBtn = new JButton("Create Account");
	private JButton resetBtn = new JButton("Reset");
	private JButton closeBtn = new JButton("Close");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
				CustomerUI frame = new CustomerUI();
				frame.setVisible(true);  //makes the frame appear on the screen
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CustomerUI() throws HeadlessException {
		super();
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		
		setBounds(500,100,300,284);  //sets the size and position of the frame
		setTitle("Create Customer Account ");
		Container container = getContentPane();
		BorderLayout layout = new BorderLayout(5,5);
		
		
		container.setLayout(layout);
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));  //creates a box layout where the components are laid out vertically
		container.add(panel1, BorderLayout.WEST);  //Adds the new panel to the west layout constraint (left side of the container)
		int verticalspace = 3;
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(fNameLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));  //creates an invisible component that the specified size 
		panel1.add(lNameLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(addressLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(cityLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(stateLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(zipcodeLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(emailLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(usernameLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(passwordLbl);
	
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
		container.add(panel2, BorderLayout.CENTER);   //Adds the new panel to the center layout constraint 
		int verticalspace2 = 3;
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel2.add(fNameFld);
		fNameFld.setMaximumSize(new Dimension(100, fNameLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(lNameFld);
		lNameFld.setMaximumSize(new Dimension(100, lNameLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(addressFld);
		addressFld.setMaximumSize(new Dimension(100, addressLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(cityFld);
		cityFld.setMaximumSize(new Dimension(100, cityLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(stateFld);
		stateFld.setMaximumSize(new Dimension(100, stateLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(zipcodeFld);
		zipcodeFld.setMaximumSize(new Dimension(100, zipcodeLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(emailFld);
		emailFld.setMaximumSize(new Dimension(200, emailLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(usernameFld);
		usernameFld.setMaximumSize(new Dimension(200, usernameLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(passwordFld);
		passwordFld.setMaximumSize(new Dimension(200, passwordLbl.getMinimumSize().height));
	
		JPanel panel3 = new JPanel();
		container.add(panel3, BorderLayout.SOUTH);  //Adds the new panel to the south layout constraint (bottom of the container)
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));  //changes the layout of the south layout constraint to center the components
		panel3.setSize(getMaximumSize());
		panel3.add(createAccountBtn);
		panel3.add(resetBtn);
		panel3.add(closeBtn);
		
			
		
		
		createAccountBtn.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				if(fNameFld.getText().contentEquals("") ||
						lNameFld.getText().contentEquals("") || 
						addressFld.getText().contentEquals("") ||
						cityFld.getText().contentEquals("") ||
						stateFld.getText().contentEquals("") ||
						zipcodeFld.getText().contentEquals("") ||
						emailFld.getText().contentEquals("") ||
						usernameFld.getText().contentEquals("") ||
						passwordFld.getPassword().length==0) {
					//displays the following message if any of the fields are empty
					JOptionPane.showMessageDialog(null, "Please enter the required information");
				}
				else {
					
				Customer customer = new Customer();
				customer.setFirstName(fNameFld.getText());
				customer.setLastName(lNameFld.getText());
				customer.setAddress(addressFld.getText());
				customer.setCity(cityFld.getText());
				customer.setState(stateFld.getText());
				customer.setZipCode(Integer.parseUnsignedInt(zipcodeFld.getText()));
				customer.setEmailAddress(emailFld.getText());
				customer.setUserName(usernameFld.getText());
				customer.setPassword (new String(passwordFld.getPassword()));
				
				CustomerMgr custMgr = new CustomerMgr();
				
				//Customer customer1 = new Customer();
												
				try {
					custMgr.create(customer);
					//customer1 = custMgr.get(customer.getUserName());
					JOptionPane.showMessageDialog(null, "Your account has been created" + customer);
					
				} catch (ServiceLoadException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidCustomerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			}
			});
			
		//clears inputs from all of the fields
		resetBtn.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				fNameFld.setText("");
				lNameFld.setText("");
				addressFld.setText("");
				cityFld.setText("");
				stateFld.setText("");
				zipcodeFld.setText("");
				emailFld.setText("");
				usernameFld.setText("");
				passwordFld.setText("");
				}
			});
		
		closeBtn.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				setVisible(false);
				}
			});
		
		
		//pack();
		setVisible(true);
		
		
	}
	
	
}
