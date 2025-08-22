package unam.diplomado.pixup.model.artista;

import java.util.Optional;

public interface ArtistaRepository {
    Optional<Artista> findById(Integer id);
    Optional<Artista> findByName(String name);
}
