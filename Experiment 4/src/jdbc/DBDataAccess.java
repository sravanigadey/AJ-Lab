
package jdbc;

import java.sql.*;

public class DBDataAccess {

	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...");
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/program4", "root", "");
			 System.out.println("Connected database successfully...");
			 Statement stmt = conn.createStatement();
			 String query = "CREATE TABLE Student " + "(id INTEGER(20), " + " name VARCHAR(50))";
			 stmt.executeUpdate(query);
			 System.out.println("Table Created...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
