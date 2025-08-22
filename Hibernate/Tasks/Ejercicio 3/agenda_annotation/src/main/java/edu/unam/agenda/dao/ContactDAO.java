package edu.unam.agenda.dao;

import edu.unam.agenda.model.Contact;
import java.util.List;

public interface ContactDAO {
    Contact  getContactById(int id);
    List<Contact> getAll();
    Boolean insert(Contact contact);
}

