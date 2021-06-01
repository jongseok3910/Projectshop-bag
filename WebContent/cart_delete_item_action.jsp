<%@page import="com.itwill.shop.cart.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String sUserId=(String)session.getAttribute("sUserId");
if(sUserId==null){
	response.sendRedirect("shop_main.jsp");
	return;
	
}
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("shop_main.jsp");
	return;
}
String cart_noStr=request.getParameter("cart_no");
CartService cartService=new CartService();
cartService.deleteCartByNo(Integer.parseInt(cart_noStr));
response.sendRedirect("cart_view.jsp");

%>