package unam.diplomado.pixup.model;

import unam.diplomado.pixup.model.TipoDomicilio;

import java.util.Collection;
import java.util.Optional;

public interface TipoDomicilioRepository {

    Collection<TipoDomicilio> findAll();
    Optional<TipoDomicilio> findById(Integer id);

}
