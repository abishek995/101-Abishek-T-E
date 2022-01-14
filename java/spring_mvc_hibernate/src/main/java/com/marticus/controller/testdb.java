package com.marticus.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class testdb {

	public static void main(String[] arg) {
		Connection conn=null;
		try {
			conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","1995");
		if(conn!=null);
		{
		System.out.print("Connected secessfully");
		}
	}catch(Exception e)
		{
		System.out.print("Not Connected to DATABASE");
		}
}
}
