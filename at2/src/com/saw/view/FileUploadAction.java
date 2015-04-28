package com.saw.view;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.saw.util.StorageUtil;

public class FileUploadAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File   upload;
    private String uploadFileName;
    private String uploadContentType;  
	private StorageUtil storageUtil;
	private Map<String, Object> session;
	private String clas,subject;
	
	public String uploadDoc() {  
	    try {  
	    session = ActionContext.getContext().getSession();
	    String pathPrefix = getClas()+"/"+getSubject()+"/";
	    String filePath = "D:/tempupload";  
	    System.out.println("Doc Location:" + filePath);//see the server console for actual location  
	    File fileToCreate = new File(filePath, this.uploadFileName);  
	    FileUtils.copyFile(this.upload, fileToCreate);//copying image in the new file  
	    storageUtil = new StorageUtil();
	    storageUtil.upload(fileToCreate, pathPrefix); 
	    storageUtil.storeAssignment(this.uploadFileName,getClas(),getSubject());
	    return "success";  
	    }catch(Exception e){
	    	return null;
	    }  
	}
	
	public String uploadVideo() {
		 try {  
			    String filePath = "D:/tempupload/videos";  
			    System.out.println("Video Location:" + filePath);//see the server console for actual location  
			    File fileToCreate = new File(filePath, this.uploadFileName);  
			    FileUtils.copyFile(this.upload, fileToCreate);//copying image in the new file  
			    storageUtil = StorageUtil.getInstance();
			    storageUtil.upload(fileToCreate, "videos/");
			    return "SUCCESS";  
			    }catch(Exception e){
			    	return null;
			    }  
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	/**
	 * @return the session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
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



}  