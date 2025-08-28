import org.junit.jupiter.api.Test;
import org.smartphones.tarea1.model.SmartPhone;
import org.smartphones.tarea1.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class Tarea2ApplicationTests {

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

    //Derived queries
    @Test
    void buscarPorPrecioMenorA(){
        var preciosMenoresA = smartphoneRepository.findByPrecioLessThan(5000.0);
        assertTrue(preciosMenoresA.size() == 8);

        var preciosMenoresB = smartphoneRepository.findByPrecioLessThan(1000.0);
        assertTrue(preciosMenoresB.size() == 0);
    }

    @Test
    void buscarPorPrecioMayorAAndMenorA(){
        var precioEntre01 = smartphoneRepository.findByPrecioBetween(1000.0, 2000.0);
        assertTrue(precioEntre01.size() == 6);

        var precioEntre02 = smartphoneRepository.findByPrecioBetween(2000.0, 3000.0);
        assertTrue(precioEntre02.size() == 3);
    }

    @Test
    void buscarModelosDistintos(){
        var modelosDiferentes = smartphoneRepository.findDistinctByModelo("Nokia");
        assertTrue(modelosDiferentes.size() == 1);
    }

    @Test
    void buscarLosTelefonos(){
        var todosLostelefonos = smartphoneRepository.findEveryPhone();
        assertTrue(todosLostelefonos.size() == 8);
    }

    @Test
    void buscarTodosLosModelos(){
        var todosLosModelos = smartphoneRepository.findEveryModelo();
        assertTrue(todosLosModelos.size() == 8);
    }

    @Test
    void buscarModeloConPrecio(){
        SmartPhone modeloConPrecio = smartphoneRepository.findByPrecio(1900.0);
        assertEquals("Xiaomi", modeloConPrecio.getModelo());
    }


}
