package com.saw.view;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.saw.model.assignment;
import com.saw.util.StorageUtil;

public class AssignmentRetrieveAction extends ActionSupport {
	private StorageUtil storageUtil = new StorageUtil();
	List<assignment> studentAssignmentList;
	
	public String loadStudentData(){
		
		studentAssignmentList = storageUtil.retrieveStudentAssignment();
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

}
