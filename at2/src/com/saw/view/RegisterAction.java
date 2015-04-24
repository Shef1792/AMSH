package com.saw.view;

import com.saw.controller.UserManagement;
import com.saw.model.useraccess;

public class RegisterAction {
	
	private useraccess currentUser ;
	private UserManagement userManagement;
	
	public RegisterAction(){
		userManagement= new UserManagement();
	}
	
	public String execute(){  
	    int i=userManagement.registerUser(getCurrentUser()); 
	    
	    if (i > 0) {  
	    	return "success";  
	    }
	    
	    return "error";  
	}

	public useraccess getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(useraccess currentUser) {
		this.currentUser = currentUser;
	}

	public UserManagement getUserManagement() {
		return userManagement;
	}

	public void setUserManagement(UserManagement userManagement) {
		this.userManagement = userManagement;
	}  
}
