package com.saw.view;

import java.io.File;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.saw.model.useraccess;
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
	
	public String uploadDoc() {  
	    try {  
	    session = ActionContext.getContext().getSession();
	    String pathPrefix = ((useraccess)session.get("user")).getId();
	    String filePath = "D:/tempupload/docs";  
	    System.out.println("Doc Location:" + filePath);//see the server console for actual location  
	    File fileToCreate = new File(filePath, this.uploadFileName);  
	    FileUtils.copyFile(this.upload, fileToCreate);//copying image in the new file  
	    storageUtil = new StorageUtil();
	    storageUtil.upload(fileToCreate, pathPrefix); 
	    String attchmntPath = pathPrefix+this.uploadFileName;
	    storageUtil.storeAssignment(attchmntPath);
	    return "SUCCESS";  
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



}  