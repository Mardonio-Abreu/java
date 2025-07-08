package edu.unam.agenda.service;

import edu.unam.agenda.model.MeansContact;

import java.util.List;

public interface MeansContactService {
    MeansContact getMeansContactById(int id);
    List<MeansContact> getAllMeansContacts();
    Boolean saveMeansContact(MeansContact meansContact);
}
