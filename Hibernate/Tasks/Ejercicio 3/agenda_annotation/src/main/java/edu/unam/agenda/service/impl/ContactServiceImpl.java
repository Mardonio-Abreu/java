package edu.unam.agenda.service.impl;

import edu.unam.agenda.dao.ContactDAO;
import edu.unam.agenda.dao.impl.ContactDAOImpl;
import edu.unam.agenda.model.Contact;
import edu.unam.agenda.model.MeansContact;
import edu.unam.agenda.model.PhoneType;
import edu.unam.agenda.service.ContactService;

import java.util.List;

public class ContactServiceImpl implements ContactService {
	
	private static ContactServiceImpl instance;
	private static final ContactDAO contactDAO = ContactDAOImpl.getInstance();
	
	private ContactServiceImpl() {}
	
	public static ContactServiceImpl getInstance() {
		if (instance == null) {
			instance = new ContactServiceImpl();
		}
		return instance;
	}

	public Contact getContactById(int id) {
		return contactDAO.getContactById(id);
	}

	public List<Contact> getAllContacts() {
		return contactDAO.getAll();
	}

	public Boolean saveContact(Contact contact) {
		return contactDAO.insert(contact);
	}



}
