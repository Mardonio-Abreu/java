package edu.unam.agenda.dao.impl;

import edu.unam.agenda.dao.ContactDAO;
import edu.unam.agenda.hibernate.HibernateUtil;
import edu.unam.agenda.model.Contact;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;


    public class ContactDAOImpl implements ContactDAO {

        private static ContactDAOImpl instance;

        private ContactDAOImpl() {
        }

        public static ContactDAOImpl getInstance() {
            if (instance == null)
                instance = new ContactDAOImpl();
            return instance;
        }

        public Contact getContactById(int id) {
            Contact contact = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                contact = session.get(Contact.class, id);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return contact;
        }

        public List<Contact> getAll() {
            List<Contact> contactList = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                Query<Contact> query = session.createQuery("FROM Contact", Contact.class);
                contactList = query.list();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return contactList;
        }

        public Boolean insert(Contact contact) {
            Boolean save = Boolean.FALSE;
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                session.save(contact);
                transaction.commit();
                save = Boolean.TRUE;
            } catch (Exception e) {
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
            }
            return save;
        }



    }
