package org.smartphones.tarea1.service;

import org.smartphones.tarea1.model.SmartPhone;

public interface SmartPhoneServiceInterface {

    SmartPhone create(SmartPhone smartPhone);
    SmartPhone findById(int id);
    void update(SmartPhone smartPhone, Integer id);
    void deleteById(int id);

}
