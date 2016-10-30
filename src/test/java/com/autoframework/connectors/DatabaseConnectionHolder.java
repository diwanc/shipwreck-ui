package com.autoframework.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class DatabaseConnectionHolder
{

	private Logger logger = Logger.getLogger(DatabaseConnectionHolder.class);

	// JDBC driver name and database URL
	String jDBC_DRIVER;
	String dB_URL;

	// Database credentials
	String user;
	String pass;

	private Connection conn = null;
	private Statement stmt = null;

	public DatabaseConnectionHolder(String jDBC_DRIVER, String dB_URL, String user, String pass)
	{
		super();
		this.jDBC_DRIVER = jDBC_DRIVER;
		this.dB_URL = dB_URL;
		this.user = user;
		this.pass = pass;

	}

	public Connection getConnection() throws Exception
	{
		//  Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver");

		//  Open a connection
		logger.info("Connecting to a selected database...");
		conn = DriverManager.getConnection(dB_URL, user, pass);
		logger.info("Connected database successfully...");
		return conn;

	}

	public List<HashMap<String, String>> getData(String sqlQuery, Connection con)
	{
		ResultSet rs;
		Map<Integer, List<String>> maps = new HashMap<Integer, List<String>>();
		List<HashMap<String, String>> listOfMap = new ArrayList<HashMap<String, String>>();

		try
		{
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlQuery);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnNumber = rsmd.getColumnCount();

			while (rs.next())
			{
				HashMap<String, String> row = new HashMap<String, String>(columnNumber);
				for (int i = 1; i <= columnNumber; ++i)
				{
					row.put(rsmd.getColumnName(i), rs.getString(i));
				}
				listOfMap.add(row);
			}

		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return listOfMap;
	}

}
