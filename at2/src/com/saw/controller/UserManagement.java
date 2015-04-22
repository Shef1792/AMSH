package com.saw.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.saw.model.useraccess;
import com.saw.util.AtUtils;

public class UserManagement extends AtUtils{

	@SuppressWarnings("unused")
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
}
