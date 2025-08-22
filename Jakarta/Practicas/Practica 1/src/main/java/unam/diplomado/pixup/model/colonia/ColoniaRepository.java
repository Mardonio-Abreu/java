package unam.diplomado.pixup.model.colonia;

import java.util.Collection;
import java.util.Optional;

import unam.diplomado.pixup.model.colonia.Colonia;

public interface ColoniaRepository {

    Collection<Colonia> findByCp(String Cp);
    Optional<Colonia> findById(Integer id);
}
