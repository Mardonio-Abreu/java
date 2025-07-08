package edu.unam.agenda.service.impl;

import edu.unam.agenda.dao.MeansContactDAO;
import edu.unam.agenda.dao.impl.MeansContactDAOImpl;
import edu.unam.agenda.model.MeansContact;
import edu.unam.agenda.service.MeansContactService;

import java.util.List;

public class MeansContactServiceImpl implements MeansContactService {
	
	private static MeansContactServiceImpl instance;
	private static MeansContactDAO meansContactoDAO = MeansContactDAOImpl.getInstance();
	
	private MeansContactServiceImpl() {}
	
	public static MeansContactServiceImpl getInstance() {
		if (instance == null) {
			instance = new MeansContactServiceImpl();
		}
		return instance;
	}

	public MeansContact getMeansContactById(int id) {
		return meansContactoDAO.getMeansContactById(id);
	}

	public List<MeansContact> getAllMeansContacts() { return meansContactoDAO.getMeansContactAll();}

	public Boolean saveMeansContact(MeansContact meansContacto) {
		return meansContactoDAO.insertMeansContact(meansContacto);
	}

}
