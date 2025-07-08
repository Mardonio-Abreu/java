package edu.unam.agenda.dao;

import edu.unam.agenda.model.PhoneType;
import java.util.List;

public interface PhoneTypeDAO {
    PhoneType getPhoneTypeById(int id);
    List<PhoneType> getAllPhoneTypes();
    Boolean insertPhoneType(PhoneType phoneType);
}
