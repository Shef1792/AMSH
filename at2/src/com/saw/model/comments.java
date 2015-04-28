package com.saw.model;

public class comments {

	private String assignmentId;
	private String commentId;
	private String comment;
	
	/**
	 * @param assignmentId
	 * @param commentId
	 * @param comment
	 */
	public comments(String assignmentId, String commentId, String comment) {
		super();
		this.assignmentId = assignmentId;
		this.commentId = commentId;
		this.comment = comment;
	}

	public comments() {
		// TODO Auto-generated constructor stub
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
	 * @return the commentId
	 */
	public String getCommentId() {
		return commentId;
	}

	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
