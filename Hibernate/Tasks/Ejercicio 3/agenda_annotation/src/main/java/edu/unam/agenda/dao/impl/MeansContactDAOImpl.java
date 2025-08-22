package edu.unam.agenda.dao.impl;

import edu.unam.agenda.dao.MeansContactDAO;
import edu.unam.agenda.hibernate.HibernateUtil;
import edu.unam.agenda.model.MeansContact;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


public class MeansContactDAOImpl implements MeansContactDAO {

	private static MeansContactDAOImpl instance;

	private MeansContactDAOImpl() {
	}

	public static MeansContactDAOImpl getInstance() {
		if (instance == null)
			instance = new MeansContactDAOImpl();
		return instance;
	}

	public MeansContact getMeansContactById(int id) {
		MeansContact meansContact = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			meansContact = session.get(MeansContact.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return meansContact;
	}

	public List<MeansContact> getMeansContactAll() {
		List<MeansContact> meansContactList = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Query<MeansContact> query = session.createQuery("FROM MeansContact", MeansContact.class);
			meansContactList = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return meansContactList;
	}

	public Boolean insertMeansContact(MeansContact meansContact) {
		Boolean save = Boolean.FALSE;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(meansContact);
			transaction.commit();
			save = Boolean.TRUE;
		} catch (Exception e) {
			if (transaction != null) transaction.rollback();
			e.printStackTrace();
		}
		return save;
	}}

