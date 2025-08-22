package mx.unam.dgtic.modulo7.datos1;

import mx.unam.dgtic.modulo7.datos1.entities.Alumno;
import mx.unam.dgtic.modulo7.datos1.repositories.AlumnoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
//Pruebas de sistema
class Datos1ApplicationTests {
    @Autowired
    private AlumnoRepository alumnoRepository;
    //Lo adecuado es hacerlo atraves de un servicio @Service

	@Test
	void contextLoads() {
	}

    @Test
    public void insertar() {
        Alumno alumno = new Alumno(null, "juan", "perez", "derecho", 1.66, "joe@correo.com");
        Alumno alumnoGuardado = alumnoRepository.save(alumno);
        assertThat(alumnoGuardado).isNotNull();
    }

    @Test
    public void consultar() {
        alumnoRepository.findById(1L);
        Optional<Alumno> alumno = alumnoRepository.findById(1L);
        if (alumno.isPresent()) {
            System.out.println("Alumno: " + alumno.get());
        }else System.out.println("Alumno no encontrado");
    }

    @Test
    public void todos()  {
        alumnoRepository.findAll().forEach(System.out::println);
    }

    @Test
    public void modificar() {
        alumnoRepository.findById(1L);
        Optional<Alumno> alumno = alumnoRepository.findById(1L);
        if (alumno.isPresent()) {
            Alumno alumnoModificado = alumno.get();
            alumnoModificado.setNombre("perenganito");
            alumnoModificado.setApellido("Itanito");
            alumnoModificado.setCarrera("Ing Computacion");
            alumnoRepository.save(alumnoModificado);
        }
    }

    @Test
    public void eliminar() {
        alumnoRepository.findById(2L);
        Optional<Alumno> alumno = alumnoRepository.findById(1L);
        if (alumno.isPresent()) {
            Alumno al = alumno.get();
            System.out.println("Alumno a eliminar: " + al);
            alumnoRepository.delete(al);
        }

    }


}
