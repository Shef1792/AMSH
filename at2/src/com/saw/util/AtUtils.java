/**
 * 
 */
package com.saw.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author bhd
 *
 */
public class AtUtils {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	public static final int ROLE_TEACHER = 1;
	public static final int ROLE_STUDENT = 2;
	/**
	 * 
	 */
	public AtUtils() {
	}
	
	
	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();  
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

} 
 