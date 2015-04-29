package com.saw.view;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.saw.model.assignment;
import com.saw.util.StorageUtil;

public class AssignmentRetrieveAction extends ActionSupport {
	private StorageUtil storageUtil = new StorageUtil();
	List<assignment> studentAssignmentList;
	private String clas,subject;
	
	public String loadStudentData(){
		
		studentAssignmentList = storageUtil.retrieveStudentAssignment();
		return "success";
	}

	public String loadTeacherData(){
		studentAssignmentList = storageUtil.retrieveTeacherAssignment(getClas(),getSubject());
		return "success";
	}
	
	/**
	 * @return the studentAssignmentList
	 */
	public List<assignment> getStudentAssignmentList() {
		return studentAssignmentList;
	}

	/**
	 * @param studentAssignmentList the studentAssignmentList to set
	 */
	public void setStudentAssignmentList(List<assignment> studentAssignmentList) {
		this.studentAssignmentList = studentAssignmentList;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
