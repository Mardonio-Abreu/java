package org.smartphones.tarea1;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.smartphones.tarea1.model.SmartPhone;
import org.smartphones.tarea1.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest (classes={Tarea1Application.class})
@Transactional
@ComponentScan(basePackages = "org.smartphones")
class Tarea1ApplicationTests {

    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Test
    void contextLoads() { }

    @Test
    void testCreate() {
        SmartPhone smartphone = new SmartPhone();
        smartphone.setModelo("Samsung");
        smartphone.setNumeroSerie(123456);
        smartphone.setPrecio(800.0);

        smartphoneRepository.save(smartphone);

        int id = smartphone.getId();

        assertTrue(smartphoneRepository.findById(id).isPresent());
    }

    @Test
    void testFindAll() {
        SmartPhone smartphone = new SmartPhone();
        smartphone.setModelo("Samsung");
        smartphone.setNumeroSerie(123456);
        smartphone.setPrecio(800.0);

        smartphoneRepository.save(smartphone);

        List<SmartPhone> smartPhones = smartphoneRepository.findAll();

        assertFalse(smartPhones.isEmpty());
    }

    @Test
    void testFindById() {
        SmartPhone smartphone = new SmartPhone();
        smartphone.setModelo("Samsung");
        smartphone.setNumeroSerie(123456);
        smartphone.setPrecio(9000.0);

        smartphoneRepository.save(smartphone);

        int id = smartphone.getId();

        Optional<SmartPhone> smartPhone01 = smartphoneRepository.findById(id);
        assertTrue(smartPhone01.isPresent());
        assertEquals(smartphone.getModelo(), smartPhone01.get().getModelo());
    }


    @Test
    void testUpdate() {
        SmartPhone smartphone = new SmartPhone();
        smartphone.setModelo("Samsung");
        smartphone.setNumeroSerie(123456);
        smartphone.setPrecio(9000.0);

        smartphoneRepository.save(smartphone);

        int id = smartphone.getId();

        Optional<SmartPhone> smartPhoneToUpdate = smartphoneRepository.findById(id);

        if (smartPhoneToUpdate.isPresent()) {
            smartPhoneToUpdate.get().setModelo("SamsungCambiao");
        } else throw new RuntimeException("No se encontro el registro");

        smartphoneRepository.save(smartPhoneToUpdate.get());

        Optional<SmartPhone> smartPhoneUpdated = smartphoneRepository.findById(id);

        assertEquals(smartPhoneUpdated.get().getModelo(), "SamsungCambiao");

    }

    @Test
    void testDelete() {
        SmartPhone smartphone = new SmartPhone();
        smartphone.setModelo("Samsung");
        smartphone.setNumeroSerie(123456);
        smartphone.setPrecio(9000.0);

        smartphoneRepository.save(smartphone);

        int id = smartphone.getId();

        smartphoneRepository.deleteById(id);

        assertFalse(smartphoneRepository.findById(id).isPresent());
    }
}
