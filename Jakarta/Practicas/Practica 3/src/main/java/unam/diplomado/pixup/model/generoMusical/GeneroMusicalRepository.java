package unam.diplomado.pixup.model.generoMusical;

import java.util.Optional;


public interface GeneroMusicalRepository {

    Optional<GeneroMusical> findById(Integer id);
    Optional<GeneroMusical> findByName(String name);
}
