package por;

import java.util.*;
import java.sql.*;


public class connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		see();
	}
	
	static void see(){
		try {
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/","root", "qwerty");
			
			Statement myStmt =myConn.createStatement();
			
			ResultSet myRes=myStmt.executeQuery("SELECT * FROM detyra.login");
			
			while(myRes.next()) {
				System.out.println(myRes.getString("idLogin")+"  "+myRes.getString("Username")+"  "+myRes.getString("Password")+"  ");
			}
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}

}
