package banky;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;

public class Withdraw implements ActionListener{

	JFrame f = new JFrame("BANKY");
    JLabel l2 = new JLabel();
    JTextField tf1 = new JTextField();
    JButton b1 = new JButton("SUBMIT");
	JButton b2 = new JButton("BACK");
	
	long acctno;
	int pin;
    
	Withdraw(long acctno,int pin){
		
		this.acctno = acctno;
		this.pin = pin;
		
		ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("banky/icons/bank.png"));
	    Image i1 = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT );
	    ImageIcon i2 = new ImageIcon(i1);
	    JLabel l1 = new JLabel();
	    
	    l1.setIcon(i2);
	    l1.setText("> WELCOME TO BANKY <");
	    l1.setIconTextGap(35);
		l1.setBounds(0,0,700,300);
		l1.setHorizontalTextPosition(JLabel.RIGHT);
		l1.setVerticalTextPosition(JLabel.CENTER);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setVerticalAlignment(JLabel.TOP);
		l1.setFont(new Font("Algerian",Font.BOLD,45));
		l1.setForeground(new Color(0xe6ac00));
		l1.setSize(850, 480);
		l1.setBackground(Color.BLACK);
		l1.setOpaque(true);
		
		tf1.setBounds(200, 200, 400, 30);
		tf1.setFont(new Font("System",Font.BOLD,20));
		tf1.setBackground(Color.WHITE);
		
		l2.setText("Enter withdrawal amount (Max limit Rs.10000):");
		l2.setFont(new Font("System",Font.BOLD,18));
		l2.setForeground(Color.WHITE);
		l2.setBounds(200, 100, 500, 100);
		
		b1.setBackground(Color.WHITE);
		b1.setFocusable(false);
		b1.setBounds(220, 350, 170, 40);
		b1.addActionListener(this);
		
		b2.setBackground(Color.WHITE);
		b2.setFocusable(false);
		b2.setBounds(420, 350, 170, 40);
		b2.addActionListener(this);
		
		f.setSize(850,480);
		f.setLayout(null);
		f.setResizable(false);
		f.setUndecorated(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(450,200);
		
		l1.add(b1);
		l1.add(b2);
		l1.add(tf1);
		l1.add(l2);
		f.add(l1);
		f.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		 try {
			  
			  if(e.getSource() == b1) {
				if(tf1.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "Enter the amount yoou want to withdraw!");
				}
				else {
					 String amount = tf1.getText();
				     Date date = new Date();
					 Connect c = new Connect();
					 ResultSet rs = c.s.executeQuery("select * from transaction where acct_no = '"+acctno+"' and (pin = '"+pin+"' or pin = 0)");
					 Double balance = 0.0;
					 while(rs.next()) {
						 if(rs.getString("type").equals("deposit")||rs.getString("type").equals("credited_t")) {
							 balance += Double.parseDouble(rs.getString("amount"));
						 }
						 else {
							 balance -= Double.parseDouble(rs.getString("amount"));
						 }
					 }
					 
					 if(balance < Double.parseDouble(amount)) {
						 
						 JOptionPane.showInternalMessageDialog(null, "Insufficient Balance!");
						 return;
						 
					 }
					 
				   	 c.s.executeUpdate("insert into transaction values('"+acctno+"','"+pin+"','withdraw','"+date+"','"+amount+"')");
				   	 JOptionPane.showInternalMessageDialog(null, "Rs."+amount+" withdrawn successfully !");
				   	 f.setVisible(false);
					 new Main_screen(acctno,pin);
				}
			 }
			 else if(e.getSource() == b2) {
				  f.setVisible(false);
				  new Main_screen(acctno,pin);
			 }
				  
		  }
		  catch(Exception E) {
				  
			  E.printStackTrace();
				  
	   }
		
	}

}
