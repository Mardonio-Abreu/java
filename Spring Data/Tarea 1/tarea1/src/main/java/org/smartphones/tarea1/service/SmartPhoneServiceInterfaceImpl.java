package org.smartphones.tarea1.service;

import org.smartphones.tarea1.model.SmartPhone;
import org.smartphones.tarea1.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartPhoneServiceInterfaceImpl implements SmartPhoneServiceInterface {

    private final SmartphoneRepository smartphoneRepository;

    @Autowired
    public SmartPhoneServiceInterfaceImpl(SmartphoneRepository smartphoneRepository) {
        this.smartphoneRepository = smartphoneRepository;
    }


    @Override
    public SmartPhone create(SmartPhone smartPhone) {
        SmartPhone smartPhoneEntity = smartphoneRepository.save(smartPhone);
        return smartPhoneEntity;
    }

    @Override
    public SmartPhone findById(int id) {
        SmartPhone smartPhoneEntity = smartphoneRepository.findById(id).orElse(null);
        return smartPhoneEntity;
    }


    @Override
    public void update(SmartPhone smartPhone, Integer id) {
        smartphoneRepository.findById(id).ifPresent(smartphone -> {
            smartphoneRepository.save(smartPhone);
        });
    }

    @Override
    public void deleteById(int id) {
        smartphoneRepository.findById(id).ifPresent(smartphone -> {
            smartphoneRepository.delete(smartphone);
        });

    }
}
