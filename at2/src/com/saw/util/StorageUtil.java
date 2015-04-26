package com.saw.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.struts2.interceptor.SessionAware;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.opensymphony.xwork2.ActionContext;
import com.saw.controller.AssignmentManagement;
import com.saw.model.assignment;
import com.saw.model.useraccess;

public class StorageUtil implements SessionAware {
	private BasicAWSCredentials credentials;
    private AmazonS3 s3;
    private String bucketName;
    private Map<String, Object> session;
    private static volatile StorageUtil  storageUtil = new  StorageUtil();
    private assignment currentAssignment = new assignment();
    private AssignmentManagement asgnMgmt = new AssignmentManagement();
    public StorageUtil(){
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("D:/workspaces/at2/WebContent/WEB-INF/AwsCredentials.properties"));
            this.credentials = new   BasicAWSCredentials(properties.getProperty("accessKey"),
                                                         properties.getProperty("secretKey"));
            this.bucketName = "educarebhd";
            this.s3 = new AmazonS3Client(this.credentials);
 
            /*
               You can use this in your web app where    AwsCredentials.properties is stored in web-inf/classes
             */
           // AmazonS3 s3 = new AmazonS3Client(new ClasspathPropertiesFileCredentialsProvider());
 
        }catch(Exception e){
            System.out.println("exception while creating awss3client : " + e);
        }
    }
 
    public static StorageUtil getInstance(){
    	if(storageUtil == null){
    		storageUtil = new StorageUtil();
    	}
        return storageUtil;
    }
 
    public static AmazonS3 getAWSClient(){
         return storageUtil.s3;
    }
 
    public static AmazonS3 getBucketName(){
         return storageUtil.s3;
    }
 
    public void upload(File file,String path){
        /**
         * key should be unique. an whatever key you set will be used to in url path to access the pic.
         */
        String key = path + file.getName();
        s3.putObject(this.bucketName, key, file);
    }
 
    public List<Bucket> listBuckets(){
        for (Bucket bucket : s3.listBuckets()) {
                System.out.println(" bucket name - " + bucket.getName());
        }
 
        return s3.listBuckets();
    }
 
    public void getObjectList(){
        System.out.println("Listing objects");
        ObjectListing objectListing = s3.listObjects(new ListObjectsRequest()
                .withBucketName(bucketName)
                .withPrefix("ads"));
        for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {
            System.out.println(" - " + objectSummary.getKey() + "  " +
                               "(size = " + objectSummary.getSize() + ")");
        }
    }
 
    public void getFileFromS3(String key){
        System.out.println("Downloading an object");
        S3Object object = s3.getObject(new GetObjectRequest(this.bucketName, key));
        System.out.println("Content-Type: "  + object.getObjectMetadata().getContentType());
 
    }
    
    public void storeAssignment(String attachment){ //2 calls for teacher and student table both
    	session = ActionContext.getContext().getSession();
    	if(session !=null){
    		currentAssignment.setsID(((useraccess)session.get("user")).getId());
    		String aID = "AS"+asgnMgmt.getAssignmentId();
    		currentAssignment.setaID(aID);
    		currentAssignment.setAttachment(attachment);
    		asgnMgmt.storeAssignment(currentAssignment);
    	}
    	
    }

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	
}

