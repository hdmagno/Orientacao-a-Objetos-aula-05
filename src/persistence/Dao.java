package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_aula05?createDatabaseIfNotExist=true", "root", "1234");
	}
	
	public void close() throws Exception {
		con.close();
	}
	
	public static void main(String[] args) {
		
		Dao d = new Dao();
		try {
			d.open();
			d.close();
			System.out.println("Ok...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
