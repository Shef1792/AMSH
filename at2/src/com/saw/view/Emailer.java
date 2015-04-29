package com.saw.view;



import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.struts2.util.TokenHelper;

import com.opensymphony.xwork2.ActionSupport;
import com.saw.util.StorageUtil;

public class Emailer extends ActionSupport {

   /**
	 * 
	 */
   private static final long serialVersionUID = 1L;
   private String to;
   private String tokenName;
   private StorageUtil storageUtil;
   

   static Properties properties = new Properties();
   static
   {
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.socketFactory.port", "465");
      properties.put("mail.smtp.socketFactory.class",
                     "javax.net.ssl.SSLSocketFactory");
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.port", "465");
   }

   public String execute() 
   {
      String success = SUCCESS;
      try
      {
         Session session = Session.getDefaultInstance(properties,  
            new javax.mail.Authenticator() {
            protected PasswordAuthentication 
            getPasswordAuthentication() {
            return new 
            PasswordAuthentication("iatulyasingh@gmail.com","Iajinkyawakhale");
            }});

         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress("iatulyasingh@gmail.com"));
         message.setRecipients(Message.RecipientType.TO, 
            InternetAddress.parse(to));
         message.setSubject("Reset Password");
         message.setText("http://localhost:8080/at2/Forgotpwd.jsp?tok="+getTokenName());
         Transport.send(message);
         return success;
      }
      catch(Exception e)
      {
         success = ERROR;
         e.printStackTrace();
      }
      return success;
   }

  public String loadEmailToken(){
	  tokenName = TokenHelper.generateGUID();
	  return "success";
  }

   public String getTo() {
      return to;
   }

   public void setTo(String to) {
      this.to = to;
   }



	public String getTokenName() {
		return tokenName;
	}
	
	
	
	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	/**
	 * @return the storageUtil
	 */
	public StorageUtil getStorageUtil() {
		return storageUtil;
	}

	/**
	 * @param storageUtil the storageUtil to set
	 */
	public void setStorageUtil(StorageUtil storageUtil) {
		this.storageUtil = storageUtil;
	}

  
   }

