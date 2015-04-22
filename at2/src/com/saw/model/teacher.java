package com.saw.model;

public class teacher {

	private String tId;
	private String subject;
	private String clas;
	private String assignmentId;
	private String grade;
	
	/**
	 * @param tId
	 * @param subject
	 * @param clas
	 * @param assignmentId
	 * @param grade
	 */
	public teacher(String tId, String subject, String clas,
			String assignmentId, String grade) {
		super();
		this.tId = tId;
		this.subject = subject;
		this.clas = clas;
		this.assignmentId = assignmentId;
		this.grade = grade;
	}

	public teacher() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tId
	 */
	public String gettId() {
		return tId;
	}

	/**
	 * @param tId the tId to set
	 */
	public void settId(String tId) {
		this.tId = tId;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the clas
	 */
	public String getClas() {
		return clas;
	}

	/**
	 * @param clas the clas to set
	 */
	public void setClas(String clas) {
		this.clas = clas;
	}

	/**
	 * @return the assignmentId
	 */
	public String getAssignmentId() {
		return assignmentId;
	}

	/**
	 * @param assignmentId the assignmentId to set
	 */
	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
