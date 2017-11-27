<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

HttpSession hs=request.getSession(); 

out.println(hs.getAttribute("access_token"));



%>
<form action="APIcalls.jsp" method="get">
<select name="apiType">
<option>friendList</option>
<option>facebookId</option>
</select>

<input type="submit">submit</input>
</form>

</body>
</html>