package banky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Change_pin implements ActionListener {

	JFrame f = new JFrame("BANKY");
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JPasswordField tf1 = new JPasswordField();
    JPasswordField tf2 = new JPasswordField();
    JButton b1 = new JButton("SUBMIT");
	JButton b2 = new JButton("BACK");
	
	long acctno;
	int pin;
    
	Change_pin(long acctno,int pin){
		
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
		

		l2.setText("Enter New Pin :");
		l2.setFont(new Font("System",Font.BOLD,20));
		l2.setForeground(Color.WHITE);
		l2.setBounds(200, 100, 200, 60);
		
		l3.setText("Re-enter New Pin:");
		l3.setFont(new Font("System",Font.BOLD,20));
		l3.setForeground(Color.WHITE);
		l3.setBounds(200, 200, 400, 60);
		
		tf1.setBounds(200, 150, 200, 30);
		tf1.setFont(new Font("System",Font.BOLD,20));
		tf1.setBackground(Color.WHITE);
		
		tf2.setBounds(200, 250, 200, 30);
		tf2.setFont(new Font("System",Font.BOLD,20));
		tf2.setBackground(Color.WHITE);
		
		b1.setBackground(Color.WHITE);
		b1.setFocusable(false);
		b1.setBounds(320, 350, 170, 40);
		b1.addActionListener(this);
		
		b2.setBackground(Color.WHITE);
		b2.setFocusable(false);
		b2.setBounds(520, 350, 170, 40);
		b2.addActionListener(this);
		
		f.setSize(850,480);
		f.setLayout(null);
		f.setResizable(false);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(450,200);
		
		l1.add(tf1); 
		l1.add(tf2);
		l1.add(b1);
		l1.add(b2);
		l1.add(l2);
		l1.add(l3);
		f.add(l1);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	     
		 try {
			  
			  if(e.getSource() == b1) {
				  
				if(tf1.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "Enter new Pin !");
				}
				else if(tf2.getText().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "Re-enter the Pin !");
				}
				
				String p1 = tf1.getText();
				String p2 = tf2.getText();
				
				if(!p1.equals(p2)) {
					JOptionPane.showInternalMessageDialog(null, "The Pin doesn't match !");
				}
				
				Connect c = new Connect();
				c.s.executeUpdate("update transaction set pin = '"+p1+"' where acct_no = '"+acctno+"' and pin = '"+pin+"'");
				c.s.executeUpdate("update login set pin = '"+p1+"' where acct_no = '"+acctno+"' and pin = '"+pin+"'");
				c.s.executeUpdate("update signup set pin = '"+p1+"' where acct_no = '"+acctno+"' and pin = '"+pin+"'");
				
				JOptionPane.showInternalMessageDialog(null, "Pin changed successfully !");
				
				f.setVisible(false);
				new Main_screen(acctno,pin);
		
			  }
			  else if(e.getSource() == b2) {
				  
				  f.setVisible(false);
				  new LogIn();
				  
			  }
		 }
		 catch(Exception E) {
			 
			 E.printStackTrace();
			 
		 }
	}
	
}
