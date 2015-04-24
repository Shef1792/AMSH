package com.saw.view;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.saw.util.StorageUtil;

public class FileUploadAction extends ActionSupport implements ServletRequestAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File doc;  
	private String docFileName;  
	private StorageUtil storageUtil;
	
	public String uploadDoc() {  
	    try {  
	    String filePath = "D:/tempupload/docs";  
	    System.out.println("Image Location:" + filePath);//see the server console for actual location  
	    File fileToCreate = new File(filePath, this.docFileName);  
	    FileUtils.copyFile(this.doc, fileToCreate);//copying image in the new file  
	    storageUtil = StorageUtil.getInstance();
	    storageUtil.upload(fileToCreate, "docs/");
	    return "SUCCESS";  
	    }catch(Exception e){
	    	return null;
	    }  
	}
	
	public String uploadVideo() {
		 try {  
			    String filePath = "D:/tempupload/vids";  
			    System.out.println("Image Location:" + filePath);//see the server console for actual location  
			    File fileToCreate = new File(filePath, this.docFileName);  
			    FileUtils.copyFile(this.doc, fileToCreate);//copying image in the new file  
			    storageUtil = StorageUtil.getInstance();
			    storageUtil.upload(fileToCreate, "vids/");
			    return "SUCCESS";  
			    }catch(Exception e){
			    	return null;
			    }  
	}
	public File getUserImage() {  
	    return doc;  
	}  
	public void setUserImage(File userImage) {  
	    this.doc = userImage;  
	}  
	public String getUserImageFileName() {  
	    return docFileName;  
	}  
	public void setUserImageFileName(String userImageFileName) {  
	    this.docFileName = userImageFileName;  
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}  
}  