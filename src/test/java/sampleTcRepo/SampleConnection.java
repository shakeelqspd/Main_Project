package sampleTcRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import genericUtility.IConstantUtility;


public class SampleConnection 
{
	public static void main(String[] args) throws Exception
	{
		Connection c=null;
		/*Establish Connection*/
		try
		{
		 
		c= DriverManager.getConnection(IConstantUtility.dbpath,IConstantUtility.dbusername, IConstantUtility.dbpassword);
		
		/*Create Statement*/
		
		Statement s=c.createStatement();
		
		/*execute query*/
		 
		ResultSet rs=s.executeQuery("Select * from Students");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+ " " + rs.getString(2) + " " + rs.getString(3) + 
					" " + rs.getString(4));
			
		}
		}
		catch(Exception e)
		{
			
		}
		finally 
		{
			System.out.println();
		}
		
		c.close();
		
		
	}
}
