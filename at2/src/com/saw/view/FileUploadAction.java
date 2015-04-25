package com.saw.view;

import java.io.File;

import org.apache.commons.io.FileUtils;

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
	
	public String uploadDoc() {  
	    try {  
	    String filePath = "D:/tempupload/docs";  
	    System.out.println("Doc Location:" + filePath);//see the server console for actual location  
	    File fileToCreate = new File(filePath, this.uploadFileName);  
	    FileUtils.copyFile(this.upload, fileToCreate);//copying image in the new file  
	    storageUtil = new StorageUtil();
	    storageUtil.upload(fileToCreate, "docs/");
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



}  