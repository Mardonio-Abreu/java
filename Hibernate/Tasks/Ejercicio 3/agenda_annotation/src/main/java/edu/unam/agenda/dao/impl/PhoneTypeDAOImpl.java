package edu.unam.agenda.dao.impl;

import edu.unam.agenda.dao.PhoneTypeDAO;
import edu.unam.agenda.model.PhoneType;
import edu.unam.agenda.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class PhoneTypeDAOImpl implements PhoneTypeDAO {
	private static PhoneTypeDAOImpl instance;

	private PhoneTypeDAOImpl() {
	}

	public static PhoneTypeDAOImpl getInstance() {
		if (instance == null)
			instance = new PhoneTypeDAOImpl();
		return instance;
	}

	public PhoneType getPhoneTypeById(int id) {
		PhoneType phoneType = null;
		try {
            Session session = HibernateUtil.getSessionFactory().openSession();
			// se inicia una transaccion
			session.beginTransaction();
			phoneType = session.get(PhoneType.class, id);
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return phoneType;
	}
	
	public List<PhoneType> getAllPhoneTypes() {
		List<PhoneType> phoneTypeList = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// se inicia una transaccion
			session.beginTransaction();
			//listPhoneType = session.createQuery("SELECT t FROM PhoneType t WHERE t.estatus = 'ACTIVO' ").list();
			phoneTypeList = session.createQuery("SELECT t FROM PhoneType t WHERE t.status = 'ACTIVO' ", PhoneType.class).getResultList();
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return phoneTypeList;
	}
	
		public Boolean insertPhoneType(PhoneType phoneType) {
		Boolean save = Boolean.FALSE;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// se inicia una transaccion
			session.beginTransaction();
			session.persist(phoneType);
			// se realiza el commit
			session.getTransaction().commit();
			// se cierra la session hibernate
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return save;
	}
	

}
