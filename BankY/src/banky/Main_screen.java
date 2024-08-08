package banky;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main_screen implements ActionListener{

	JFrame f = new JFrame("BANKY");
    JLabel l2 = new JLabel();
	JButton b1 = new JButton("DEPOSIT");
	JButton b2 = new JButton("WITHDRAW");
	JButton b3 = new JButton("BANK TRANSFER");
	JButton b4 = new JButton("BALANCE ENQUIRY");
	JButton b6 = new JButton("CHANGE PIN");
	JButton b5 = new JButton("EXIT");

	long acctno;
	int pin;
	 	
	Main_screen(long acctno,int pin){
		
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
		
		l2.setText("CHOOSE A TRANSACTION :");
		l2.setFont(new Font("System",Font.BOLD,18));
		l2.setForeground(Color.WHITE);
		l2.setBounds(220, 100, 300, 100);
	
		b1.setBackground(Color.WHITE);
		b1.setFocusable(false);
		b1.setBounds(200, 200, 170, 40);
		b1.addActionListener(this);
		
		b2.setBackground(Color.WHITE);
		b2.setFocusable(false);
		b2.setBounds(420, 200, 170, 40);
		b2.addActionListener(this);
		
		b3.setBackground(Color.WHITE);
		b3.setFocusable(false);
		b3.setBounds(200, 250, 170, 40);
		b3.addActionListener(this);
		
		b4.setBackground(Color.WHITE);
		b4.setFocusable(false);
		b4.setBounds(200, 300, 170, 40);
		b4.addActionListener(this);
		
		b6.setBackground(Color.WHITE);
		b6.setFocusable(false);
		b6.setBounds(420, 250, 170, 40);
		b6.addActionListener(this);
		
		b5.setBackground(Color.WHITE);
		b5.setFocusable(false);
		b5.setBounds(420, 300, 170, 40);
		b5.addActionListener(this);
		
		f.setSize(850,480);
		f.setLayout(null);
		f.setResizable(false);
		f.setUndecorated(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(450,200);
	
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		l1.add(b6);
		l1.add(b5);
		l1.add(l2);
		f.add(l1);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			
			new Deposit(acctno,pin);
			f.setVisible(false);
			
		}
		else if(e.getSource()==b2) {
			
			new Withdraw(acctno,pin);
			f.setVisible(false);
			
		}
        else if(e.getSource()==b4) {
			
			new Balance_enq(acctno,pin);
			f.setVisible(false);
			
		}
        else if(e.getSource()==b3) {
			
			new Bank_transfer(acctno,pin);
			f.setVisible(false);
			
		}
        else if(e.getSource()==b6) {
			
			new Change_pin(acctno, pin);
			f.setVisible(false);
			
		}
        else if(e.getSource()==b5) {
			
			System.exit(0);;
			
		}
	}
	
}