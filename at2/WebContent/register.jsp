<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<s:form action="register">  
		<s:radio label="Role" list="#{'2':'Student','1':'Teacher'}" name="currentUser.Role" value="1" ></s:radio>
		<s:textfield name="currentUser.id" label="User_ID"></s:textfield>  
		<s:textfield name="currentUser.name" label="UserName"></s:textfield>  
		<s:password name="currentUser.password" label="Password"></s:password>  
		<s:textfield name="currentUser.emailId" label="Email"></s:textfield>  
		<s:textfield name="currentUser.phoneNumber" label="phone"></s:textfield>  
		
		 <s:submit value="Register" align="center"></s:submit>  
	  
	</s:form>  
</body>
</html>