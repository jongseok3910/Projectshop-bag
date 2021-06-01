package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sun.rowset.internal.InsertRow;

public class UserDao {
	public User selectOne(String userid) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String username="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		User user=null;
		String selectOneSql="select userid,password,name,email from userinfo where userid='"+userid+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(selectOneSql);
		while(rs.next()) {
			String id = rs.getString("userid");
			String pass=rs.getString("password");
			String name=rs.getString("name");
			String email=rs.getString("email");
			//System.out.println(id+"\t"+pass+"\t"+name+"\t"+email);
			user=new User(userid, pass, name, email);
		}
		con.close();
		return user;
		
	}
	
	public int delete(String userid) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String deleteSql="delete from userinfo where userid='"+userid+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println("delete row count:"+deleteRowCount);
		return deleteRowCount;
	}
	public int insert(String userid,String pass,String name,String email)throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String insertSql="insert into userinfo(userid,password,name,email) values('"+userid+"','"+pass+"','"+name+"','"+email+"')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println("insert row count:"+insertRowCount);
		return insertRowCount;
	}
	public int insert(User user)throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String username="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String insertSql="insert into userinfo(userid,password,name,email) values('"+user.getUserId()+"','"+user.getPassword()+"','"+user.getName()+"','"+user.getEmail()+"')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println("insert row count:"+insertRowCount);
		return insertRowCount;
	}
	public int update(String userid,String pass,String name,String email) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String updateSql="update  userinfo set password='"+pass+"',name='"+name+"',email='"+email+"' where userid='"+userid+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println("update row count:"+updateRowCount);
		return updateRowCount;
	}
	public int update(User updateUser) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String updateSql="update  userinfo set password='"+updateUser.getPassword()+"',name='"+updateUser.getName()+"',email='"+updateUser.getEmail()+"' where userid='"+updateUser.getUserId()+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println("update row count:"+updateRowCount);
		return updateRowCount;
	}

	public boolean duplicateIdCheck(String userId) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String selectSql="select count(*) cnt from userinfo where userid='"+userId+"'";
		boolean isDuplicate=false;
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		int count=-999;
		if(rs.next()) {
			count=rs.getInt("cnt");
		}
		
		if(count==0) {
			isDuplicate=false;
		}else {
			isDuplicate=true;
		}
		
		return isDuplicate;
	}
	
}
