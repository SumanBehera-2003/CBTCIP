import java.awt.event.*;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class Sign_Up implements ActionListener{
	
	JFrame f = new JFrame("SIGN UP");
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	
	JLabel name = new JLabel();
	JLabel dob = new JLabel();
	JLabel gender = new JLabel();
	JLabel clg = new JLabel();
	JLabel rollno = new JLabel();
	JLabel email = new JLabel();
	JLabel phno = new JLabel();
	
	JTextField n = new JTextField();
	JTextField fn = new JTextField();
	JTextField mn = new JTextField();
	JTextField c = new JTextField();
	JTextField r = new JTextField();
	JTextField em = new JTextField();
	JTextField ph = new JTextField();

	JRadioButton r7 = new JRadioButton();
	JRadioButton r8 = new JRadioButton();
	JRadioButton r9 = new JRadioButton();
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	
	ButtonGroup bg2 = new ButtonGroup();
	JDateChooser date = new JDateChooser();
	
	Random ran = new Random();
	long formno = ran.nextLong(99999);
	long acctno;
	int pin;
	
	Sign_Up(){
		
	    JLabel l1 = new JLabel();
	    l1.setText("    SIGN UP PAGE :");
		l1.setBounds(0,0,700,300);
		l1.setHorizontalAlignment(JLabel.LEFT);
		l1.setVerticalAlignment(JLabel.TOP);
		l1.setFont(new Font("System",Font.BOLD,30));
		l1.setForeground(new Color(0x7b1004));
		l1.setSize(1000, 880);
		l1.setBackground(new Color(0xfcbcb5));
		l1.setOpaque(true);

		l2.setText("Form No.: "+formno);
		l2.setFont(new Font("System",Font.BOLD,18));
		l2.setForeground(new Color(0x7b1004));
		l2.setBounds(60, 10, 200, 100);
		
		l3.setText("NOTE : Once clicked on 'NEXT',further changes cannot be made.");
		l3.setFont(new Font("System",Font.BOLD,14));
		l3.setForeground(new Color(0x7b1004));
		l3.setBackground(Color.BLACK);
		l3.setBounds(60, 430, 660, 20);
		
		name.setText("Name :");
		name.setFont(new Font("System",Font.BOLD,18));
		name.setForeground(new Color(0x7b1004));
		name.setBounds(100, 80, 200, 100);
		n.setBounds(200, 120, 300, 30);
		n.setFont(new Font("System",Font.BOLD,14));
		n.setBackground(Color.WHITE);
		
		dob.setText("Date Of Birth :");
		dob.setFont(new Font("System",Font.BOLD,18));
		dob.setForeground(new Color(0x7b1004));
		dob.setBounds(35, 130, 200, 100);
		date.setForeground(Color.WHITE);
        date.setBounds(200, 170, 300, 30);
        
        gender.setText("Gender :");
		gender.setFont(new Font("System",Font.BOLD,18));
		gender.setForeground(new Color(0x7b1004));
		gender.setBounds(85, 180, 200, 100);
		
		r7.setText("Male");
		r7.setBounds(200, 215, 100, 30);
		r7.setFont(new Font("System",Font.BOLD,18));
		r7.setForeground(Color.BLACK);
		r7.setFocusable(false);
		r7.addActionListener(this);
		
		r8.setText("Female");
		r8.setBounds(300, 215, 100, 30);
		r8.setFont(new Font("System",Font.BOLD,18));
		r8.setForeground(Color.BLACK);
		r8.setFocusable(false);
		r8.addActionListener(this);
        
		r9.setText("Others");
		r9.setBounds(400, 215, 100, 30);
		r9.setFont(new Font("System",Font.BOLD,18));
		r9.setForeground(Color.BLACK);
		r9.setFocusable(false);
		r9.addActionListener(this);
		
		bg2.add(r7); bg2.add(r8); bg2.add(r9);
		
        clg.setText("College Name :");
		clg.setFont(new Font("System",Font.BOLD,18));
		clg.setForeground(new Color(0x7b1004));
		clg.setBounds(30, 220, 200, 100);
		c.setBounds(200, 260, 300, 30);
		c.setFont(new Font("System",Font.BOLD,18));
		c.setBackground(Color.WHITE);
		
		rollno.setText("Roll Number :");
		rollno.setFont(new Font("System",Font.BOLD,18));
		rollno.setForeground(new Color(0x7b1004));
		rollno.setBounds(40, 270, 200, 100);
		r.setBounds(200, 300, 180, 30);
		r.setFont(new Font("System",Font.BOLD,18));
		r.setBackground(Color.WHITE);
		
		email.setText("E-mail :");
		email.setFont(new Font("System",Font.BOLD,18));
		email.setForeground(new Color(0x7b1004));
		email.setBounds(60, 310, 150, 100);
		em.setBounds(200, 340, 300, 30);
		em.setFont(new Font("System",Font.BOLD,14));
		em.setBackground(Color.WHITE);
		
	    phno.setText("Phone No.:");
		phno.setFont(new Font("System",Font.BOLD,18));
		phno.setForeground(new Color(0x7b1004));
		phno.setBounds(60, 350, 200, 100);
		ph.setBounds(200, 390, 180, 30);
		ph.setFont(new Font("System",Font.BOLD,18));
     	ph.setBackground(Color.WHITE);
		
		b1.setText("NEXT");
		b1.setBounds(200, 490, 80, 30);
		b1.setFont(new Font("System",Font.BOLD,12));
		b1.setForeground(Color.BLACK);
		b1.setFocusable(false);
		b1.addActionListener(this);
		
		b2.setText("CANCEL");
		b2.setBounds(400, 490, 90, 30);
		b2.setFont(new Font("System",Font.BOLD,12));
		b2.setForeground(Color.BLACK);
		b2.setFocusable(false);
		b2.addActionListener(this);
		
		f.setSize(600,700);
		f.setLayout(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(350,0);
		
		l1.add(name); l1.add(n);
		l1.add(dob); l1.add(date);
		l1.add(gender); l1.add(r7); l1.add(r8); l1.add(r9);
		l1.add(clg); l1.add(c);
		l1.add(rollno); l1.add(r);
		l1.add(email); l1.add(em);
		l1.add(phno); l1.add(ph);
		l1.add(b1);
		l1.add(b2);
		l1.add(l3);
		l1.add(l2);
		f.add(l1);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nm = n.getText();
		String d = ((JTextField)date.getDateEditor().getUiComponent()).getText();
		String g = null;
		
		if(r7.isSelected()) {
			g = "Male";
		}
		else if(r8.isSelected()) {
			g = "Female";
		}
		else if(r9.isSelected()) {
			g = "Others";
		}
		
		String clg = c.getText();
		String rollno = r.getText();
		String eml = em.getText();
		String phn = ph.getText();
		
	   if(e.getSource()==b1) {
		
	       acctno = ran.nextLong(99999);
	       pin = ran.nextInt(9999);
		
	       try {
			
	    	   if(n.getText().equals("")) {
	    		   JOptionPane.showMessageDialog(null,"Please fill all the fields!");
	    	   }
	    	   else {
	    		   Connect con = new Connect();
	    		   String q = "insert into sign_up values('"+formno+"','"+nm+"','"+d+"','"+g+"','"+clg+"','"+rollno+"','"+eml+"','"+phn+"','"+acctno+"','"+pin+"')";
	    		   String q1 ="insert into login values('"+acctno+"','"+pin+"')";
	    		   con.s.executeUpdate(q);
	    		   con.s.executeUpdate(q1);
	    		   JOptionPane.showMessageDialog(null, "login id :"+ acctno +"\n password :"+ pin);
	    		   f.setVisible(false);
	    		   new Login();
	    	   }
			
	       }
	       catch(Exception E) {
	    	   E.printStackTrace();
	       }
	
		}
	   else if(e.getSource() == b2) {
			
			System.exit(0);
			
		}
		 
	}  

}
