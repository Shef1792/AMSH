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
	
	public List<assignment> getStudentAssignment(String studentId){
		Session session = AtUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String hql = "from assignment as asgn where asgn.sID = :studentID";
			Query query = session.createQuery(hql);
			query.setParameter("studentID",studentId);
			List<assignment> results = query.list();
			if (!results.isEmpty()){
				return results;
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
	
	public List<assignment> getTeacherAssignment(String clas,String subject){
		Session session = AtUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String hql = "from assignment as asgn where asgn.clas = :clas and asgn.subject = :subject";
			Query query = session.createQuery(hql);
			query.setParameter("clas",clas);
			query.setParameter("subject",subject);
			List<assignment> results = query.list();
			if (!results.isEmpty()){
				return results;
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
	
	public int getAssignmentId(){
		Session session = AtUtils.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria cr = session.createCriteria(assignment.class);
			cr.setProjection(Projections.rowCount());
			List rowCount = cr.list();
			long aID = (long) rowCount.get(0);
			tx.commit();
			return (int) ++aID;
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
