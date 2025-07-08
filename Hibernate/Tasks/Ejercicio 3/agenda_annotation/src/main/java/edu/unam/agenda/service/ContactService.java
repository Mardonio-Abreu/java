package edu.unam.agenda.service;

import edu.unam.agenda.model.Contact;

import java.util.List;

public interface ContactService {
    Contact getContactById(int id);
    List<Contact> getAllContacts();
    Boolean saveContact(Contact contact);
}