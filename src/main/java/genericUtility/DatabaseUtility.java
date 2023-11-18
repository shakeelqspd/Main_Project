package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * this class contains all the generic methods regarding DataBase
 * 
 * @author SSS
 */

public class DatabaseUtility 
{
	Connection c = null;

	/**
	 * this method is to establish connection
	 * 
	 * @throws Exception
	 */
	public void establishConnection() throws Exception 
	{
		DriverManager.getConnection(IConstantUtility.dbpath, IConstantUtility.dbusername, IConstantUtility.dbpassword);
	}

	/**
	 * this method is to close the connection
	 * 
	 * @throws Exception
	 */
	public void closeConnection() throws Exception 
	{
		c.close();
	}

	public String executeQuerryOperation(String querry, int colIndex, String expData) throws Exception {
		boolean flag = false;
		ResultSet rs = c.createStatement().executeQuery(querry);

		while (rs.next()) 
		{
			String actualData = rs.getString(colIndex);

			if (actualData.equals(expData)) 
			{
				flag = true;
				break;
			}
		}
		if (flag) 
		{
			System.out.println("Expected data is :" + expData);
			return expData;
		} else 
		{
			System.out.println("Expected data is not present");
			return "";
		}
	}

}
