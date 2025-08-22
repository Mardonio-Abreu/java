package edu.unam.agenda.dao.impl;

import edu.unam.agenda.dao.ContactTypeDAO;
import edu.unam.agenda.model.ContactType;
import edu.unam.agenda.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ContactTypeDAOImpl  implements ContactTypeDAO {

    private static ContactTypeDAOImpl instance;

    private ContactTypeDAOImpl() {
    }

    public static ContactTypeDAOImpl getInstance() {
        if (instance == null)
            instance = new ContactTypeDAOImpl();
        return instance;
    }


    public ContactType getContactTypeById(int id) {
        ContactType contactType = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            contactType = session.get(ContactType.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactType;
    }


    public List<ContactType> getAllContactType() {
        List<ContactType> contactTypeList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<ContactType> query = session.createQuery("FROM ContactType", ContactType.class);
            contactTypeList = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactTypeList;
    }


    public Boolean insertContactType(ContactType contactType) {
        Boolean save = Boolean.FALSE;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(contactType);
            transaction.commit();
            save = Boolean.TRUE;
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        return save;
    }
}








