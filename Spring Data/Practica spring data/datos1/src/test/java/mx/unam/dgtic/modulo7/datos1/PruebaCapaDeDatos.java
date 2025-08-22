package mx.unam.dgtic.modulo7.datos1;

import mx.unam.dgtic.modulo7.datos1.entities.Alumno;
import mx.unam.dgtic.modulo7.datos1.repositories.AlumnoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import static org.assertj.core.api.Assertions.assertThat;

//Por defecto DataJPATest intenta habilitar una BD en memoria.
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PruebaCapaDeDatos {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Test
    //@Commit
    public void guardar() {
        Alumno alumno = new Alumno(null, "Santiago", "Hernandez", "Psicologia", 1.81, "Joe@email.com");
        Alumno alumnoGuardado = alumnoRepository.save(alumno);
        assertThat(alumnoGuardado).isNotNull();
    }

}
