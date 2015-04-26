package com.saw.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import com.saw.model.assignment;
import com.saw.util.AtUtils;

public class AssignmentManagement extends AtUtils {
	
	public List<String> getStudentAssignment(){
		Session session = AtUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String hql = "select count(*) from student";
			Query query = session.createQuery(hql);
			int results = query.executeUpdate();
			return null;
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
	
	public int getAssignmentId(){
		Session session = AtUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria cr = session.createCriteria(assignment.class);
			cr.setProjection(Projections.rowCount());
			List rowCount = cr.list();
			int aID = (int) rowCount.get(0);
			tx.commit();
			return aID++;
		} catch (Exception e){
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
			return -1;
		} finally {
			session.close();
		}
	}
	
	public int storeAssignment(assignment currAssngmnt){
		
		Session session = AtUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(currAssngmnt);
			tx.commit();
			return 1;
		} catch (Exception e){
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
			return -1;
		} finally {
			session.close();
		}
	}

}
