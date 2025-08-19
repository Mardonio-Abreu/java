package unam.diplomado.pixup.model.disco;

import jakarta.inject.Inject;

import unam.diplomado.pixup.model.disco.exceptions.*;
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

            if(discoRepository.findByTituloAndArtista(disco.getTitulo(), disco.getArtista().getId()).isPresent()){
                throw new DiscAlreadyExists(
                        disco.getTitulo());
            }

            if(disqueraRepository.findById(disco.getDisquera().getId()).isEmpty()){
                throw new DisqueraNotFound(disco.getDisquera().getId());
            }
            if(artistaRepository.findById(disco.getArtista().getId()).isEmpty()){
                throw new ArtistNotFound(disco.getArtista().getId());
            }
            if(generoMusicalRepository.findById(disco.getGeneroMusical().getId()).isEmpty()){
                throw new GeneroMusicalNotFound(disco.getGeneroMusical().getId());
            }

            discoRepository.save(disco);

            return disco;
        }

}
