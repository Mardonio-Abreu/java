package edu.unam.agenda.dao;

import java.util.List;
import edu.unam.agenda.model.ContactType;


public interface ContactTypeDAO {
    ContactType getContactTypeById(int id);
    List<ContactType> getAllContactType();
    Boolean insertContactType(ContactType contactType);
}
