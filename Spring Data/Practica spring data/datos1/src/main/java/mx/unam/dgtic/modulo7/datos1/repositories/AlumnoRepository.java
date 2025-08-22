package mx.unam.dgtic.modulo7.datos1.repositories;

import mx.unam.dgtic.modulo7.datos1.entities.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
    //Nada más, MAGIC!
    //TODO escribir consultas personalisadas
}
