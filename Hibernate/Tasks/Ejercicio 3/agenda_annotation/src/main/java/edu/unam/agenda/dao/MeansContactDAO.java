package edu.unam.agenda.dao;

import edu.unam.agenda.model.MeansContact;
import java.util.List;

public interface MeansContactDAO {
    MeansContact getMeansContactById(int id);
    List<MeansContact> getMeansContactAll();
    Boolean insertMeansContact(MeansContact meansContact);
}
