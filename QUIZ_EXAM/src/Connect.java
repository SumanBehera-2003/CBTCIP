import java.sql.*;

public class Connect {

	Connection con; 
	Statement s;
	
	public Connect(){
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinee","root","password");
			s = con.createStatement();
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
