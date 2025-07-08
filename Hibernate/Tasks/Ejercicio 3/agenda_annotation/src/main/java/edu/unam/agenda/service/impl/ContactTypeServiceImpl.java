package edu.unam.agenda.service.impl;

import edu.unam.agenda.dao.ContactTypeDAO;
import edu.unam.agenda.dao.impl.ContactTypeDAOImpl;
import edu.unam.agenda.model.ContactType;
import edu.unam.agenda.service.ContactTypeService;

import java.util.List;

public class ContactTypeServiceImpl implements ContactTypeService {
	
	private static ContactTypeServiceImpl instance;
	private static final ContactTypeDAO contactTypeDAO = ContactTypeDAOImpl.getInstance();

	private ContactTypeServiceImpl() {}
	
	public static ContactTypeServiceImpl getInstance() {
		if (instance == null) {
			instance = new ContactTypeServiceImpl();
		}
		return instance;
	}
	
	public List<ContactType> getAllContactTypes() {
		return contactTypeDAO.getAllContactType();
	}
	
	public ContactType getContactTypeById(int id) {

		return contactTypeDAO.getContactTypeById(id);
	}

	public Boolean saveContactType(ContactType contactType) {

		return contactTypeDAO.insertContactType(contactType);
	}
	

}
