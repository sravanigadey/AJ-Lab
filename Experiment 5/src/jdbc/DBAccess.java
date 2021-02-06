package jdbc;

import java.sql.*;

public class DBAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null; 
		PreparedStatement psmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/program4", "root", "");
			stmt = con.createStatement();
			System.out.println("Connection established..");
			
			String query2 = "insert into student values(?,?)";
			psmt = con.prepareStatement(query2);
			psmt.setInt(1,1244);
			psmt.setString(2,"Sravani");
			
			System.out.println(psmt.executeUpdate()+"rows inserted");
			
			System.out.println("Inserted data is:");
			
			ResultSet rs = stmt.executeQuery("select * from student");
			System.out.println("Id"+"\t"+"Name");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			
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
