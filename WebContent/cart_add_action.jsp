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
/*
1.개를 담는다
2.cart_view.jsp로 redirection
*/
String p_noStr=request.getParameter("p_no");
String cart_qtyStr=request.getParameter("cart_qty");
CartService cartService=new CartService();
cartService.add(sUserId, Integer.parseInt(p_noStr), Integer.parseInt(cart_qtyStr));
response.sendRedirect("cart_view.jsp");
%>

