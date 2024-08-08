import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Login implements ActionListener{
	
	JFrame f = new JFrame("BANKY");
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
	JTextField tf1 = new JTextField();
	JPasswordField tf2 = new JPasswordField();
	JButton b1 = new JButton("SIGN IN");
	JButton b2 = new JButton("CLEAR");
	JButton b3 = new JButton("SIGN UP");

	long acctno;
	int pin;
	 	
	Login(){

	    JLabel l1 = new JLabel();
	    l1.setText("> ONLINE EXAM <");
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
		
		tf1.setBounds(295, 138, 400, 30);
		tf1.setFont(new Font("System",Font.BOLD,20));
		tf1.setBackground(Color.WHITE);
		
		tf2.setBounds(295, 188, 400, 30);
		tf2.setFont(new Font("System",Font.BOLD,20));
		tf2.setBackground(Color.WHITE);
		
		l2.setText("Login ID :");
		l2.setFont(new Font("System",Font.BOLD,18));
		l2.setForeground(Color.WHITE);
		l2.setBounds(120, 100, 100, 100);
		
		l3.setText("Password :");
		l3.setFont(new Font("System",Font.BOLD,18));
		l3.setForeground(Color.WHITE);
		l3.setBounds(120, 150, 100, 100);
		
		b1.setBackground(Color.WHITE);
		b1.setFocusable(false);
		b1.setBounds(220, 250, 170, 40);
		b1.addActionListener(this);
		
		b2.setBackground(Color.WHITE);
		b2.setFocusable(false);
		b2.setBounds(420, 250, 170, 40);
		b2.addActionListener(this);
		
		b3.setBackground(Color.WHITE);
		b3.setFocusable(false);
		b3.setBounds(220, 350, 370, 40);
		b3.addActionListener(this);
		
		f.setSize(850,480);
		f.setLayout(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(450,200);
		
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(tf2);
		l1.add(l3);
		l1.add(tf1);
		l1.add(l2);
		f.add(l1);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == b2) {
			
			tf1.setText("");
			tf2.setText("");
			
		}
		else if(e.getSource()==b3) {
			
			new Sign_Up();
			
		}
		else if(e.getSource()==b1) {
			
			if(tf1.getText().equals("")||tf2.getText().equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please fill all fields !");
				
			}
			else {
				
				acctno = Long.parseLong(tf1.getText());
				pin = Integer.parseInt(tf2.getText());
				
				try {
				
			    	Connect con = new Connect();
			    	String q = "select * from login where acct_no = '"+acctno+"' and pin = '"+pin+"'";
			    	ResultSet rs = con.s.executeQuery(q);
				    if(rs.next()) {
				    f.setVisible(false);
				    new Quiz();
				     
			       }
				      else
			    	  {
					    JOptionPane.showMessageDialog(null, "Incorrect LogIn ID or Pin !");
			     	}
				
			    }
			    catch(Exception E) {
				
				     E.printStackTrace();
				
			   }
			
		    }
			
		}
		
	}
	
	public static void main(String args[]) {
		 
		new Login();
	}

}
