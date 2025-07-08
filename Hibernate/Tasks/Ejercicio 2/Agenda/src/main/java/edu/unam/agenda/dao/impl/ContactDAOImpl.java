package edu.unam.agenda.dao.impl;

import edu.unam.agenda.dao.ContactDAO;
import edu.unam.agenda.hibernate.HibernateUtil;
import edu.unam.agenda.model.Contact;
import edu.unam.agenda.model.ContactType;
import edu.unam.agenda.model.MeansContacts;
import edu.unam.agenda.model.PhoneType;
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

	@Override
	public Contact getContactById(Integer id) {
		Contact contact = null;
		//completar
		return contact;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contactList = null;
		//completar
		return contactList;
	}

	@Override
	public Boolean insertContact(Contact contact) {
		Boolean save = Boolean.FALSE;
		//completar
		return save;
	}

	@Override
	public Boolean updateContact(Contact contact) {
		Boolean update = Boolean.FALSE;
		//completar
		return update;
	}

	@Override
	public Boolean deleteContact(Contact contact) {
		Boolean delete = Boolean.FALSE;
		//completar
		return delete;
	}

	@Override
	public List<MeansContacts> getPhoneTypes(PhoneType phoneType) {
		List<MeansContacts> meansContactsList = null;
		//completar
		return meansContactsList;
	}

    public static class ContactTypeDAOImpl {

        private static ContactTypeDAOImpl instance;

        private ContactTypeDAOImpl() {
        }

        public static ContactTypeDAOImpl getInstance() {
            if (instance == null)
                instance = new ContactTypeDAOImpl();
            return instance;
        }

        public ContactType getContactTypeById(Integer id) {
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


        public Boolean updateContactType(ContactType contactType) {
            Boolean update = Boolean.FALSE;
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                session.update(contactType);
                transaction.commit();
                update = Boolean.TRUE;
            } catch (Exception e) {
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
            }
            return update;
        }


        public Boolean deleteContactType(ContactType contactType) {
            Boolean delete = Boolean.FALSE;
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                session.delete(contactType);
                transaction.commit();
                delete = Boolean.TRUE;
            } catch (Exception e) {
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
            }
            return delete;
        }
    }
}
