package com.flightressystem.model.presentation;

import java.awt.BorderLayout
;

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
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.flightressystem.model.business.CreditCardMgr;
import com.flightressystem.model.domain.CreditCard;
import com.flightressystem.model.exceptions.InvalidCreditCardException;
import com.flightressystem.model.exceptions.ServiceLoadException;

/**
 * @author Tasha Wheatley
 * @since 4/17/20
 */

public class CreditCardUI extends JInternalFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel ccTypeLbl = new JLabel("Credit Card Type");
	private JLabel ccNumLbl = new JLabel("Credit Card Number");
	private JLabel ccExpLbl = new JLabel("Expiration Date");
	
	//creates a list of credit cards to be displayed in the drop down list
	private String ccTypes []= {"Visa", "Master Card", "Discover", "American Express", "Other"};
	private JComboBox<?> ccTypeFld = new JComboBox<Object>(ccTypes);
	private JTextField ccNumFld = new JTextField(16);
	private JTextField ccExpFld = new JTextField(4);
	
	private JButton saveBtn = new JButton("Save");
	private JButton resetBtn = new JButton("Reset");
	private JButton closeBtn = new JButton("Close");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
				CreditCardUI frame = new CreditCardUI();    
				frame.setVisible(true);  //makes the frame appear on the screen

				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CreditCardUI() throws HeadlessException {
		super();
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(500,250,250,150);  //sets the size and position of the frame
		setTitle("Credit Card Information");
		Container container = getContentPane();
		BorderLayout layout = new BorderLayout(5,5);
		
		container.setLayout(layout);
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));  //creates a box layout where the components are laid out vertically
		container.add(panel1, BorderLayout.WEST);  //Adds the new panel to the west layout constraint (left side of the container)
		int verticalspace = 8;
		panel1.add(Box.createRigidArea(new Dimension(0, 3)));  //creates an invisible component that the specified size 
		panel1.add(ccTypeLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(ccNumLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		panel1.add(ccExpLbl);
		panel1.add(Box.createRigidArea(new Dimension(0, verticalspace)));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
		container.add(panel2, BorderLayout.CENTER);   //Adds the new panel to the center layout constraint 
		int verticalspace2 = 3;
		
		panel2.add(ccTypeFld);
		ccTypeFld.setMaximumSize(new Dimension(100, ccTypeLbl.getMinimumSize().height));  //limits the components height
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));  //creates an invisible component that the specified size
		panel2.add(ccNumFld);
		ccNumFld.setMaximumSize(new Dimension(100, ccNumLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		panel2.add(ccExpFld);
		ccExpFld.setMaximumSize(new Dimension(100, ccExpLbl.getMinimumSize().height));
		panel2.add(Box.createRigidArea(new Dimension(0, verticalspace2)));
		
		JPanel panel3 = new JPanel();
		container.add(panel3, BorderLayout.SOUTH); //Adds the new panel to the south layout constraint (bottom of the container)
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));  //changes the layout of the south layout constraint to center the components
		panel3.setSize(getMaximumSize());
		panel3.add(saveBtn);
		panel3.add(resetBtn);
		panel3.add(closeBtn);
		
		
	
	saveBtn.addActionListener(new ActionListener () {
		public void actionPerformed (ActionEvent e) {
			if(ccNumFld.getText().contentEquals("") ||
					ccExpFld.getText().contentEquals("")) {
				//displays the following message if any of the fields are empty
				JOptionPane.showMessageDialog(null, "Please enter the required information");
			}
			else if (ccNumFld.getText().length() != 16) {
				JOptionPane.showMessageDialog(null, "Length of credit card number is not valid");
			}
			else if (ccExpFld.getText().length() != 4) {
				JOptionPane.showMessageDialog(null, "Length of credit card experiation date is not valid");
			}
			else {
			CreditCard custCC = new CreditCard();
			custCC.setCreditCardType(ccTypeFld.getSelectedItem().toString());  //gets item from drop down list and converts it to a string
			custCC.setCreditCardNum(ccNumFld.getText());
			custCC.setCreditCardExp(ccExpFld.getText());
			
			CreditCardMgr ccMgr = new CreditCardMgr();					
			try {
				ccMgr.create(custCC);
				JOptionPane.showMessageDialog(null, "Your credit card information has been saved");
			} catch (ServiceLoadException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InvalidCreditCardException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		}
		});
		
	//clears inputs from all of the fields
	resetBtn.addActionListener(new ActionListener () {
		public void actionPerformed (ActionEvent e) {
			ccNumFld.setText("");
			ccExpFld.setText("");
			}
		});
	
	closeBtn.addActionListener(new ActionListener () {
		public void actionPerformed (ActionEvent e) {
			setVisible(false);
			}
		});
	
	
	

}
}
