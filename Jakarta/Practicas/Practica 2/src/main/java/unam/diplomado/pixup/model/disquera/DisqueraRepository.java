package unam.diplomado.pixup.model.disquera;

import java.util.Optional;

public interface DisqueraRepository {
    Optional<Disquera> findById(Integer id);
    Optional<Disquera> findByName(String name);
}


