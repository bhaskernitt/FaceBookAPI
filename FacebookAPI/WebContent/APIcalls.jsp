<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="javax.ws.rs.client.Client" %>
<%@ page import="javax.ws.rs.client.ClientBuilder" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
    String facebook_endPoint_Url= null;
    public void jspInit() { 
        ServletConfig config = getServletConfig(); 
        facebook_endPoint_Url= config.getInitParameter("facebook_endPoint_Url");
    }
%>
<%

HttpSession hs=request.getSession();
String access_token=(String)hs.getAttribute("access_token");

 facebook_endPoint_Url=getServletConfig().getInitParameter("facebook_endPoint_Url");

Client cl=ClientBuilder.newClient();
//out.print(facebook_endPoint_Url+"?access_token="+access_token);

String reqult=cl.target(facebook_endPoint_Url+"?access_token="+access_token).request().get(String.class);

out.print(reqult);

%>

</body>
</html>