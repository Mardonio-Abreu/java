package edu.unam.agenda.service;

import edu.unam.agenda.model.PhoneType;

import java.util.List;

public interface PhoneTypeService {
    PhoneType getPhoneTypeById(int id);
    List<PhoneType> getAllPhoneTypes();
    Boolean savePhoneType(PhoneType PhoneType);
}