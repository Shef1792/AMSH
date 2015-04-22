package com.saw.controller;

	import java.sql.*;  

import com.saw.view.RegisterAction;
	public class RegisterDao {  
	  
	public static int save(RegisterAction r){  
	int status=0;  
	try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
	  
	PreparedStatement ps=con.prepareStatement("insert into strutsuser values(?,?,?,?,?)");  
	ps.setString(1,r.getName());  
	ps.setString(2,r.getPassword());  
	ps.setString(3,r.getEmail());  
	ps.setString(4,r.getPhone());  
	ps.setString(5,r.getRole());  
	          
	status=ps.executeUpdate();  
	  
	}catch(Exception e){e.printStackTrace();}  
	    return status;  
	}  
	

}
