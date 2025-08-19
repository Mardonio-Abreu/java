package unam.diplomado.pixup.model.disco;

import jakarta.inject.Inject;
import unam.diplomado.pixup.model.artista.ArtistaRepository;
import unam.diplomado.pixup.model.disquera.DisqueraRepository;
import unam.diplomado.pixup.model.generoMusical.GeneroMusicalRepository;

public class DiscoServiceImpl implements DiscoService {

    @Inject
    private DisqueraRepository disqueraRepository;

    @Inject
    private ArtistaRepository artistaRepository;

    @Inject
    private GeneroMusicalRepository generoMusicalRepository;

    @Inject
    private DiscoRepository discoRepository;




    @Override
    public Disco registrarDisco(Disco disco) {
        return disco;
    }
}
