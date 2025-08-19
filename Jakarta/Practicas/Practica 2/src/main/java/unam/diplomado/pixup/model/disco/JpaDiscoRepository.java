package unam.diplomado.pixup.model.disco;

import jakarta.ejb.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import unam.diplomado.pixup.model.TipoDomicilio;

import java.util.List;
import java.util.Optional;

@Singleton
public class JpaDiscoRepository implements DiscoRepository {

    @PersistenceContext (unitName = "pixup")
    private EntityManager entityManager;

    @Override
    public Optional<Disco> findByTituloAndArtista(String titulo, Integer id) {
        TypedQuery<Disco> query = entityManager.createQuery(
                "SELECT d FROM Disco d WHERE d.titulo = :titulo AND d.artista.id = :id", Disco.class);
        query.setParameter("titulo", titulo);
        query.setParameter("id", id);

        List<Disco> result = query.getResultList();
        return result.isEmpty() ? Optional.empty() : Optional.of(result.get(0));
    }

    public Disco save(Disco disco) {
        entityManager.persist(disco);
        return disco;
    }

}
