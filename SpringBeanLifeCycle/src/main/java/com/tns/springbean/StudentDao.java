package com.tns.springbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDao
{
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/?user=root";
	private String username="root";
	private String password="Slnaik@123";
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		//load driver
		Class.forName(driver);
		
		//connection
		Connection con=DriverManager.getConnection(url, username, password);
		//execute  a query
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM db.emp");
		while(r.next())
		{
			int userid=r.getInt(1);
			String name=r.getString(2);
			String dept=r.getString(3);
			System.out.println("employee id is: "+userid+   "name: "+name+"     dept: "+dept);
		}
	}

}
