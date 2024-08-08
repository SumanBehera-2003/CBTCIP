package banky;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class SignUp implements ActionListener{
	
	JFrame f = new JFrame("SIGN UP");
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	
	JLabel name = new JLabel();
	JLabel fname = new JLabel();
	JLabel mname = new JLabel();
	JLabel dob = new JLabel();
	JLabel gender = new JLabel();
	JLabel pan = new JLabel();
	JLabel aadhar = new JLabel();
	JLabel address = new JLabel();
	JLabel email = new JLabel();
	JLabel phno = new JLabel();
	JLabel ms = new JLabel();
	JLabel pincode = new JLabel();
	JLabel state = new JLabel();
	JLabel acctyp = new JLabel();
	
	JTextField n = new JTextField();
	JTextField fn = new JTextField();
	JTextField mn = new JTextField();
	JTextField p = new JTextField();
	JTextField a = new JTextField();
	JTextField add = new JTextField();
	JTextField em = new JTextField();
	JTextField ph = new JTextField();
	JTextField pc = new JTextField();
	JTextField s = new JTextField();

	JRadioButton r1 = new JRadioButton();
	JRadioButton r2 = new JRadioButton();
	JRadioButton r3 = new JRadioButton();
	JRadioButton r4 = new JRadioButton();
	JRadioButton r5 = new JRadioButton();
	JRadioButton r6 = new JRadioButton();
	JRadioButton r7 = new JRadioButton();
	JRadioButton r8 = new JRadioButton();
	JRadioButton r9 = new JRadioButton();
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	
	JCheckBox c = new JCheckBox();
	
	ButtonGroup bg = new ButtonGroup();
	ButtonGroup bg1 = new ButtonGroup();
	ButtonGroup bg2 = new ButtonGroup();
	JDateChooser date = new JDateChooser();
	
	Random ran = new Random();
	long formno =ran.nextLong(99999);
	long acctno;
	int pin;
	
	SignUp(){
		
		ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("banky/icons/bank.png"));
	    Image i1 = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT );
	    ImageIcon i2 = new ImageIcon(i1);
	    JLabel l1 = new JLabel();
	    
	    l1.setIcon(i2);
	    l1.setText("SIGN UP PAGE :");
	    l1.setIconTextGap(95);
		l1.setBounds(0,0,700,300);
		l1.setHorizontalTextPosition(JLabel.RIGHT);
		l1.setVerticalTextPosition(JLabel.CENTER);
		l1.setHorizontalAlignment(JLabel.LEFT);
		l1.setVerticalAlignment(JLabel.TOP);
		l1.setFont(new Font("System",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setSize(1000, 880);
		l1.setBackground(Color.BLACK);
		l1.setOpaque(true);

		l2.setText("Form No.: "+formno);
		l2.setFont(new Font("System",Font.BOLD,18));
		l2.setForeground(Color.WHITE);
		l2.setBounds(200, 60, 200, 100);
		
		c.setText("I hereby declare that the information given above are true to the best of my knowledge.");
		c.setFont(new Font("System",Font.BOLD,14));
		c.setForeground(Color.WHITE);
		c.setBackground(Color.BLACK);
		c.setBounds(150, 710, 660, 20);
		
		l3.setText("NOTE : Once clicked on 'NEXT',further changes cannot be made.");
		l3.setFont(new Font("System",Font.BOLD,14));
		l3.setForeground(Color.WHITE);
		l3.setBackground(Color.BLACK);
		l3.setBounds(150, 730, 660, 20);
		
		name.setText("Name :");
		name.setFont(new Font("System",Font.BOLD,18));
		name.setForeground(Color.WHITE);
		name.setBounds(150, 130, 200, 100);
		n.setBounds(295, 160, 400, 30);
		n.setFont(new Font("System",Font.BOLD,18));
		n.setBackground(Color.WHITE);
		
		fname.setText("Father's Name :");
		fname.setFont(new Font("System",Font.BOLD,18));
		fname.setForeground(Color.WHITE);
		fname.setBounds(150, 180, 200, 100);
		fn.setBounds(295, 210, 400, 30);
		fn.setFont(new Font("System",Font.BOLD,18));
		fn.setBackground(Color.WHITE);
		
		mname.setText("Mother's Name :");
		mname.setFont(new Font("System",Font.BOLD,18));
		mname.setForeground(Color.WHITE);
		mname.setBounds(150, 230, 200, 100);
		mn.setBounds(295, 260, 400, 30);
		mn.setFont(new Font("System",Font.BOLD,18));
		mn.setBackground(Color.WHITE);
		
		dob.setText("Date Of Birth :");
		dob.setFont(new Font("System",Font.BOLD,18));
		dob.setForeground(Color.WHITE);
		dob.setBounds(150, 280, 200, 100);
		date.setForeground(Color.BLACK);
        date.setBounds(295, 310, 300, 30);
        
        gender.setText("Gender :");
		gender.setFont(new Font("System",Font.BOLD,18));
		gender.setForeground(Color.WHITE);
		gender.setBounds(150, 330, 200, 100);
		
		r7.setText("Male");
		r7.setBounds(295, 360, 100, 30);
		r7.setFont(new Font("System",Font.BOLD,18));
		r7.setForeground(Color.BLACK);
		r7.setFocusable(false);
		r7.addActionListener(this);
		
		r8.setText("Female");
		r8.setBounds(495, 360, 100, 30);
		r8.setFont(new Font("System",Font.BOLD,18));
		r8.setForeground(Color.BLACK);
		r8.setFocusable(false);
		r8.addActionListener(this);
        
		r9.setText("Others");
		r9.setBounds(695, 360, 100, 30);
		r9.setFont(new Font("System",Font.BOLD,18));
		r9.setForeground(Color.BLACK);
		r9.setFocusable(false);
		r9.addActionListener(this);
		
		bg2.add(r7); bg2.add(r8); bg2.add(r9);
		
        pan.setText("PAN Number :");
		pan.setFont(new Font("System",Font.BOLD,18));
		pan.setForeground(Color.WHITE);
		pan.setBounds(150, 380, 200, 100);
		p.setBounds(295, 420, 180, 30);
		p.setFont(new Font("System",Font.BOLD,18));
		p.setBackground(Color.WHITE);
		
		aadhar.setText("AADHAR Number :");
		aadhar.setFont(new Font("System",Font.BOLD,18));
		aadhar.setForeground(Color.WHITE);
		aadhar.setBounds(500, 380, 200, 100);
		a.setBounds(695, 420, 180, 30);
		a.setFont(new Font("System",Font.BOLD,18));
		a.setBackground(Color.WHITE);
		
		address.setText("Address :");
		address.setFont(new Font("System",Font.BOLD,18));
		address.setForeground(Color.WHITE);
		address.setBounds(150, 430, 150, 100);
		add.setBounds(295, 470, 300, 30);
		add.setFont(new Font("System",Font.BOLD,14));
		add.setBackground(Color.WHITE);
		
	    state.setText("State :");
		state.setFont(new Font("System",Font.BOLD,18));
		state.setForeground(Color.WHITE);
		state.setBounds(620, 430, 200, 100);
		s.setBounds(695, 470, 180, 30);
		s.setFont(new Font("System",Font.BOLD,18));
		s.setBackground(Color.WHITE);
		
		pincode.setText("Pin Code :");
		pincode.setFont(new Font("System",Font.BOLD,18));
		pincode.setForeground(Color.WHITE);
		pincode.setBounds(150, 480, 200, 100);
		pc.setBounds(295, 520, 100,20);
		pc.setFont(new Font("System",Font.BOLD,14));
		pc.setBackground(Color.WHITE);
		
		email.setText("E-mail :");
		email.setFont(new Font("System",Font.BOLD,18));
		email.setForeground(Color.WHITE);
		email.setBounds(150, 510, 150, 100);
		em.setBounds(295, 550, 300, 30);
		em.setFont(new Font("System",Font.BOLD,14));
		em.setBackground(Color.WHITE);
		
	    phno.setText("Phone No.:");
		phno.setFont(new Font("System",Font.BOLD,18));
		phno.setForeground(Color.WHITE);
		phno.setBounds(620, 510, 200, 100);
		ph.setBounds(720, 550, 150, 30);
		ph.setFont(new Font("System",Font.BOLD,18));
     	ph.setBackground(Color.WHITE);
     	
     	ms.setText("Marital Status :");
		ms.setFont(new Font("System",Font.BOLD,18));
		ms.setForeground(Color.WHITE);
		ms.setBounds(150, 560, 150, 100);
		
		r1.setText("Married");
		r1.setBounds(295, 590, 100, 30);
		r1.setFont(new Font("System",Font.BOLD,18));
		r1.setForeground(Color.BLACK);
		r1.setFocusable(false);
		r1.addActionListener(this);
		
		r2.setText("Unmarried");
		r2.setBounds(495, 590, 130, 30);
		r2.setFont(new Font("System",Font.BOLD,18));
		r2.setForeground(Color.BLACK);
		r2.setFocusable(false);
		r2.addActionListener(this);
		
		bg.add(r1); bg.add(r2);

		acctyp.setText("Account Type :");
		acctyp.setFont(new Font("System",Font.BOLD,18));
		acctyp.setForeground(Color.WHITE);
		acctyp.setBounds(150, 600, 150, 100);
		
		r3.setText("Savings Account");
		r3.setBounds(295, 630, 200, 30);
		r3.setFont(new Font("System",Font.BOLD,18));
		r3.setForeground(Color.BLACK);
		r3.setFocusable(false);
		r3.addActionListener(this);
		
		r4.setText("Current Account");
		r4.setBounds(595, 630, 200, 30);
		r4.setFont(new Font("System",Font.BOLD,18));
		r4.setForeground(Color.BLACK);
		r4.setFocusable(false);
		r4.addActionListener(this);
		
		r5.setText("Fixed Deposit");
		r5.setBounds(295, 670, 200, 30);
		r5.setFont(new Font("System",Font.BOLD,18));
		r5.setForeground(Color.BLACK);
		r5.setFocusable(false);
		r5.addActionListener(this);
		
		r6.setText("Recurring Deposit");
		r6.setBounds(595, 670, 200, 30);
		r6.setFont(new Font("System",Font.BOLD,18));
		r6.setForeground(Color.BLACK);
		r6.setFocusable(false);
		r6.addActionListener(this);
		
		bg1.add(r3); bg1.add(r4); bg1.add(r5); bg1.add(r6);
		
		b1.setText("NEXT");
		b1.setBounds(695, 740, 80, 30);
		b1.setFont(new Font("System",Font.BOLD,12));
		b1.setForeground(Color.BLACK);
		b1.setFocusable(false);
		b1.addActionListener(this);
		
		b2.setText("CANCEL");
		b2.setBounds(795, 740, 90, 30);
		b2.setFont(new Font("System",Font.BOLD,12));
		b2.setForeground(Color.BLACK);
		b2.setFocusable(false);
		b2.addActionListener(this);
		
		f.setSize(1000,880);
		f.setLayout(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(350,0);
		
		l1.add(name); l1.add(n);
		l1.add(fname); l1.add(fn);
		l1.add(mname); l1.add(mn);
		l1.add(dob); l1.add(date);
		l1.add(gender); l1.add(r7); l1.add(r8); l1.add(r9);
		l1.add(pan); l1.add(p);
		l1.add(aadhar); l1.add(a);
		l1.add(address); l1.add(add);
		l1.add(state); l1.add(s);
		l1.add(pincode); l1.add(pc);
		l1.add(email); l1.add(em);
		l1.add(phno); l1.add(ph);
		l1.add(ms); l1.add(r1); l1.add(r2);
		l1.add(acctyp); l1.add(r3); l1.add(r4); l1.add(r5); l1.add(r6);
		l1.add(b1);
		l1.add(b2);
		l1.add(c);
		l1.add(l3);
		l1.add(l2);
		f.add(l1);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nm = n.getText();
		String fnm = fn.getText();
		String mnm = mn.getText();
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
		
		String panno = p.getText();
		String aadno = a.getText();
		String adrs = add.getText();
		String st = s.getText();
		String pinc = pc.getText();
		String eml = em.getText();
		String phn = ph.getText();
		String marsts = null;
		
		if(r1.isSelected()) {
			marsts = "Married";
		}
		else if(r2.isSelected()) {
			marsts = "Unmarried";
		}
		
		String acct = null;
		
		if(r3.isSelected()) {
			acct = "Savings";
		}
		else if(r4.isSelected()) {
			acct = "Current";
		}
		else if(r5.isSelected()) {
			acct = "FD";
		}
		else if(r6.isSelected()) {
			acct = "Recurring";
		}
		
		
	   if(e.getSource()==b1) {
			
	
	       acctno = ran.nextLong(999999999);
	       pin = ran.nextInt(9999);
		
	       try {
			
	    	   if(n.getText().equals("")) {
	    		   JOptionPane.showMessageDialog(null,"Please fill all the fields!");
	    	   }
	    	   else {
	    		   Connect con = new Connect();
	    		   String q = "insert into signup values('"+formno+"','"+nm+"','"+fnm+"','"+mnm+"','"+d+"','"+g+"','"+panno+"','"+aadno+"','"+adrs+"','"+st+"','"+pinc+"','"+eml+"','"+phn+"','"+marsts+"','"+acct+"','"+acctno+"','"+pin+"')";
	    		   String q1 ="insert into login values('"+acctno+"','"+pin+"')";
	    		   con.s.executeUpdate(q);
	    		   con.s.executeUpdate(q1);
	    		   JOptionPane.showMessageDialog(null, "login id :"+ acctno +"\n password :"+ pin);
	    		   f.setVisible(false);
	    		   new LogIn();
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

