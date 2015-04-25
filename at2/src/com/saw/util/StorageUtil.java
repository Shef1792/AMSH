package com.saw.util;

import java.io.*;
import java.util.*;

import com.amazonaws.auth.*;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.*;

public class StorageUtil {
	private BasicAWSCredentials credentials;
    private AmazonS3 s3;
    private String bucketName;
    private static volatile StorageUtil  storageUtil = new  StorageUtil();
    public StorageUtil(){
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("D:/testwrk/at2/WebContent/WEB-INF/AwsCredentials.properties"));
            this.credentials = new   BasicAWSCredentials(properties.getProperty("accessKey"),
                                                         properties.getProperty("secretKey"));
            this.bucketName = "educarebhd";
            this.s3 = new AmazonS3Client(this.credentials);
 
            /*
               You can use this in your web app where    AwsCredentials.properties is stored in web-inf/classes
             */
            AmazonS3 s3 = new AmazonS3Client(new ClasspathPropertiesFileCredentialsProvider());
 
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
 
    public static void main(String args[]){
        File file = new File("D:/pics/cam/IMG_1201.jpg");
        StorageUtil aWSStorageUtil = StorageUtil.getInstance();
        //aWSStorageUtil.upload(file);
        aWSStorageUtil.getObjectList();
 
    }
 
}

