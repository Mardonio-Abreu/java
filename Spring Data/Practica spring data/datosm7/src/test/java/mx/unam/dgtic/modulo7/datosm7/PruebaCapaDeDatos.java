package mx.unam.dgtic.modulo7.datosm7;

import mx.unam.dgtic.modulo7.entities.Alumno;
import mx.unam.dgtic.modulo7.datosm7
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import static org.assertj.core.api.Assertions.assertThat;

//Por defecto, DataJPATest intenta habilitar una DB en memoria.

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PruebasCapaDatos {
    @Autowired
    private AlumnoRepository repo;

    @Test
    @Commit //Esto evita un roolback
    public void guardar(){
        Alumno al = new Alumno(null, "Santiago", "Bedolla", "Tae kwon do", 1.52,"Santi@email.com");
        Alumno guardado = repo.save(al);
        assertThat(guardado).isNotNull();
    }

    @Test
    public void eliminar(){
        Alumno alumno = (null, "Santiago", "Hernandez Bonilla", 1.4, "Santiago@correo.com");

        Alumno guardado = repo.save(alumno);
        Long id = guardado.getId();

        repo.deleteById(id);

        assertThat(repo.findById(id).id Empty);
    }

    @Test
    public void buscarTodos(){
        Alumno alumno01 = new Alumno(null, "Santiago", "Bedolla", "Tae kwon do", 1.52,"Santi@email.com");
        Alumno alumno02 = new Alumno(null, "Diana", "Bedolla", "Tae kwon do", 1.52,"Santi@email.com");

        repo.save(alumno01);
        repo.save(alumno02);

        Iterable<Alumno> todos = repo.findAll();
        assertThat(todos).isNotNull();
        assertThat(todos).hasSize(2);
    }

}