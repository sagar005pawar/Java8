package com.JDBC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlCon
{
	private static Connection con;
	public static void main(String args[]) throws SQLException{  
		try {
	        long startTime = System.currentTimeMillis();  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","root");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
//			System.out.println(stmt.executeUpdate("delete from employee where id='7'"));
			ResultSet rs=stmt.executeQuery("select * from employee");  
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3));  
	        System.out.println("Time taken by MySQL: "+(System.currentTimeMillis()-startTime)+" ms");			
	        
/*	        
	        DatabaseMetaData dbmd=con.getMetaData();  
	        // DatabaseMetaData interface
	        System.out.println("Driver Name: "+dbmd.getDriverName());  
	        System.out.println("Driver Version: "+dbmd.getDriverVersion());  
	        System.out.println("UserName: "+dbmd.getUserName());  
	        System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
	        System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
*/

/*	        
	        PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
	        ps.setString(1,"sagar");  
	        FileInputStream fin=new FileInputStream("F:\\PICS\\sagarpic.jpg");  
	        ps.setBinaryStream(2,fin,fin.available());  
	        int i=ps.executeUpdate();  
	        System.out.println(i+" records affected");  
	        fin.close();
*/	        
	
	        
	        rs.close();
			stmt.close();
		}catch(Exception e){
			System.out.println(e);
		} finally {
			con.close();
			System.out.println("DB Connection closed..");
		} 
	}  
}

/*	NOTE:-
	The important methods of Statement interface are as follows:
	
	1) public ResultSet executeQuery(String sql): is used to execute SELECT query. It returns the object of ResultSet.
	2) public int executeUpdate(String sql): is used to execute specified query, it may be create, drop, insert, update, delete etc.
	3) public boolean execute(String sql): is used to execute queries that may return multiple results.
	4) public int[] executeBatch(): is used to execute batch of commands.
*/