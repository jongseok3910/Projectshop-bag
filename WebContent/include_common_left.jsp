<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String sUserId = (String)session.getAttribute("sUserId");
%>	
<script type="text/javascript">
	function login_message() {
		alert('로그인하세요');
		location.href = 'user_login_form.jsp';
	}
</script>
<p>
	<strong>메 뉴</strong>
</p>
<ul>
	<%if(sUserId == null){ %>
	<li><a href="user_write_form.jsp">회원가입</a></li>
	<li><a href="user_login_form.jsp">로그인</a></li>
	<%}else{ %>
	<li><a href="user_view.jsp"><%=sUserId%>님</a>&nbsp;<a href="user_logout_action.jsp">로그아웃</a></li>
	<%}%>
	<li><a href=""></a></li>
	<li><a href="shop_main.jsp">쇼핑몰메인</a></li>
	<%if(sUserId == null){ %>
	<li><a href="javascript:login_message();">장바구니</a></li>
	<%}else{ %>
	<li><a href="cart_view.jsp">장바구니</a></li>
	<%} %>
	<li><a href="product_list.jsp">상품리스트</a></li>
	<li><a href=""></a></li>

</ul>
