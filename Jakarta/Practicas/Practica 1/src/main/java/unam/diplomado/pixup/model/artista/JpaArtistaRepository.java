package unam.diplomado.pixup.model.artista;

import jakarta.ejb.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import unam.diplomado.pixup.model.artista.Artista;
import unam.diplomado.pixup.model.disquera.DisqueraRepository;

import java.util.Optional;

@Singleton
public class JpaArtistaRepository implements ArtistaRepository {

    @PersistenceContext(unitName = "pixup")
    private EntityManager entityManager;

    @Override
    public Optional<Artista> findById(Integer id) {
       Artista artista = entityManager.find(Artista.class, id);
        return artista != null ? Optional.of(artista) : Optional.empty();
    }
}
