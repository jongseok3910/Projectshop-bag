<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("shop_main.jsp");
		return;
	}
	String userId=request.getParameter("userId");
	String password=request.getParameter("password");
	UserService userService=new UserService();
	if(userService.login(userId, password)){
		session.setAttribute("sUserId", userId);
		response.sendRedirect("shop_main.jsp");
		
	}else{
		response.sendRedirect("user_login_form.jsp");
	}
%>