<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	
	request.setCharacterEncoding("utf-8");
	
	String username = request.getParameter("username");
	String pwd = request.getParameter("pwd");
	
	if("abc".equals(username) && "123".equals(pwd)){
		session.setAttribute("username", username);
		request.getRequestDispatcher("Thirdfile.jsp").forward(request, response);
	}
	else{
		response.sendRedirect("Firstfile.jsp");
	}

%>
