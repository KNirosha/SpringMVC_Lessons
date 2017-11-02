<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
${HEADER}
<form action="/SpringMVC_Lessons/demo/bindingResultHandler" method="post">
<table>
<tr><td>DEPT ID</td><td><input type="text" name="deptId"> </td></tr>
<tr><td>NAME</td><td><input type="text" name="name"> </td></tr>
<tr><td>DESIGNATION</td><td><input type="text" name="designation"> </td></tr>
<tr><td>SALARY</td><td><input type="text" name="salary"> </td></tr>
<tr><td>HOBBY</td><td><input type="text" name="hobby"></td></tr>
<tr><td></td><td><input type="submit" value="Register"></td></tr>
</table>
</form>
</body>
</html>