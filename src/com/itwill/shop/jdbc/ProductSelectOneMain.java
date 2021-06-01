package com.itwill.shop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductSelectOneMain {

	public static void main(String[] args) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/
		String selectOneSql = "select p_no,p_name,p_price,p_image,p_desc,p_click_count from product where p_no=1";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(selectOneSql);
		while(rs.next()) {
			int p_no = rs.getInt("p_no");
			String p_name=rs.getString("p_name");
			int p_price=rs.getInt("p_price");
			String p_image=rs.getString("p_image");
			String p_desc=rs.getString("p_desc");
			int p_click_count=rs.getInt("p_click_count");
			System.out.println(p_no+"\t"+p_name+"\t"+p_price+"\t"+p_image+"\t"+p_desc+"\t"+p_click_count);
		}
		con.close();
	}

}
