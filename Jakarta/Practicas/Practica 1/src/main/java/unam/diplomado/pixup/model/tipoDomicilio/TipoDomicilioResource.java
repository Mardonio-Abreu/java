package unam.diplomado.pixup.model.tipoDomicilio;

import jakarta.inject.Inject;
import unam.diplomado.pixup.model.TipoDomicilio;
import unam.diplomado.pixup.model.TipoDomicilioRepository;

import java.util.Collection;

public class TipoDomicilioResource implements TipoDomicilioApi {

    @Inject
    private TipoDomicilioRepository tipoDomicilioRepository;

    @Override
    public Collection<TipoDomicilio> getAll() {
        return  tipoDomicilioRepository.findAll();
    }
}
