package com.itwill.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/product_list.do")
public class ProductListServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>쇼핑몰</title>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		out.println("<link rel=stylesheet href='css/styles.css' type='text/css'>");
		out.println("<link rel=stylesheet href='css/shop.css' type='text/css'>");
		out.println("<style type='text/css' media='screen'>");
		out.println("</style>");
		out.println("</head>");
		out.println("<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0\r\n"
				+ "			marginwidth=0 marginheight=0>");
		out.println("<!-- container start-->");
		out.println("<div id='container'>");
		out.println("<!-- header start -->");
		out.println("<div id='header'>");
		out.println("<!-- include_common_top.jsp start-->");
		out.println("<h1>");
		out.println("<a href=''>WEB SAMPLE SITE</a>");
		out.println("</h1>");
		out.println("<!-- include_common_top.jsp end-->");
		out.println("</div>");
		out.println("<!-- header end -->");
		out.println("<!-- navigation start-->");
		out.println("<div id='navigation'>");
		out.println("<!-- include_common_left.jsp start-->");
		out.println("<script type='text/javascript'>");
		out.println("function login_message() {");
		out.println("alert('로그인하세요');");
		out.println("location.href = 'user_login_form.jsp';");
		out.println("}");
		out.println("</script>");
		out.println("<p>");
		out.println("<strong>메 뉴</strong>");
		out.println("</p>");
		out.println("<ul>");
		out.println("<li><a href='user_login_form.jsp'>로그인</a></li>");
		out.println("<li><a href='user_write_form.jsp'>회원가입</a></li>");
		out.println("<li><a href=''></a></li>");
		out.println("<li><a href='javascript:login_message();'>장바구니</a></li>");
		out.println("<li><a href='product_list.jsp'>상품리스트</a></li>");
		out.println("<li><a href=''></a></li>");
		out.println("<li><a href='board_list.jsp'>게시판리스트</a></li>");
		out.println("<li><a href='board_write_form.jsp'>게시판쓰기</a></li>");
		out.println("</ul>");
		out.println("<!-- include_common_left.jsp end-->");
		out.println("</div>");
		out.println("<!-- navigation end-->");
		out.println("<!-- wrapper start -->");
		out.println("<div id='wrapper'>");
		out.println("<!-- content start -->");
		out.println("<!-- include_content.jsp start-->");
		out.println("<div id='content'>");
		out.println("<table border=0 cellpadding=0 cellspacing=0>");
		out.println("<tr>");
		out.println("<td><br />");
		out.println("<table style='padding-left: 10px' border=0 cellpadding=0 cellspacing=0>");
		out.println("<tr>");
		out.println("<td bgcolor='f4f4f4' height='22'>&nbsp;&nbsp;<b>쇼핑몰 - "+
																	"상품리스트</b></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<form name='f' method='post'>");
		out.println("<table width='100%' align='center' border='1' cellspacing='0'\r\n"
				+ "											cellpadding='3' bordercolordark='white'\r\n"
				+ "											bordercolorlight='#556b2f'>");
		out.println("<tr>");
		for(int i=0;i<4;i++) {
		out.println("<!--상품시작 -->");
		out.println("<td align='center' width='25%'><a\r\n"
				+ "													href='product_detail.jsp?p_no=1'><img\r\n"
				+ "														src='image/bigle.gif' border='0'></a><br /> <br /> <b>견종:비글</b><br>\r\n"
				+ "													<font color='#FF0000'>가격:550,000원 </font></td>");
		out.println("<!--상품 끝 -->");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</form> <br /></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</div>");
		out.println("<!-- include_content.jsp end-->");
		out.println("<!-- content end -->");
		out.println("</div>");
		out.println("<!--wrapper end-->");
		out.println("<div id='footer'>");
		out.println("<!-- include_common_bottom.jsp start-->");
		out.println("<p align='center'>Copyright (&copy;) By Java Class 5. All\r\n"
				+ "				rights reserved.</p>");
		out.println("<!-- include_common_bottom.jsp end-->");
		out.println("</div>");
		out.println("</div>");
		out.println("<!--container end-->");
		out.println("</body>");
		out.println("</html>");
	}
}