package unam.diplomado.pixup.model.disco;

import java.lang.String;
import java.util.Optional;

import jakarta.inject.Inject;
import unam.diplomado.pixup.model.artista.Artista;
import unam.diplomado.pixup.model.artista.ArtistaRepository;
import unam.diplomado.pixup.model.disquera.Disquera;
import unam.diplomado.pixup.model.disquera.DisqueraRepository;
import unam.diplomado.pixup.model.generoMusical.GeneroMusical;
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
        Optional<Disquera> disqueraOpt = disqueraRepository.findByName(disco.getDisquera().getNombre());
        Optional<Artista> artistaOpt = artistaRepository.findByName(disco.getArtista().getNombre());
        Optional<GeneroMusical> generoOpt = generoMusicalRepository.findByName(disco.getGeneroMusical().getDescripcion());
        Optional<Disco> discoOpt = discoRepository.findByTituloAndArtista(disco.getTitulo(), disco.getId());

        if (disqueraOpt.isPresent() && artistaOpt.isPresent() && generoOpt.isPresent() && !(discoOpt.isPresent())) {
            disco.setDisquera(disqueraOpt.get());
            disco.setArtista(artistaOpt.get());
            disco.setGeneroMusical(generoOpt.get());

            discoRepository.save(disco);
        } else {
            throw new IllegalArgumentException("Disquera, Artista, Genero Musical erronea");
        }

        return disco;
    }

}
