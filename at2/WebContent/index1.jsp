<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome to Assignment Tracker</title>
</head>
<body>
   <h1>Please login to continue</h1>
     <s:form action="login" method="post">
	    <s:textfield name="currentUser.name" label="Username"/>
	    <s:password name="currentUser.password" label="Password"/>
	    <s:submit value="Login" align="center"></s:submit>
      </s:form>
  
</body>
</html>
 