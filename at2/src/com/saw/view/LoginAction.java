package com.saw.view;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.amazonaws.Request;
import com.opensymphony.xwork2.ActionSupport;
import com.saw.controller.UserManagement;
import com.saw.model.useraccess;
import com.saw.util.AtUtils;

public class LoginAction extends ActionSupport implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private useraccess currentUser ;
	private UserManagement userManagement;
	private SessionMap<String,Object> sessionMap;
	
	
	public LoginAction(){
		userManagement= new UserManagement();
	}
	
	public String execute(){
		String success = "success";
		currentUser = userManagement.login(getCurrentUser().getName(), getCurrentUser().getPassword());
		
		if(currentUser != null){
			if(currentUser.getRole() == AtUtils.ROLE_TEACHER){
				success = "successTS";
			}else if (currentUser.getRole() == AtUtils.ROLE_STUDENT){
				success = "successST";
			}
			sessionMap.put("usrRole", currentUser.getRole());
			sessionMap.put("user", currentUser);
		}
		
		
		return success;
	}
	
	public String logout(){  
	    if(sessionMap!=null){  
	        sessionMap.invalidate();  
	    }  
	    return "success";  
	}  
	
	/**
	 * @return the currentUser
	 */
	public useraccess getCurrentUser() {
		return currentUser;
	}
	/**
	 * @param currentUser the currentUser to set
	 */
	public void setCurrentUser(useraccess currentUser) {
		this.currentUser = currentUser;
	}
	/**
	 * @return the userManagement
	 */
	public UserManagement getUserManagement() {
		return userManagement;
	}
	/**
	 * @param userManagement the userManagement to set
	 */
	public void setUserManagement(UserManagement userManagement) {
		this.userManagement = userManagement;
	}
	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = (SessionMap<String, Object>) sessionMap;
		
	}
	public SessionMap<String,Object> getSessionMap() {
		return sessionMap;
	}

}
