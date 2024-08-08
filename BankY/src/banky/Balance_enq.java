package banky;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;



public class Balance_enq implements ActionListener {	

	JFrame f = new JFrame("BANKY");
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JButton b2 = new JButton("BACK");
	long acctno;
    int pin;
	
	Balance_enq(long acctno,int pin) {
		
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
		
		l2.setText("Your current balance is:");
		l2.setFont(new Font("System",Font.BOLD,28));
		l2.setForeground(Color.WHITE);
		l2.setBounds(200, 100, 500, 100);
		
		l3.setFont(new Font("System",Font.BOLD,44));
		l3.setForeground(Color.WHITE);
		l3.setBackground(Color.BLACK);
		l3.setBounds(250, 230, 660, 60);
		
		b2.setBackground(Color.WHITE);
		b2.setFocusable(false);
		b2.setBounds(520, 350, 170, 40);
		b2.addActionListener(this);
		
		double balance = 0.0;
		try {
			
			Connect c = new Connect();
			ResultSet rs = c.s.executeQuery("select * from transaction where acct_no = '"+acctno+"' and (pin = '"+pin+"'or pin = 0)");
			while(rs.next()) {
				 if(rs.getString("type").equals("deposit")||rs.getString("type").equals("credited_t")) {
					 balance += Double.parseDouble(rs.getString("amount"));
				 }
				 else {
					 balance -= Double.parseDouble(rs.getString("amount"));
				 }
			 }
			
		}
		catch(Exception E) {
			E.printStackTrace();
		}
		
		l3.setText("Rs. "+balance);
		
		f.setSize(850,480);
		f.setLayout(null);
		f.setResizable(false);
		f.setUndecorated(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(450,200);
		
		l1.add(b2);
		l1.add(l2);
		l1.add(l3);
		f.add(l1);
		f.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		f.setVisible(false);
		new Main_screen(acctno,pin);
		
	}
	
}
