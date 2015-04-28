package com.saw.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.saw.model.useraccess;
import com.saw.util.AtUtils;

public class UserManagement extends AtUtils{

	public useraccess login(String username, String password){
		Session session = AtUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String hql = "FROM useraccess UAT WHERE UAT.name = :username AND UAT.password = :pwd";
			Query query = session.createQuery(hql);
			query.setParameter("username",username);
			query.setParameter("pwd",password);
			@SuppressWarnings("unchecked")
			List<useraccess> results = query.list();
			if (!results.isEmpty()){
				return results.get(0);
			}
			else return null;
		} catch (Exception e){
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
		
	}
	
	public String registerUser(useraccess currentUser){
		Session session = AtUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String hql = "SELECT count(*) from useraccess UAT where UAT.role = :role";
			Query query = session.createQuery(hql);
			query.setParameter("role",currentUser.getRole());
			@SuppressWarnings("rawtypes")
			List results = query.list();
			long counter = (long) results.get(0);
			String uId;
			counter+=1;
			if(currentUser.getRole() == AtUtils.ROLE_TEACHER){
				uId = "TS"+counter;
				currentUser.setId(uId);
			}else if (currentUser.getRole() == AtUtils.ROLE_STUDENT){
				uId = "ST"+counter;
				currentUser.setId(uId);
			}
			session.save(currentUser);
			tx.commit();
			if(currentUser.getRole() == AtUtils.ROLE_TEACHER){
				return "successTS";
			}else if (currentUser.getRole() == AtUtils.ROLE_STUDENT){
				return "successST";
			}
			return "error";
			
		} catch (Exception e){
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
			return "error";
		} finally {
			session.close();
		}		
	}
}
