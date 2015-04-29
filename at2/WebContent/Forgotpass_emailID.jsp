<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Email Form</title>
</head>
<body>
   
   <form action="emailer" method="post">
   <s:token name="%{tokenName}" style="visible:none;"/>
   <label for="Email_ID">Enter your email ID:</label><br/>
   <input type="text" name="to"/><br/>
   <input type="submit" value="Send Email"/>
   </form>
</body>
</html>