<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ page import="org.apache.struts2.util.TokenHelper" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Your New Password</title>
</head>
<body>
 <center>
            <s:form action="Emailer" name="Emailer" method="post">
            <s:token name="tokenName"/>
            <s:textfield name="newpassword" label="New Password"></s:textfield>
            <s:textfield name="Reenter Password" label=" Re-enter Password"></s:textfield> 
            <s:submit value="save" name="submit"/>
            </s:form>
    </center>
</body>
</html>