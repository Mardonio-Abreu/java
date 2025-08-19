package unam.diplomado.pixup.model.disco;

import java.util.Optional;

public interface DiscoRepository {
    Optional<Disco> findByTituloAndArtista(String titulo, Integer id);
}
