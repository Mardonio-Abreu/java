package edu.unam.agenda.service;

import edu.unam.agenda.model.ContactType;

import java.util.List;

public interface ContactTypeService {
    ContactType getContactTypeById(int id);
    List<ContactType> getAllContactTypes();
    Boolean saveContactType(ContactType contactType);
}