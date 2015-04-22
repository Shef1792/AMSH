package com.saw.model;

public class student {

	public student() {
		// TODO Auto-generated constructor stub
	}

	private String sId;
	private String subject;
	private String clas;
	private String assignmentId;
	private String attachment;
	
	/**
	 * @param sId
	 * @param subject
	 * @param clas
	 * @param assignmentId
	 * @param attachment
	 */
	public student(String sId, String subject, String clas,
			String assignmentId, String attachment) {
		super();
		this.sId = sId;
		this.subject = subject;
		this.clas = clas;
		this.assignmentId = assignmentId;
		this.attachment = attachment;
	}
	/**
	 * @return the sId
	 */
	public String getsId() {
		return sId;
	}
	/**
	 * @param sId the sId to set
	 */
	public void setsId(String sId) {
		this.sId = sId;
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
	 * @return the attachment
	 */
	public String getAttachment() {
		return attachment;
	}
	/**
	 * @param attachment the attachment to set
	 */
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	
	
}
