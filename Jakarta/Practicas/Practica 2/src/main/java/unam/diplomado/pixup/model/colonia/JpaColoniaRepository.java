package unam.diplomado.pixup.model.colonia;

import jakarta.ejb.Singleton;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.Collection;
import java.util.Optional;


@Stateless
public class JpaColoniaRepository implements ColoniaRepository {

    @PersistenceContext(unitName = "pixup")
    private EntityManager entityManager;

    @Override
    public Collection<Colonia> findByCp(String cp) {
        TypedQuery<Colonia> query = entityManager.createQuery("SELECT c FROM Colonia c WHERE c.cp = ?1", Colonia.class);
        query.setParameter(1, cp);
        return query.getResultList();
    }

    @Override
    public Optional<Colonia> findById(Integer id) {
        Colonia colonia = entityManager.find(Colonia.class, id);
        return colonia != null ? Optional.of(colonia) : Optional.empty();
    }

    @Override
    public Colonia saveOrUpdate(Colonia colonia) {
        entityManager.merge(colonia);
        return colonia;
    }

    @Override
    public void delete(Colonia colonia) {
        if (colonia != null) {
            entityManager.remove(colonia);
    }
    }

    @Override
    public Optional<Colonia> findByCpAndNombre(String cp, String nombre) {
        TypedQuery<Colonia> query = entityManager.createQuery(
                "SELECT c FROM Colonia c WHERE c.cp = :cp AND c.nombre = :nombre", Colonia.class);
        query.setParameter("cp", cp);
        query.setParameter("nombre", nombre);

            try {
                return Optional.of(query.getSingleResult());
            } catch (NoResultException e) {
                return Optional.empty();
            }

    }
}
