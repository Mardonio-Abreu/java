package unam.diplomado.pixup.model.colonia;

import jakarta.ejb.Singleton;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import unam.diplomado.pixup.model.colonia.ColoniaRepository;
import unam.diplomado.pixup.model.colonia.Colonia;


@Singleton
public class JpaTipoDeColoniaRepository implements ColoniaRepository {

    @PersistenceContext(unitName = "pixup")
    private EntityManager entityManager;

    @Override
    public Collection<Colonia> findByCp(String Cp) {
        TypedQuery<Colonia> query = entityManager.createQuery("SELECT c FROM Colonia c WHERE c.cp = ?1", Colonia.class);
        query.setParameter(1, Cp);
        return query.getResultList();
    }

    @Override
    public Optional<Colonia> findById(Integer id) {
        Colonia colonia = entityManager.find(Colonia.class, id);
        return colonia != null ? Optional.of(colonia) : Optional.empty();
    }
}
