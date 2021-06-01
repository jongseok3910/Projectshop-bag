<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String sUserId=(String)session.getAttribute("sUserId");
if(sUserId==null){
	response.sendRedirect("shop_main.jsp");
	return;
	
}
session.invalidate();
response.sendRedirect("shop_main.jsp");
%>