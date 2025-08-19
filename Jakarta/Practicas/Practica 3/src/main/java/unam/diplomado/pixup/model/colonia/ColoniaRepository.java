package unam.diplomado.pixup.model.colonia;

import java.util.Collection;
import java.util.Optional;

import unam.diplomado.pixup.model.colonia.Colonia;

public interface ColoniaRepository {

    Collection<Colonia> findByCp(String cp);
    Optional<Colonia> findById(Integer id);
    Colonia saveOrUpdate(Colonia colonia);
    void delete(Colonia colonia);
    Optional<Colonia> findByCpAndNombre(String cp, String nombre);
}
